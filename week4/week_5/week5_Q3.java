package week4.week_5;


/**
 * Write a description of class week5_Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week5_Q3
{
    public static void main(String[] args)
  {
   int i = 1;
   int sum = 0;
   do{
      sum = sum+(i*i);
      i++;
   }
   while(i<=10);
   System.out.println(sum);
  }
}