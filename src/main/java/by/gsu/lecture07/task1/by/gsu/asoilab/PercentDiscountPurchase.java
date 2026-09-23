package by.gsu.lecture07.task1.by.gsu.asoilab;

public class PercentDiscountPurchase extends AbstractPurchase {

    private static final int QUANTITY_THRESHOLD = 15;

    private double discountPercent;

    public PercentDiscountPurchase() {
        super();
    }

    public PercentDiscountPurchase(Commodity commodity, int quantity, double discountPercent) {
        super(commodity, quantity);
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
        double price = getCommodity().getPrice();
        int quantity = getQuantity();
        if (quantity > QUANTITY_THRESHOLD) {
            return Math.round(price * quantity * (1 - discountPercent / 100));
        }
        return price * quantity;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + discountPercent;
    }
}
