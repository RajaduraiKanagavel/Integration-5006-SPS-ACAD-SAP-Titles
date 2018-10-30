package com.oup.integration.sps.acad.saptitle.routes;

import java.sql.SQLException;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.processor.aggregate.GroupedBodyAggregationStrategy;
import org.springframework.stereotype.Component;

import com.oup.integration.sps.acad.saptitle.biblio.pojo.SAPTitleBiblioGroup;
import com.oup.integration.sps.acad.saptitle.expression.SequenceExtractor;
import com.oup.integration.sps.acad.saptitle.processor.SAPTitleFileGenerationProcessor;
import com.oup.integration.sps.acad.saptitle.sap.pojo.SAPTitleSAP;

@Component
public class AC18RequestProcessorRoute extends RouteBuilder {
	
	BindyCsvDataFormat bindy = new BindyCsvDataFormat(SAPTitleSAP.class);

	@Override
	public void configure() throws Exception {
		
		onException(SQLException.class, RuntimeException.class)
			.maximumRedeliveries(3)
			.maximumRedeliveryDelay(300000)
			.log(LoggingLevel.ERROR, "Exception occurred when connecting to DB in Route ${routeId} .\n Exception Message: ${exchangeProperty.CamelExceptionCaught}")
			.setBody(simple("Exception occurred when connecting to DB in Route ${routeId} .\n Exception Message: ${exchangeProperty.CamelExceptionCaught}"))
			.to("file:{{file.backup.location}}/Error?fileName=${date:now:yyyy/MM/dd/}$simple{header.DestinationFileName}_$simple{header.RequestReceivedTime}.json");
		
		from("direct:processAC18Request")
			.routeId("processAc18RequestRoute")
			.unmarshal().json(JsonLibrary.Jackson, SAPTitleBiblioGroup.class)
		
		
		.log(LoggingLevel.INFO, "com.oup.sps", "${header.InterfaceFullName} Split Started for file ${header.DestinationFileName}")			
		.split(body(), new GroupedBodyAggregationStrategy())
			.streaming()
			.log(LoggingLevel.INFO, "com.oup.sps", "Body ${body}")
			.to("direct:ac18_transform_saptitle_biblio_to_cdm")
			.to("direct:ac18_transform_saptitle_cdm_to_sap")
		.end()
		
		.marshal(bindy)
		.log(LoggingLevel.INFO, "com.oup.sps", "Generated CSV message for ${header.InterfaceFullName} interface : ${body}")
		
		.process(new SAPTitleFileGenerationProcessor())
		
		.setBody(simple("${header.fileHeader}${body}${header.fileFooter}"))
		
		.wireTap("file:{{file.backup.location}}/2.0 SentToSAP?fileName=${date:now:yyyy/MM/dd/}$simple{header.DestinationFileName}_$simple{header.RequestReceivedTime}.dat")
		.choice()
			.when(header("Region").isEqualTo("UK"))
			
			
				.toD("ftp:{{ftp.uk.server}}:{{ftp.uk.port}}{{ftp.uk.drop.location}}?FileName=$simple{header.DestinationFileName}.dat&doneFileName=$simple{header.DestinationFileName}.go&password={{ftp.uk.password}}&username={{ftp.uk.username}}&passiveMode=true")
			/*.toD("ftp:{{ftp.us.server}}:{{ftp.us.port}}{{ftp.us.drop.location}}?FileName=$simple{header.DestinationFileName}.dat&doneFileName=$simple{header.DestinationFileName}.go&password={{ftp.us.password}}&username={{ftp.us.username}}&passiveMode=true")*/
			.when(header("Region").isEqualTo("US"))
				.toD("ftp:{{ftp.us.server}}:{{ftp.us.port}}{{ftp.us.drop.location}}?FileName=$simple{header.DestinationFileName}.dat&doneFileName=$simple{header.DestinationFileName}.go&password={{ftp.us.password}}&username={{ftp.us.username}}&passiveMode=true")
		.end()
		.log(LoggingLevel.INFO, "com.oup.sps", "${header.InterfaceFullName} file ${header.DestinationFileName} generated")
		.to("direct:UpdateFirstCostsSequenceNumber")
		.log(LoggingLevel.INFO, "com.oup.sps", "${header.InterfaceFullName} Sequence number updated");
		
		
		
		
		
		
		
	}

}
