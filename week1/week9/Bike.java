package week1.week9;


/**
 * Write a description of class Bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends Vehicle
{
    private boolean hasGear;

    public Bike(int vehicleId, String brand, double basePrice, boolean hasGear) {
        super(vehicleId, brand, basePrice);
        this.hasGear = hasGear;
    }

    public void displayBikeInfo() {
        super.displayVehicleInfo();
        System.out.println("Has Gear: " + hasGear);
        System.out.println("Tax: " + calculateTax());
    }
}