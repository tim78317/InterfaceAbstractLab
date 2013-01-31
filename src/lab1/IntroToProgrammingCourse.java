package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Timothy Leibl
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
    //There are no setters for course name, course number, and credits, which I added in

      @Override
    public void setCourseNumber() {
         courseNumber = JOptionPane.showInputDialog("What is the Course Number?");
         
      if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
    }

    @Override
    public void setCourseName() {
        courseName = JOptionPane.showInputDialog("What is the Course Name?");
        
        
     if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
          
     }
     
    }
    
    @Override
    public void setPreRequisites() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setCredits() {
        String input = JOptionPane.showInputDialog("What is the Credits?");
        credits = Double.parseDouble(input);
        
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
          
    }
        
    }
        
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
  
}
