package by.gsu.lecture07.task1.by.gsu.asoilab;

public class PriceDiscountPurchase extends AbstractPurchase {

    private double discount;

    public PriceDiscountPurchase() {
        super();
    }

    public PriceDiscountPurchase(Commodity commodity, int quantity, double discount) {
        super(commodity, quantity);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getCost() {
        return (getCommodity().getPrice() - discount) * getQuantity();
    }

    @Override
    public String toString() {
        return super.toString() + ";" + discount;
    }
}
