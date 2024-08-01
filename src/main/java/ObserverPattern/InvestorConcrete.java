package ObserverPattern;

public class InvestorConcrete implements Investor{
    private String name;

    public InvestorConcrete(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println(name + " has received an update. Stock price: " + price);
    }
}
