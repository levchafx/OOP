package by.gsu.lecture06.task3.by.gsu.asoilab;

public class QuantityDiscountPurchase extends Purchase {

    private static final int QUANTITY_THRESHOLD = 15;

    private double discountPercent;

    public QuantityDiscountPurchase() {
        super();
    }

    public QuantityDiscountPurchase(String itemName, double price, int quantity, double discountPercent) {
        super(itemName, price, quantity);
        this.discountPercent = discountPercent;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public double getCost() {
        if (getQuantity() > QUANTITY_THRESHOLD) {
            return Math.round(getPrice() * getQuantity() * (1 - discountPercent / 100));
        }
        return super.getCost();
    }

    @Override
    public String toString() {
        return super.toString() + ";" + discountPercent;
    }
}
