import java.util.Scanner;
/**
 *
 * Lab 13
 * implement getGrades 
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab13Grades {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double grade; char letter;
    
    System.out.println("Show letter grade");
    
    System.out.print("Enter a mark");
    grade = in.nextDouble();
    
    letter = getGrade(grade); 
    if (letter == 'I') {
      System.out.println("Invalid marks!");
    } else {
      System.out.println("Letter grade is "+letter);
    }
  }
  public static char getGrade(double grade) {
    if (grade < 0 || grade > 100) {
      return 'I';
    }
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
    // because of     if (grade < 0 || grade > 100) {
    // as 1st stmt this is all that's left
    } else  { 
      return 'A';
  }
}
}