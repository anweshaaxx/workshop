package week1.week9;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
     protected int employeeId;
    protected String name;
    protected double basicSalary;

    // Constructor
    public Employee(int employeeId, String name, double basicSalary)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Calculate bonus (10% of basic salary)
    public double calculateBonus()
    {
        return basicSalary * 0.10;
    }

    // Display employee details
    public void displayEmployee()
    {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}