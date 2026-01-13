package week4.week8;


/**
 * Write a description of class ShoppingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingApp
{
    // ShoppingApp.java
    public static void main(String[] args) {
        // Create a ShoppingCart object
        ShoppingCart cart = new ShoppingCart(1500.0, 3);

        // Display cart details
        System.out.println("=== Cart Details ===");
        cart.displayCart();
        System.out.println();

        // Get and set quantity
        System.out.println("Current quantity: " + cart.getQuantity());
        cart.setQuantity(5);
        System.out.println("Updated quantity: " + cart.getQuantity());
        System.out.println("Updated total: " + cart.calculateTotal());
        System.out.println();

        // Calculate discounted total (festival offer)
        double discount = 10; // 10% discount
        double discountedTotal = cart.calculateDiscountedTotal(discount);
        System.out.println("Discounted Total (" + discount + "% off): " + discountedTotal);
    }
}

