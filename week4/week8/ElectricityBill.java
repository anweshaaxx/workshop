package week4.week8;


/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill
{
    // ElectricityBill.java
    // Private attributes
    private String consumerName;
    private int unitsConsumed;

    // Constructor to initialize values
    public ElectricityBill(String consumerName, int unitsConsumed) {
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    // Getter for unitsConsumed
    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    // Setter for unitsConsumed
    public void setUnitsConsumed(int unitsConsumed) {
        if (unitsConsumed >= 0) {
            this.unitsConsumed = unitsConsumed;
        } else {
            System.out.println("Units consumed cannot be negative.");
        }
    }

    // Method to calculate bill
    public double calculateBill() {
        double billAmount;
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5; // ₹5 per unit for first 100 units
        } else {
            billAmount = 100 * 5 + (unitsConsumed - 100) * 8; // ₹8 per unit for remaining units
        }
        return billAmount;
    }

    // Method to display consumer info and bill
    public void displayBill() {
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount: ₹" + calculateBill());
    }
}

