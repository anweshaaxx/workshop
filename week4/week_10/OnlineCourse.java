package week4.week_10;

public class OnlineCourse extends course
{
    private double platformFee;
    
    public OnlineCourse(int CourseId, String CourseName, double baseFee, double platformFee)
    {
        super(CourseId, CourseName, baseFee);
        this.platformFee= platformFee;
    }
    
    @Override
    protected double calculateFee()
    {
        return super.getbaseFee() +this.platformFee;
    }
    
    public void displayOnlineCourseDetails()
    {
        super.displayCourseDetails(); // CourseId, CourseName
        System.out.println("Total fee for this Online Course: "+ this.calculateFee());
    }
}