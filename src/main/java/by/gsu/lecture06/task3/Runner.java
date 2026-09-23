package by.gsu.lecture06.task3;

import by.gsu.lecture06.task3.by.gsu.asoilab.PriceDiscountPurchase;
import by.gsu.lecture06.task3.by.gsu.asoilab.Purchase;
import by.gsu.lecture06.task3.by.gsu.asoilab.QuantityDiscountPurchase;

public class Runner {

    public static void main(String[] args) {
        Purchase[] purchases = new Purchase[6];
        purchases[0] = new Purchase("bread", 3.5, 4);
        purchases[1] = new Purchase("milk", 4.2, 3);
        purchases[2] = new PriceDiscountPurchase("chair", 300, 2, 50);
        purchases[3] = new PriceDiscountPurchase("table", 500, 1, 80);
        purchases[4] = new QuantityDiscountPurchase("paper", 500, 20, 5.825);
        purchases[5] = new QuantityDiscountPurchase("pen", 10, 5, 10);

        String targetName = "bread";
        double targetPrice = 3.5;
        if (args.length > 0) {
            targetName = args[0];
        }
        if (args.length > 1) {
            targetPrice = Double.parseDouble(args[1]);
        }
        Purchase target = new Purchase(targetName, targetPrice, 0);

        double maxCost = Double.MIN_VALUE;
        double totalCost = 0;
        int equalCount = 0;

        for (Purchase purchase : purchases) {
            System.out.println(purchase);

            double cost = purchase.getCost();
            if (cost > maxCost) {
                maxCost = cost;
            }
            totalCost += cost;
            if (purchase.equals(target)) {
                equalCount++;
            }
        }

        System.out.println("\nMax purchase cost: " + maxCost);
        System.out.println("Purchases equal to (" + targetName + ";" + targetPrice + "): " + equalCount);
        System.out.println("Total cost of all purchases: " + totalCost);
    }
}
