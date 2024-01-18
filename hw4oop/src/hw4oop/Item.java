package hw4oop;

public abstract class Item {
    protected String itemName;
    protected double price;

    public Item(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public abstract double calculateTotalSales();
}

