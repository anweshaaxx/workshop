package week4.week8;


/**
 * Write a description of class EmployeeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeTest
{
    // EmployeeTest.java
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp1 = new Employee(50000); // Example basic salary

        // Print basic salary
        System.out.println("Basic Salary: " + emp1.getBasicSalary());

        // Print gross salary
        System.out.println("Gross Salary: " + emp1.calculateGrossSalary());
    }
}

