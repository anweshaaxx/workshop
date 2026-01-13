package week1.week10;


/**
 * Write a description of class ExamApps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamApps
{
     public static void main(String[] args)
    {
        ScienceStudent scienceStudent =
        new ScienceStudent(2,"Anwesha", 48);
        
        ManagementStudent managementStudent =
        new ManagementStudent(2, "Rashmi", 43);
        
        System.out.println("Science Student:");
        System.out.println(scienceStudent);
        System.out.println("Result: " + scienceStudent.calculateResult());
        System.out.println("Result with Grace: "+ scienceStudent.calculateResult(5));
        
        System.out.println("\nManagement Student:");
        System.out.println(managementStudent);
        System.out.println("Result: " + managementStudent.calculateResult());
        System.out.println("Result with Grace: " +
        managementStudent.calculateResult(4));

    }
}