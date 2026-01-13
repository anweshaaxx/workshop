package week4.week_7;


/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
    //instance methods --> objects need to be created
    
    // void return type + no parameters
    public void displayInfo()
    {
        System.out.println("Welcome to calculator.app");
        
    }
    
    // void return type + parameters
    
    public void add(int a, int b) // formal parameters
    {
        System.out.println("The sum of two numebers are: "+(a+b));
    }
    
    // return type+ no parameters
    
    public int getFixedNumber()
    {
        return 10;
    }
    
    // return type + parameters
    
    public int multiply(int a, int b)
    {
        return a*b;
    }
    
    //static methods --> className reference
    
    public static int square(int a)
    {
        return a*a;
    }
}