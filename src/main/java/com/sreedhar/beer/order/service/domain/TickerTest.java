package com.sreedhar.beer.order.service.domain;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TickerTest {

    public class Ticker {
        private final String product;
        private final double price;

        public Ticker(String product, double price) {
            this.product = product;
            this.price = price;
        }


        public String getProduct() {
            return this.product;
        }

        public double getPrice() {
            return this.price;
        }
    }

    private Map<String, Ticker> tickerMap = new LinkedHashMap<>();

    public void put(Ticker ticker) {
        tickerMap.put(ticker.getProduct(), ticker);
    }

    public Ticker get() {
        Set<Map.Entry<String, Ticker>> entries = tickerMap.entrySet();
        Ticker lastTicker = null;
        for (Map.Entry<String, Ticker> entry : entries) {
            lastTicker = entry.getValue();
        }

        tickerMap.remove(lastTicker.getProduct());
        return lastTicker;
    }
}
