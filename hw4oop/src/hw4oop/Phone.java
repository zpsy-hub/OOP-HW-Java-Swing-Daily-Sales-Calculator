package hw4oop;

public class Phone extends Item {
    private int quantitySold;

    public Phone(String itemName, double price, int quantitySold) {
        super(itemName, price);
        this.quantitySold = quantitySold;
    }

    @Override
    public double calculateTotalSales() {
        return price * quantitySold;
    }
}

