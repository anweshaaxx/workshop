package week4.week_7;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
        // objects creation
        student st1= new student("Anwesha", 101);
        student st2= new student("Bina", 201);
        
        
        System.out.println(st1.name);
        System.out.println(st1.id);
        st1.study();
        
        st2.laugh();
        
        System.out.println(st2.name);
        System.out.println(st2.id);
        
        // invocation of instance methods or invoking an instance method
        
        calculator calc= new calculator();
        calc.displayInfo();
        
        calc.add(10,20); // actual parameters
        calc.add(30,40);
        
        System.out.println("The fixed number is: "+calc.getFixedNumber());
        
        int fixNum= calc.getFixedNumber();
        
        System.out.println("The fixed number is: "+ fixNum);
        
        int multi= calc.multiply(10,20);
        int multi1= calc.multiply(30,40);
        
        
        System.out.println(calculator.square(10));



    }
}