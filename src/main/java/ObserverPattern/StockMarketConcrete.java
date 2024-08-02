package ObserverPattern;

import java.util.*;

public class StockMarketConcrete implements StockMarket {
    private Map<String, Double> stockPrices = new HashMap<>();
    private List<Investor> investors = new ArrayList<>() {};

    public StockMarketConcrete(Map<String, Double> initialStockPrices) {
        this.stockPrices.putAll(initialStockPrices);
    }

    public void subscribeInvestor(Investor investor) {
        investors.add(investor);
    }

    public void unsubscribeInvestor(Investor investor) {
        investors.remove(investor);
    }

    public void notifyInvestors()
    {
        for (Investor investor : investors) {
            for (Map.Entry<String, Double> entry : stockPrices.entrySet()) {
                investor.update(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override
    public void setStockPrice(String stockTicker, double stockPrice) {
        if (!stockPrices.containsKey(stockTicker) || stockPrices.get(stockTicker)!= stockPrice) {
            stockPrices.put(stockTicker, stockPrice);
            notifyInvestors();
        }
    }
}
