package by.gsu.lecture07.task1;

import java.util.Arrays;

import by.gsu.lecture07.task1.by.gsu.asoilab.AbstractPurchase;
import by.gsu.lecture07.task1.by.gsu.asoilab.Commodity;
import by.gsu.lecture07.task1.by.gsu.asoilab.PercentDiscountPurchase;
import by.gsu.lecture07.task1.by.gsu.asoilab.PriceDiscountPurchase;

public class Runner {

    public static void main(String[] args) {
        AbstractPurchase[] purchases = new AbstractPurchase[6];

        purchases[0] = new PriceDiscountPurchase(new Commodity("chair", 300), 2, 50);
        purchases[1] = new PriceDiscountPurchase(new Commodity("table", 500), 1, 80);
        purchases[2] = new PriceDiscountPurchase(new Commodity("lamp", 60), 3, 10);
        purchases[3] = new PercentDiscountPurchase(new Commodity("paper", 500), 20, 20);
        purchases[4] = new PercentDiscountPurchase(new Commodity("pen", 10), 5, 15);
        purchases[5] = new PercentDiscountPurchase(new Commodity("notebook", 8), 25, 10);

        System.out.println("All purchases:");
        double totalCost = 0;
        for (AbstractPurchase purchase : purchases) {
            System.out.println(purchase);
            totalCost += purchase.getCost();
        }

        System.out.println("\nTotal cost of all purchases: " + totalCost);

        Arrays.sort(purchases);

        System.out.println("\nSorted by cost ascending:");
        for (AbstractPurchase purchase : purchases) {
            System.out.println(purchase);
        }
    }
}
