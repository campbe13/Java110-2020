import java.util.Scanner;
/**
 *
 * Lab 13
 * implement getGrades 
 * not as good as the 1st example as it does
 * not encapsulate the logic in the function
 * and the method will fail if we don't check first
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab13Grades2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double grade;
    
    System.out.println("Show letter grade");
    
    System.out.print("Enter a mark");
    grade = in.nextDouble();
    
    if (grade < 0 || grade > 100) {
       System.out.println("Invalid marks!");
    }
    System.out.println("Letter grade is "+getGrade(grade));
    }
  
  public static char getGrade(double grade) {
    if (grade < 25) {
      return 'F';
    } else if (grade <= 45) {
      return 'E';
    } else if (grade <= 50) {
      return 'D';
    } else if (grade <= 60) {
      return 'C';
    } else if (grade <= 80) {
      return 'B';
    // relying on outside logic to validate grade
    // before we get it 
    // so assuming this is all that's left
    } else  { 
      return 'A';
  }
}
}