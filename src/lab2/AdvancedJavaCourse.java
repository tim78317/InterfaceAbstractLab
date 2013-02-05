package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Tim Liebl
 * @version     1.00
 */
public class AdvancedJavaCourse implements JavaCoursesAndPreReqs {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    //methods should not be final because they could change over time
    //program needs setters for name, number, credits, and prereqs

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

  
    public String getCourseNumber() {
        return courseNumber;
    }

    public double getCredits() {
        return credits;
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseNumber() {
      if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
    }

    public void setCourseName() {
            if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
    }

    public void setCredits() {
              if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
    }

    public void setPreReqs() {
                if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
    }

    
}
