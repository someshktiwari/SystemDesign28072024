package ObserverPattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> initialStockPrices = new HashMap<>();
        initialStockPrices.put("TCS", 3200.00);
        initialStockPrices.put("INFY", 1500.00);
        initialStockPrices.put("RELIANCE", 2500.00);

        StockMarketConcrete stockMarketConcrete = new StockMarketConcrete(initialStockPrices);

        Map<String, Double> investor1Thresholds = new HashMap<>();
        investor1Thresholds.put("TCS", 3100.00);
        investor1Thresholds.put("INFY", 1550.00);

        Map<String, Double> investor2Thresholds = new HashMap<>();
        investor2Thresholds.put("TCS", 3150.00);
        investor2Thresholds.put("RELIANCE", 2550.00);

        InvestorConcrete investor1 = new InvestorConcrete("Ram", investor1Thresholds);
        InvestorConcrete investor2 = new InvestorConcrete("Shyam", investor2Thresholds);

        stockMarketConcrete.subscribeInvestor(investor1);
        stockMarketConcrete.subscribeInvestor(investor2);

        stockMarketConcrete.setStockPrice("TCS", 3150.00);
        stockMarketConcrete.setStockPrice("INFY", 1570.00);
        stockMarketConcrete.setStockPrice("RELIANCE", 2570.00);
    }
}
