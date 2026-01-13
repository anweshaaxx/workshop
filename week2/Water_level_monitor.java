package week2;


/**
 * Write a description of class Water_level_monitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Water_level_monitor
{
    public static void main(String[] args)
    {
        int waterlevel=950;
        System.out.println("Current Water level: " + waterlevel + "L");
        System.out.println(
            (waterlevel>=1000)? "WARNING: Water level has reached 1000L or more!": "Status: Normal"
        );
    }
}