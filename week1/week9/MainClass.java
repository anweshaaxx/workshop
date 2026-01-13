package week1.week9;


/**
 * Write a description of class MainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass
{
    public static void main(String[] args) {

        Car car = new Car(101, "Toyota", 2500000, 4);
        System.out.println("Car Details:");
        car.displayCarInfo();

        System.out.println();

        Bike bike = new Bike(201, "Yamaha", 350000, true);
        System.out.println("Bike Details:");
        bike.displayBikeInfo();
    }
}