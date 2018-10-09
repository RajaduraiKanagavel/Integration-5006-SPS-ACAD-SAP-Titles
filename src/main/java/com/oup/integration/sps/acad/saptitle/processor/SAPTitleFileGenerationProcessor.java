package com.oup.integration.sps.acad.saptitle.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class SAPTitleFileGenerationProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		String sequenceNumber = exchange.getIn().getHeader("SequenceNumber", String.class);
		String interfaceName = exchange.getIn().getHeader("InterfaceName", String.class);
		String dateAsString = exchange.getIn().getHeader("RequestDate", String.class);
		String timeAsString = exchange.getIn().getHeader("RequestTime", String.class); 
		String inputBody=exchange.getIn().getBody(String.class);
		
		String fileHeader=interfaceName+String.format("%04d",Integer.parseInt(sequenceNumber))+" "+dateAsString+" "+timeAsString+",,,,"+"\n";
		
		String fileFooter= "ZZRC="+String.format("%09d", inputBody.split("[\n]").length+2)+",,,,"+"\n";

		exchange.getOut().setHeaders(exchange.getIn().getHeaders());		

		exchange.getOut().setHeader("FileHeader", fileHeader);
		exchange.getOut().setHeader("FileFooter", fileFooter);
		exchange.getOut().setBody(exchange.getIn().getBody());
		
	}

}
