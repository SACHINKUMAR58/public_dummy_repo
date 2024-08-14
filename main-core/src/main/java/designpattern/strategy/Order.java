package designpattern.strategy;

public class Order {
    private final String customer;
    private double totalAmount;
    private String discountType;

    public Order(String customer, double totalAmount, String discountType) {
        this.customer = customer;
        this.totalAmount = totalAmount;
        this.discountType = discountType;
    }

    public double calculateTotalAmount() {
        double discount = 0.0;

        // Handling different discount types without using a design pattern
        if (discountType.equals("SEASONAL")) {
            discount = totalAmount * 0.10;
        } else if (discountType.equals("LOYALTY")) {
            discount = totalAmount * 0.15;
        } else if (discountType.equals("NONE")) {
            discount = 0.0;
        } else {
            throw new IllegalArgumentException("Invalid discount type");
        }

        return totalAmount - discount;
    }

    @Override
    public String toString() {
        return "Order for " + customer + " with total amount: $" + calculateTotalAmount();
    }

    public static void main(String[] args) {
        Order order1 = new Order("John Doe", 100.0, "SEASONAL");
        Order order2 = new Order("Jane Smith", 200.0, "LOYALTY");
        Order order3 = new Order("Jim Brown", 300.0, "NONE");

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
    }
}

