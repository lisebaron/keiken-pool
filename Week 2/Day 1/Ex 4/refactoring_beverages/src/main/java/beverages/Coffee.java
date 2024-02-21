package beverages;

import supplement.Supplement;

import java.util.ArrayList;
import java.util.List;

public class Coffee implements Beverage {
    private final double BASE_PRICE = 1.2;
    private double price = BASE_PRICE;
    private List<Supplement> supplements = new ArrayList<>();

    public Coffee() {
    }

    public void addSupplement(Supplement supplement) {
        this.supplements.add(supplement);
    }

    public double getBasePrice() {
        return this.BASE_PRICE;
    }

    @Override
    public double price() {
        for (Supplement supp: this.supplements) {
            price = price + supp.getPrice();
        }
        return price;
    }
}
