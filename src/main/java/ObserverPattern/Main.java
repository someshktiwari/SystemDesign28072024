package ObserverPattern;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StockPriceGenerator priceGenerator = new StockPriceGenerator(1000.00, 3500.00);

        Map<String, Double> initialStockPrices = new HashMap<>();
        initialStockPrices.put("TCS", priceGenerator.generateRandomPrice());
        initialStockPrices.put("INFY", priceGenerator.generateRandomPrice());
        initialStockPrices.put("RELIANCE", priceGenerator.generateRandomPrice());

        StockMarketConcrete stockMarketConcrete = new StockMarketConcrete(initialStockPrices);

        Map<String, Double> investor1Thresholds = new HashMap<>();
        investor1Thresholds.put("TCS", 3100.00);
        investor1Thresholds.put("INFY", 1550.00);

        Map<String, Double> investor2Thresholds = new HashMap<>();
        investor2Thresholds.put("RELIANCE", 2550.00);

        InvestorConcrete investor1 = new InvestorConcrete("Ram", investor1Thresholds);
        InvestorConcrete investor2 = new InvestorConcrete("Shyam", investor2Thresholds);

        stockMarketConcrete.subscribeInvestor(investor1);
        stockMarketConcrete.subscribeInvestor(investor2);

        stockMarketConcrete.setStockPrice("TCS", priceGenerator.generateRandomPrice());
        stockMarketConcrete.setStockPrice("INFY", priceGenerator.generateRandomPrice());
        stockMarketConcrete.setStockPrice("RELIANCE", priceGenerator.generateRandomPrice());
    }
}
