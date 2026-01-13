package week4.week_9;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class car extends vehicle
{
    private int doors;
    private String fuelType;
    
    public car(int vehicleID, String brand, double basePrice, int doors, String fuelType)
    {
        // parent constructor
        super(vehicleID, brand, basePrice);
        this.doors= doors;
        this.fuelType= fuelType;
        
    }
    
    public double calculateFinalPrice()
    {
        return super.basePrice + super.calculateTax()+ 0.05 * super.basePrice;
    }
}