package ObserverPattern;

public class InvestorConcrete implements Investor{
    private String name;
    private double thresholdStockValue;

    public InvestorConcrete(String name, double thresholdStockValue) {
        this.name = name;
        this.thresholdStockValue = thresholdStockValue;
    }

    @Override
    public void update(double price) {
        if (price >= thresholdStockValue) {
            System.out.println("Hi " +name + ", your stock has crossed the threshold value of " + thresholdStockValue);
        }
    }
}
