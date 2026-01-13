package week1.week9;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
  private int numberOfDoors;

    public Car(int vehicleId, String brand, double basePrice, int numberOfDoors) {
        super(vehicleId, brand, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayCarInfo() {
        super.displayVehicleInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Tax: " + calculateTax());
    }    
}