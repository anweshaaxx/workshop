package week4.week_5.week6;
import java.util.Scanner;


/**
 * Write a description of class week6_Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6_Q3
{
    public static void main(String[] args)
  {
    String[] students ={"Saroj","Sushant","Ujjwal","Rabina","Shanks"};
    
    for(int i = 0; i < students.length; i++)
    {
     System.out.println(students[i]);
    }
    
    System.out.println(students[2]);
    
    students[4]= "Sandesh";
    
    System.out.println(students[4]);
  
    Scanner sc = new Scanner(System.in);
    
    int index = sc.nextInt();
    String student = sc.next();
    
    
    students[index] = student;
    
    for(int i=0; i<students.length;i++)
    {
        System.out.println(students[i]);
    }
    
  }
}