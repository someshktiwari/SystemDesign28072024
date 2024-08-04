package ObserverPattern;

import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class StockPriceGenerator {
    private double minPrice;
    private double maxPrice;
    private Random random;

    public StockPriceGenerator(double minPrice, double maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.random = new Random();
    }

    public double generateRandomPrice() {
        double randomPrice = minPrice + (maxPrice - minPrice) * random.nextDouble();

        BigDecimal bd = new BigDecimal(randomPrice);
        bd = bd.setScale(2, RoundingMode.HALF_UP);

        return bd.doubleValue();
    }


}
