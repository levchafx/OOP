package by.gsu.lecture06.task3.by.gsu.asoilab;

public class PriceDiscountPurchase extends Purchase {

    private double discount;

    public PriceDiscountPurchase() {
        super();
    }

    public PriceDiscountPurchase(String itemName, double price, int quantity, double discount) {
        super(itemName, price, quantity);
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
        return (getPrice() - discount) * getQuantity();
    }

    @Override
    public String toString() {
        return super.toString() + ";" + discount;
    }
}
