/*
 * GradeBook
 */

import javax.swing.JOptionPane;

public class Gradebook {

    public static void main(String[] args) {
        //create a GradedActivity object, uses default constructor
        GradedActivity test1 = new GradedActivity();
        //new instance of class GradedActivity
        
        //get a testscore
        String input = JOptionPane.showInputDialog(null,
                "Enter a numeric test score: ");
        double testScore = Double.parseDouble(input);
        
        //store the score in the grade object
        test1.setScore(testScore);
        //calls setScore; important because it's public (we can access it), makes sure it's in range
        
        //print out info
        JOptionPane.showMessageDialog(null, "Test 1: " + test1);
        
    }
    
}