package net.bk.aggregrators;

import net.bk.data.Trade;
import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import java.util.ArrayList;
import java.util.List;

public class TradeAggregrator implements AggregationStrategy {



    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

        List<Trade> collectionBody = null;


        if (oldExchange == null) {
            Trade newBody = newExchange.getIn().getBody(Trade.class);
            collectionBody = new ArrayList<>();
            collectionBody.add(newBody);
            newExchange.getIn().setBody(collectionBody);
            return newExchange;
        }

        Object oldBody = oldExchange.getIn().getBody();
        if (oldBody instanceof Trade) {
            Trade body = oldExchange.getIn().getBody(Trade.class);
            collectionBody = new ArrayList<>();
            collectionBody.add(body);
        } else if (oldBody instanceof List) {
            collectionBody = oldExchange.getIn().getBody(List.class);
        }

        Trade newBody = newExchange.getIn().getBody(Trade.class);
        if (collectionBody != null) {
            collectionBody.add(newBody);
            oldExchange.getIn().setBody(collectionBody);
        }


        return oldExchange;
    }
}
