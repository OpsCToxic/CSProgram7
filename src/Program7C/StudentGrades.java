package Program7C;
/**
 * Program 7C
 *  This program creates a HashMap, a type of data structure that relies on a key to store a certain value. In this case, the key is studentName,
 *  and the value is studentGrade. The studentName key's value is updated through the Scanner object and HashMap's implemented functions. The new grade is 
 *  used for output in the console.
 *  4/28/22
 *  @author  Cameron Cobb
 * 
 */
import java.util.Scanner;
import java.util.HashMap;

/**
 * This main method uses a Scanner object to assign a name to studentName and a grade to studentGrade. Then, by using a HashMap,
 * the name is used as the key so that the HashMap can find the students original grade, set a new grade, and find the newly assigned grade. The two methods
 * that are used from the studentGrades HashMap are .get() and .put().
 * @author ccobb
 *
 */
public class StudentGrades {
       
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      String studentName;
      double studentGrade;
      
      HashMap<String, Double> studentGrades = new HashMap<String, Double>();
      
      // Students's grades (pre-entered)
      studentGrades.put("Harry Rawlins", 84.3);
      studentGrades.put("Stephanie Kong", 91.0);
      studentGrades.put("Shailen Tennyson", 78.6);
      studentGrades.put("Quincy Wraight", 65.4);
      studentGrades.put("Janine Antinori", 98.2);
      
      // TODO: Read in new grade for a student, output initial 
      //       grade, replace with new grade in HashMap,
      //       output new grade
      
      studentName = scnr.nextLine();
      studentGrade = scnr.nextDouble();
      System.out.println(studentName + "'s original grade: " + studentGrades.get(studentName));
      studentGrades.put(studentName, studentGrade);
      System.out.println(studentName + "'s new grade: " + studentGrades.get(studentName));
      
   }
}
