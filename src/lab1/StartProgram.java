
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author tim78317
 */
public class StartProgram {
    
    public static void main(String[] args){
        
        IntroToProgrammingCourse course = new IntroToProgrammingCourse();
        course.setCourseName();
        course.setCourseNumber();
        course.setCredits();
        JOptionPane.showMessageDialog(null,course.getCourseName());
        //course.getCourseNumber();
        //course.getCredits();
        
        
        
        
        
        
        
        
    }
    
}
