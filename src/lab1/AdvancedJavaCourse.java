package lab1;

import javax.swing.JOptionPane;

/**
 * 
 *
 * @author      Tim Liebl
 * @version     1.00
 */
public class AdvancedJavaCourse extends JavaCourseRequirements {
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    //There are no getters and setters for creidts
    //There is no setter for pre req
    //your dont need a get capital course name, there is a built in function called ToUpper()

    
    
    
    
    
    
    @Override
    public void setCourseNumber() {
             if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
    }

    @Override
    public void setCoursename() {
       if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
          
     }
     
    }

    @Override
    public void setPrerequisites() {
            if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
    }

    @Override
    public void setCredits() {
          if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
   

    public String getPrerequisites() {
        return prerequisites;
    }

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

}
