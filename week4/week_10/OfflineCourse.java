package week4.week_10;

public class OfflineCourse extends course
{
    private double labFee;
    
    public OfflineCourse(int CourseId, String CourseName, double baseFee, double labFee)
    {
        super(CourseId, CourseName, baseFee);
        this.labFee= labFee;
    }
    
    @Override
    protected double calculateFee()
    {
        return super.getbaseFee() +this.labFee;
    }
    
    public void displayOnlineCourseDetails()
    {
        super.displayCourseDetails(); // CourseId, CourseName
        System.out.println("Total fee for this Online Course: "+ this.calculateFee());
    }
}
    
