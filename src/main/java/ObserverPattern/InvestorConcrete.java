package ObserverPattern;
import java.util.*;

public class InvestorConcrete implements Investor{
    private String name;
    private Map<String, Double> stockThresholds = new HashMap<>();

    public InvestorConcrete(String name, Map<String, Double> stockThresholds) {
        this.name = name;
        this.stockThresholds.putAll(stockThresholds);
    }

    @Override
    public void update(String stockTicker,double price) {
        if (stockThresholds.containsKey(stockTicker) && price >= stockThresholds.get(stockTicker)) {
            System.out.println(name + " has received an update for " + stockTicker + ". Stock price: " + price);
        }
    }
}
