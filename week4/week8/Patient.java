package week4.week8;


/**
 * Write a description of class Patient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Patient
{
    // Patient.java
    // Private attributes
    private String patientName;
    private int age;
    private int daysAdmitted;
    private double dailyCharge;

    // Parameterized constructor
    public Patient(String patientName, int age, int daysAdmitted, double dailyCharge) {
        this.patientName = patientName;
        this.age = age;
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    // Getter for daysAdmitted
    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    // Setter for daysAdmitted
    public void setDaysAdmitted(int daysAdmitted) {
        if (daysAdmitted >= 0) {
            this.daysAdmitted = daysAdmitted;
        } else {
            System.out.println("Days admitted cannot be negative.");
        }
    }

    // Method to calculate total bill with discount condition
    public double calculateTotalBill() {
        double totalBill = daysAdmitted * dailyCharge;
        if (daysAdmitted > 7) {
            totalBill = totalBill - (totalBill * 0.10); // 10% discount
        }
        return totalBill;
    }

    // Method to display patient details
    public void displayPatientInfo() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Daily Charge: ₹" + dailyCharge);
    }
}

