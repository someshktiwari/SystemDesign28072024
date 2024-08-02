package ObserverPattern;

public class Main {
    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarketConcrete(100.0);

        Investor investor1 = new InvestorConcrete("Alice", 105.0);
        Investor investor2 = new InvestorConcrete("Bob", 109.0);

        stockMarket.subscribeInvestor(investor1);
        stockMarket.subscribeInvestor(investor2);


        stockMarket.setStockPrice(105.0);
        stockMarket.setStockPrice(110.0);

        stockMarket.unsubscribeInvestor(investor1);
        stockMarket.setStockPrice(115.0);
        stockMarket.subscribeInvestor(investor1);
        stockMarket.setStockPrice(105.0);
    }
}
