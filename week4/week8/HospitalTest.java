package week4.week8;


/**
 * Write a description of class HospitalTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalTest
{
    // HospitalTest.java
    public static void main(String[] args) {
        // Create two Patient objects
        Patient patient1 = new Patient("Anwesha", 30, 5, 2000);
        Patient patient2 = new Patient("Rohan", 45, 10, 1500);

        // Display details and calculated bill for patient1
        System.out.println("=== Patient 1 Details ===");
        patient1.displayPatientInfo();
        System.out.println("Total Bill: ₹" + patient1.calculateTotalBill());
        System.out.println();

        // Display details and calculated bill for patient2
        System.out.println("=== Patient 2 Details ===");
        patient2.displayPatientInfo();
        System.out.println("Total Bill: ₹" + patient2.calculateTotalBill());
    }
}

