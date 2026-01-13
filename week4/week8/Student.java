package week4.week8;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // Student.java
    // Private attributes
    private int id;
    private String name;
    private String address;
    private long phoneNumber;
    private static String collegeName = "ABC College"; // Static attribute

    // Parameterized constructor
    public Student(int id, String name, String address, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("College Name: " + collegeName);
    }
}

