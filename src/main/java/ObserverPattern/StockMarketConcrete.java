package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class StockMarketConcrete implements StockMarket {
    private double stockPrice;
    private List<Investor> investors = new ArrayList<>();

    public StockMarketConcrete(double initialStockPrice) {
        this.stockPrice = initialStockPrice;
    }

    public void subscribeInvestor(Investor investor) {
        investors.add(investor);
    }

    public void unsubscribeInvestor(Investor investor) {
        investors.remove(investor);
    }

    public void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(stockPrice);
        }
    }

    @Override
    public void setStockPrice(double stockPrice) {
        if (this.stockPrice!= stockPrice) {
            this.stockPrice = stockPrice;
            notifyInvestors();
        }
    }
}
