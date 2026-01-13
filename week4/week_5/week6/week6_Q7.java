package week4.week_5.week6;


/**
 * Write a description of class week6_Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6_Q7
{
    public static void main(String[] args)
        {
          int seats[][] = { {1,2,3},{} };
            for (int i = 0; i< seats.length; i++)
                 {
                    for(int j=0; j < seats[i].length; j++)
                    {
                       System.out.print(seats[i][j] + " ");
                    }
                    System.out.println();
                 }  
        }
}