package com.oup.integration.sps.acad.saptitle.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.google.gson.JsonSyntaxException;

@Component
public class RouteToGenerateIndividualSAPTitleCDM  extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		onException(JsonSyntaxException.class, IllegalStateException.class, NullPointerException.class)
			.maximumRedeliveries(0)
			.log(LoggingLevel.ERROR, "com.oup.sps", "Exceptions due to data issues in the file processing in Route ${routeId} .\n Exception Message: ${exchangeProperty.CamelExceptionCaught}")
			.setBody(simple("Exceptions due to data issues in the file processing in ${routeId} .\n Exception Message: ${exchangeProperty.CamelExceptionCaught}"))
			.to("file:{{file.backup.location}}/Error?fileName=${date:now:yyyy/MM/dd/}$simple{header.DestinationFileName}_$simple{header.RequestReceivedTime}.json");
			
		onException(Exception.class)
			.maximumRedeliveries(0)
			.log(LoggingLevel.ERROR, "com.oup.sps", "Exception occurred while processing messages in Route ${routeId} Exception Message: ${exchangeProperty.CamelExceptionCaught}")
			.setBody(simple("Exception occurred while processing messages in ${routeId} .\n Exception Message: ${exchangeProperty.CamelExceptionCaught}"))
			.to("file:{{file.backup.location}}/Error?fileName=${date:now:yyyy/MM/dd/}$simple{header.DestinationFileName}_$simple{header.RequestReceivedTime}.json");

		
		from("direct:ac18_transform_saptitle_biblio_to_cdm")
			.routeId("ac18_routeToGenerateIndividualsaptitleCDM")
			.to("dozer:SapTile_Biblio_To_CDM_Transformation?sourceModel=com.oup.integration.sps.acad.saptitle.biblio.pojo.SAPTitleBiblio&targetModel=com.oup.integration.sps.acad.saptitle.cdm.pojo.SAPTitleCDM&mappingFile=Transformations/SapTitle_Biblio_To_CDM_Transformation.xml");
			
		
		from("direct:us18_transform_saptitle_biblio_to_cdm")
		.routeId("us18_routeToGenerateIndividualsaptitleCDM")
		.to("dozer:US18_SapTile_Biblio_To_CDM_Transformation?sourceModel=com.oup.integration.sps.acad.saptitle.biblio.pojo.SAPTitleBiblioUS18&targetModel=com.oup.integration.sps.acad.saptitle.cdm.pojo.SAPTitleCDMUS18&mappingFile=Transformations/US18SapTitle_Biblio_To_CDM_Transformation.xml");
					
	}

}
