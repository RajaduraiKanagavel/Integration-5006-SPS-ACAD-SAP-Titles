package com.oup.integration.sps.acad.saptitle.strategy.aggregation;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.json.JSONArray;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BiblioAggregationStrategy implements AggregationStrategy {

	protected Logger LOGGER = LoggerFactory.getLogger(getClass());

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

		Exchange exchange = oldExchange == null ? newExchange : oldExchange;
		String body = null;
		JSONArray bodyJsonArray = new JSONArray();
		try {
			body = newExchange.getIn().getBody(String.class);
			bodyJsonArray = new JSONArray(body);
		} catch (JSONException e) {
			exchange.setProperty("ErrorOccured", "true");
			LOGGER.error("Error occured while aggregating Biblio Json message : " + body + ", Exception Message :" + e);
		}

		if (oldExchange == null) {
			newExchange.getIn().setBody(bodyJsonArray);
		} else {
			JSONArray list = oldExchange.getIn().getBody(JSONArray.class);
			for (int i = 0; i < bodyJsonArray.length(); i++) {
				list.put(bodyJsonArray.getJSONObject(i));
			}
			oldExchange.getIn().setBody(list);
		}

		return exchange;
	}

}