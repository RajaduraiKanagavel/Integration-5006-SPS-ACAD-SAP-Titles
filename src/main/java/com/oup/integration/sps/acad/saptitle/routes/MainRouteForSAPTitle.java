package com.oup.integration.sps.acad.saptitle.routes;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.file.GenericFileOperationFailedException;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.processor.aggregate.GroupedBodyAggregationStrategy;
import org.springframework.stereotype.Component;

import com.google.gson.JsonSyntaxException;
import com.oup.integration.sps.acad.saptitle.biblio.pojo.SAPTitleBiblioGroup;
import com.oup.integration.sps.acad.saptitle.processor.SAPTitleFileGenerationProcessor;
import com.oup.integration.sps.acad.saptitle.sap.pojo.SAPTitleSAP;

@Component
public class MainRouteForSAPTitle extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		BindyCsvDataFormat bindy = new BindyCsvDataFormat(SAPTitleSAP.class);
		
		onException(JsonSyntaxException.class, IllegalStateException.class, NullPointerException.class)
			.maximumRedeliveries(0)
			.log(LoggingLevel.ERROR, "com.oup.sps", "Exceptions due to data issues in the ${header.InterfaceFullName} message processing in Route ${routeId} .\n Exception Message: ${exchangeProperty.CamelExceptionCaught}")
			.setBody(simple("Exceptions due to data issues in the ${header.InterfaceFullName} message processing in Route ${routeId} .\\n Exception Message: ${exchangeProperty.CamelExceptionCaught}"))
			.to("file:{{file.backup.location}}/Error?fileName=${date:now:yyyy/MM/dd/}$simple{header.InterfaceName}_$simple{header.RequestReceivedTime}.json&fileExist=Append");
			
		onException(IOException.class, GenericFileOperationFailedException.class, FileSystemException.class, FileAlreadyExistsException.class)
			.maximumRedeliveries(3)
			.maximumRedeliveryDelay(300000)
			.log(LoggingLevel.ERROR, "com.oup.sps", "Exception due to IO operations in ${header.InterfaceFullName} message processing in Route ${routeId} .\\n Exception Message: ${exchangeProperty.CamelExceptionCaught}")
			.setBody(simple("Exception due to IO operations in ${header.InterfaceFullName} message processing in Route ${routeId} .\\n Exception Message: ${exchangeProperty.CamelExceptionCaught}"))
			.to("file:{{file.backup.location}}/Error?fileName=${date:now:yyyy/MM/dd/}$simple{header.InterfaceName}_$simple{header.RequestReceivedTime}.json&fileExist=Append");
		
		onException(Exception.class)
			.maximumRedeliveries(0)
			.log(LoggingLevel.ERROR, "com.oup.sps", "Exception occurred in ${header.InterfaceFullName} message processing in Route ${routeId} .\\n Exception Message: ${exchangeProperty.CamelExceptionCaught}")
			.setBody(simple("Exception occurred in ${header.InterfaceFullName} message processing in Route ${routeId}.\\n Exception Message: ${exchangeProperty.CamelExceptionCaught}"))
			.to("file:{{file.backup.location}}/Error?fileName=${date:now:yyyy/MM/dd/}$simple{header.InterfaceName}_$simple{header.RequestReceivedTime}.json&fileExist=Append");
		
		from("direct:ReceivedSAPTitleAggregatedMessage")
			.routeId("mainRouteForSAPTitle")
			.log(LoggingLevel.INFO, "com.oup.sps", "Received Aggregated ${header.InterfaceFullName} Message ${body}")
			.setProperty("InputBody", simple("${body}"))
			.convertBodyTo(String.class)
			.wireTap("file:{{file.backup.location}}/1.0 ReceivedFromBiblio?fileName=${date:now:yyyy/MM/dd/}$simple{header.InterfaceName}_$simple{header.RequestReceivedTime}.dat")
			
			.choice()
				.when(header("Region").isEqualTo("UK"))
					.to("controlbus:route?async=true&routeId=SAPTitleSchedulerRouteUK&action=stop")
				.when(header("Region").isEqualTo("US"))
					.to("controlbus:route?async=true&routeId=firstCostSchedulerRouteUS&action=stop")
			.end()
			.to("direct:GetFirstCostsLatestSequenceNumber")
			.log(LoggingLevel.INFO, "com.oup.sps", "Current ${header.InterfaceFullName} Sequence Number being processed : ${header.SequenceNumber}")
			.setHeader("DestinationFileName", simple("${header.InterfaceName}${header.SequenceNumber}"))
			.setBody(simple("${property.InputBody}"))
			.convertBodyTo(String.class)
			
			
			.choice()
			.when(header("Region").isEqualTo("UK"))
				.to("direct:processAC18Request")
			.when(header("Region").isEqualTo("US"))
			.to("direct:processUS18Request")
		.end();
			
			
				
	}

}
