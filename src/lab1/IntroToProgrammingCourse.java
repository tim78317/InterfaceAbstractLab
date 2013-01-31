package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends JavaCourseRequirements {
    private String courseName;
    private String courseNumber;
    private double credits;
    
    
    //I changed the methods in this class to inherate from the superclass mehtods
    // This creates the flexibility to write your own exections to the mehtods for 
    //determining requirements for coure names, coure numbers, and pre reqs without having to write 
    //seperate methods for each class

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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setCredits() {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
          
    }
    
    } 
    
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    

    public double getCredits() {
        return credits;
    }


    public String getCourseName() {
        return courseName;
    }
  
}
