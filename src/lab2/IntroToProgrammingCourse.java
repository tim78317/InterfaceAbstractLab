package lab2;

import javax.swing.JOptionPane;

/**
 * 
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements JavaCoursesAndPreReqs {
    private String courseName;
    private String courseNumber;
    private double credits;
//should not make set course number, name, and credits final methods because these all could change
//needed to add stters for name, number, and credits

    public void setCourseName(String courseName) {
       
        this.courseName = courseName;
    }

    public void setCourseNumber(String courseNumber) {
       
        this.courseNumber = courseNumber;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
    
    public String getCourseNumber() {
         
        return courseNumber;
    }


    public double getCredits() {
        return credits;
    }

    

    public String getCourseName() {
       JOptionPane.showMessageDialog(null, "Course Name is " + courseName);
        return courseName;
    }


    public void setCourseNumber() {
         courseNumber = JOptionPane.showInputDialog("What is the Course Number?");
         
                if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
    }

    public void setCourseName() {
         courseName = JOptionPane.showInputDialog("What is the Course Name?");
          
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
    }

    public void setCredits() {
        String input = JOptionPane.showInputDialog("What is the Credits?");
        credits = Double.parseDouble(input);
        
               if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
    }

    public void setPreReqs() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
