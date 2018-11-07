package com.oup.integration.sps.acad.saptitle.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.oup.integration.sps.acad.saptitle.strategy.aggregation.BiblioAggregationStrategy;

@Component("SAPTitleSchedulerRouteUK")
public class SAPTitleSchedulerRouteUK extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("activemq:{{activemq.uk.queuename}}")
			.routeId("SAPTitleSchedulerRouteUK")
			/*.autoStartup(false)
			.routePolicyRef("startPolicyUK")*/
			
			
			
			.log(LoggingLevel.INFO, "com.oup.sps", "Adding UK SAPTitle Message--- ${body}")
			.aggregate(new BiblioAggregationStrategy())
			.constant(true)
			.completionTimeout(30000)
			.setHeader("RequestDate", simple("${date:now:ddMMyyyy}"))
			.setHeader("RequestTime", simple("${date:now:HHmmss}"))
			.setHeader("RequestReceivedTime", simple("${date:now:HHmmssSSS}"))
			.setHeader("InterfaceName", simple("ac18"))
			.setHeader("Region", simple("UK"))
			.setHeader("InterfaceFullName", simple("ACAD AC18 SAPTitle"))
			.choice()
				.when(simple("${property.ErrorOccured} == 'true'"))
					.log(LoggingLevel.ERROR, "com.oup.sps", "Exception occurred while aggregating the Biblio json message in $simple{header.InterfaceName} interface.The application processing has been terminated")
					.to("controlbus:route?async=true&routeId=SAPTitleSchedulerRouteUK&action=stop")
					.convertBodyTo(String.class)
					.to("file:{{file.backup.location}}/Error?fileName=${date:now:yyyy/MM/dd/}$simple{header.InterfaceName}_$simple{header.RequestReceivedTime}.json&fileExist=Append")
				.otherwise()					
					.to("direct:ReceivedSAPTitleAggregatedMessage")
			.end();
	}

}
