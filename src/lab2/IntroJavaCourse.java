package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      Tim Liebl
 * @version     1.00
 */
public class IntroJavaCourse implements JavaCoursesAndPreReqs {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String preRequisites;
//all fields should be private
//needs a getter and setter for course name
//need to add methods for proper user input
    


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    public String getPrerequisites() {
        return preRequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.preRequisites = prerequisites;
    }

    public void setCourseNumber() {
   
            if(courseNumber == null || courseNumber.length() == 0) {
            System.out.println(
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
          }
    }

    public void setCourseName() {
        
          if(courseName == null || courseName.length() == 0) {
            System.out.println(
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
          
     }
    }

    public void setCredits() {
                   if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
    }
    }

    public void setPreReqs() {
           if(preRequisites == null || preRequisites.length() == 0) {
            System.out.println(
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
    }

    
}
