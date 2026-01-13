package week1.week9;


/**
 * Write a description of class PermanentEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PermanentEmployee extends Employee
{
    private double allowance;

    // Constructor using super
    public PermanentEmployee(int employeeId, String name, double basicSalary, double allowance)
    {
        super(employeeId, name, basicSalary);
        this.allowance = allowance;
    }

    public void displayPermanentEmployee()
    {
        super.displayEmployee();
        System.out.println("Allowance: " + allowance);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + (basicSalary + allowance + calculateBonus()));
    }
}