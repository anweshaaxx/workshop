package week1.week9;


/**
 * Write a description of class ContractEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContractEmployee extends Employee
{
    private int workingDays;
    private double payPerDay;

    // Constructor using super
    public ContractEmployee(int employeeId, String name, double payPerDay, int workingDays)
    {
        super(employeeId, name, 0); // basicSalary not fixed
        this.payPerDay = payPerDay;
        this.workingDays = workingDays;
    }

    public double calculateSalary()
    {
        return payPerDay * workingDays;
    }

    public void displayContractEmployee()
    {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Working Days: " + workingDays);
        System.out.println("Total Salary: " + calculateSalary());
    }
}