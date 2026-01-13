package week4.week8;


/**
 * Write a description of class BillApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BillApp
{
    // BillApp.java
    public static void main(String[] args) {
        // Create an ElectricityBill object
        ElectricityBill bill1 = new ElectricityBill("Anwesha", 150);

        // Display the bill
        bill1.displayBill();

        System.out.println();

        // Update units consumed
        bill1.setUnitsConsumed(90);
        System.out.println("Updated Bill:");
        bill1.displayBill();
    }
}

