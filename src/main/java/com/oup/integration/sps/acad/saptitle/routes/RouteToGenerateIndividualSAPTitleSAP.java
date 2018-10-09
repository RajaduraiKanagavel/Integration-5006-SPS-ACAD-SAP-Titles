package com.oup.integration.sps.acad.saptitle.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.google.gson.JsonSyntaxException;
import com.oup.integration.sps.acad.saptitle.cdm.pojo.SAPTitleCDM;
import com.oup.integration.sps.acad.saptitle.cdm.pojo.SAPTitleCDMUS18;

@Component
public class RouteToGenerateIndividualSAPTitleSAP extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		onException(JsonSyntaxException.class, IllegalStateException.class, NullPointerException.class)
				.maximumRedeliveries(0)
				.log(LoggingLevel.ERROR, "com.oup.sps",
						"Exceptions due to data issues in the file processing in ${routeId} .\n Exception Message: ${exchangeProperty.CamelExceptionCaught}")
				.setBody(simple(
						"Exceptions due to data issues in the file processing in ${routeId} .\n Exception Message: ${exchangeProperty.CamelExceptionCaught}"))
				.to("file:{{file.backup.location}}/Error?fileName=${date:now:yyyy/MM/dd/}$simple{header.DestinationFileName}_$simple{header.RequestReceivedTime}.json");

		onException(Exception.class).maximumRedeliveries(0).log(LoggingLevel.ERROR, "com.oup.sps",
				"Exception occurred while processing messages in ${routeId} Exception Message: ${exchangeProperty.CamelExceptionCaught}")
				.setBody(simple(
						"Exception occurred while processing messages in ${routeId} Exception Message: ${exchangeProperty.CamelExceptionCaught}"))
				.to("file:{{file.backup.location}}/Error?fileName=${date:now:yyyy/MM/dd/}$simple{header.DestinationFileName}_$simple{header.RequestReceivedTime}.json");

		from("direct:ac18_transform_saptitle_cdm_to_sap").routeId("routeToGenerateIndividualSAPTitleSAP")

				.setProperty("InputBody2", simple("${body}"))
				.setHeader("BiblioFormatIdentifier", simple("${body.getProductTrimPage()}"))
				.setHeader("BiblioBinding", simple("${body.getBinding()}"))
				.setHeader("bindType", simple("${body.getBindType()}"))

				.to("sql:SELECT * FROM tbl_metadata_titles_ismformat WHERE BiblioFormatIdentifier=:#BiblioFormatIdentifier?dataSource=dataSource")

				.log(LoggingLevel.INFO, "com.oup.sps", "DB Data  --- ${body}")
				.setHeader("SAPFormatIdentifier", simple("${body.get(0).get(SAPFormatIdentifier)}"))

				.setBody(simple("${property.InputBody2}")).process(e -> {

					com.oup.integration.sps.acad.saptitle.cdm.pojo.SAPTitleCDM obj = (SAPTitleCDM) e.getIn().getBody();

					obj.setProductTrimPage(e.getIn().getHeader("SAPFormatIdentifier").toString());

					if (obj.getFinish().equals("Gloss Lamination")) {
						obj.setFinish("Gloss Lamination");

					} else if (obj.getFinish().equals("Matt Lamination"))

				{

						obj.setFinish("Matt Lamination");
					} else {
						obj.setFinish("");

					}

					if (obj.getBinding().equals("Flexicover")) {

						obj.setBinding("Flexicover");
					}

				else if (obj.getBinding().equals("Paperback")) {

						obj.setBinding("Cover");
					} else if (obj.getBinding().equals("Paperback with Flaps")) {

						obj.setBinding("Cover with Flaps");
					}

				else if (obj.getBinding().equals("Hardback")) {

						obj.setBinding("Jacket");
					}

				else if (obj.getBinding().equals("Self Cover")) {

						obj.setBinding("Self Covered");
					}

				else if (obj.getBinding().equals("?")) {

						obj.setBinding("Paper laminated case");
					}

					if (obj.getPlatesExist() != "Y") {
						obj.setPlatePagesColour("");
						obj.setPlatePagesCount("");
						obj.setPlatePagesPosition("");

					}

				})

				.to("dozer:SAPTitle_CDM_To_SAP_Transformation?sourceModel=com.oup.integration.sps.acad.saptitle.cdm.pojo.SAPTitleCDM&targetModel=com.oup.integration.sps.acad.saptitle.sap.pojo.SAPTitleSAP&mappingFile=Transformations/SAPTitle_CDM_To_SAP_Transformation.xml");

		from("direct:us18_transform_saptitle_cdm_to_sap").routeId("US18routeToGenerateIndividualSAPTitleSAP").process(e -> {

			com.oup.integration.sps.acad.saptitle.cdm.pojo.SAPTitleCDMUS18 obj = (SAPTitleCDMUS18) e.getIn().getBody();

			if (obj.getIsTitleNegotiated().equals("True")) {
				obj.setIsTitleNegotiated("X");
			} else {

				obj.setIsTitleNegotiated(" ");

			}
			if (obj.getCatalog().equals("True")) {
				obj.setCatalog("X");
			} else {

				obj.setCatalog(" ");

			}
			
		

		})
		
		.to("dozer:US18SAPTitle_CDM_To_SAP_Transformation?sourceModel=com.oup.integration.sps.acad.saptitle.cdm.pojo.SAPTitleCDMUS18&targetModel=com.oup.integration.sps.acad.saptitle.sap.pojo.SAPTitleSAPUS18&mappingFile=Transformations/US18SAPTitle_CDM_To_SAP_Transformation.xml")
		;
	}

}
