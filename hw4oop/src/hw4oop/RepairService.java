package hw4oop;

public class RepairService extends Item {
    private int hours;

    public RepairService(String itemName, double price, int hours) {
        super(itemName, price);
        this.hours = hours;
    }

    @Override
    public double calculateTotalSales() {
        return price * hours;
    }
}

