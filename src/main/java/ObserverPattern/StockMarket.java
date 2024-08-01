package ObserverPattern;

public interface StockMarket {

    public void subscribeInvestor(Investor investor);
    public void unsubscribeInvestor(Investor investor);
    public void notifyInvestors();
    public void setStockPrice(double stockPrice);
}
