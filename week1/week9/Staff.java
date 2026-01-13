package week1.week9;


/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff extends Person
{
    private double bonus;

    public Staff(int id, String name, double basicSalary, double bonus)
    {
        super(id, name, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateAnnualSalary()
    {
        return super.calculateAnnualSalary() + bonus;
    }

    public void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("College: " + collegeName);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
}