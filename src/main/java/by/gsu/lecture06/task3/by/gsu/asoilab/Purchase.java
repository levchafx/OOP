package by.gsu.lecture06.task3.by.gsu.asoilab;

public class Purchase {

    private String itemName;
    private double price;
    private int quantity;

    public Purchase() {
    }

    public Purchase(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return itemName + ";" + price + ";" + quantity + ";" + getCost();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase other = (Purchase) obj;
        return Double.compare(price, other.getPrice()) == 0
                && this.itemName != null && this.itemName.equals(other.getItemName());
    }
}
