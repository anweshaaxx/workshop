package week4;


/**
 * Write a description of class Employee_Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee_Salary
{
    private double basicSalary;
    
    public Employee_Salary(double basicSalary)
    {
        this.basicSalary= basicSalary;
    }
    
    // getters and setters methods
    
    public void setBasicSalary(double basicSal)
    {
        this.basicSalary= basicSal;
    }
    
    public double getBasicSalary()
    {
        return this.basicSalary;
    }
    
    public double calculateGrossSalary()
    {
        double bonus= 0.20 *this.basicSalary;
        return this.basicSalary+ bonus;
    }
    
    public void displayEmployee_Salary()
    {
        System.out.println("Basic Salary: "+ getBasicSalary());
        double grossSalary= calculateGrossSalary();
        System.out.println("Gross Salary: "+ grossSalary);
    }
}