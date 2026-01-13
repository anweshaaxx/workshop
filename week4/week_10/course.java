package week4.week_10;


/**
 * Write a description of class course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class course
{
    private int CourseId;
    private String CourseName;
    private double baseFee;
    
    public course(int CourseId, String CourseName, double baseFee)
    {
        this.CourseId= CourseId;
        this.CourseName= CourseName;
        this.baseFee= baseFee;
    }
    
    public void setCourseId(int newId)
    {
        this.CourseId= newId;
    }
    
    public int getCourseId()
    {
        return this.CourseId;
    }
    
    public String getCourseName()
    {
        return this.CourseName;
    }
    
    public double getbaseFee()
    {
        return this.baseFee;
    }
    
    protected double calculateFee()
    {
        return this.baseFee;
    }
    
    public void displayCourseDetails()
    {
        System.out.println("Course ID: "+ getCourseId());
        System.out.println("Course Name: "+ getCourseName());
    }
    }
    
    
