package com.oup.integration.sps.acad.saptitle.expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Expression;

public class SequenceExtractor implements Expression {
	
	private String columnName;
	
	public SequenceExtractor(String columnName) {
		super();
		this.columnName = columnName;
	}

	@Override
	public <T> T evaluate(Exchange exchange, Class<T> type) {
		List<Map> row =(ArrayList<Map>) exchange.getIn().getBody();        
     	return (T) row.get(0).get(columnName);
	}

}
