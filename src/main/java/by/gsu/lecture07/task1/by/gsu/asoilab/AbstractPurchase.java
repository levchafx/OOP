package by.gsu.lecture07.task1.by.gsu.asoilab;

public abstract class AbstractPurchase implements Comparable<AbstractPurchase> {

    private Commodity commodity;
    private int quantity;

    public AbstractPurchase() {
    }

    public AbstractPurchase(Commodity commodity, int quantity) {
        this.commodity = commodity;
        this.quantity = quantity;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double getCost();

    @Override
    public String toString() {
        return commodity + ";" + quantity + ";" + getCost();
    }

    @Override
    public int compareTo(AbstractPurchase purchase) {
        return Double.compare(this.getCost(), purchase.getCost());
    }
}
