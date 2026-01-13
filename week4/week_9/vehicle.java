package week4.week_9;


/**
 * Write a description of class vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class vehicle
{
    protected int vehicleID;
    protected String brand;
    protected double basePrice;
    
    public vehicle(int vehicleID, String band, double basePrice)
    {
        this.vehicleID= vehicleID;
        this.brand= brand;
        this.basePrice= basePrice;
    }
    
    public void displayvehicleInfo()
    {
        System.out.println("vehicle ID: "+ this.vehicleID);
        System.out.println("Brand : "+ this.brand);
        System.out.println("Base Price: "+ this.basePrice);
    }
    
    double calculateTax()
    {
        return 0.10 * this.basePrice;
    }
}