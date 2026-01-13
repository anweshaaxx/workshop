package week4.week8;


/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    // ShoppingCart.java
    // Private attributes
    private double itemPrice;
    private int quantity;

    // Constructor to initialize attributes
    public ShoppingCart(double itemPrice, int quantity) {
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }

    // Method to calculate total price
    public double calculateTotal() {
        return itemPrice * quantity;
    }

    // Method to calculate discounted total
    public double calculateDiscountedTotal(double discountPercent) {
        double total = calculateTotal();
        double discountAmount = total * (discountPercent / 100);
        return total - discountAmount;
    }

    // Method to display cart details
    public void displayCart() {
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotal());
    }
}

