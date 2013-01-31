package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends JavaCourseRequirements {
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    
    
    //There are no pre req requirements for the intro class so there is no need for the 
    //pre req getter and setters
    
    @Override
    public void setCourseNumber() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setCoursename() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setPrerequisites() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setCredits() {
           if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
    }
    
    
    
    
    
    
    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }


    }


