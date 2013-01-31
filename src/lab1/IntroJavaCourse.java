package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Timothy Liebl
 * @version     1.00
 */
public class IntroJavaCourse extends JavaCourseRequirements {
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    //also there was no setter for credits, which I added in the class
    //There are no checks for error input for this class so I added the checks in the 
    //set name and set credits
    //added code for validating the pre req method
   
    
    @Override
    public void setCourseNumber() {
          if(courseNumber == null || courseNumber.length() == 0) {
            System.out.println(
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
          }
    }

    @Override
    public void setCoursename() {
          if(courseName == null || courseName.length() == 0) {
            System.out.println(
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
          
     }
          
    }

    @Override
    public void setPrerequisites() {
        if(prerequisites == null || prerequisites.length() == 0) {
            System.out.println(
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
    }

    @Override
    public void setCredits() {
           if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
    }
    
           
           
    
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
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
     public void setCredits(double credits) {
        this.credits = credits;
    }



    }


