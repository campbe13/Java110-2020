import java.util.Scanner;
/**
 *
 * Lab 13
 * implement getGrades 
 * check for range in method
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab13Grades5 {
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
  /* 
   * getGrades
   * given a number grade
   * return the associated letter grade
   * or I if invalid
   * 
   * @param grade numeric grade
   * @return char letter grade
   */
  public static char getGrade(double grade) {
    // assuming the range limit is included
    // ex 45-50 includes 50, excludes 45
    if (grade > 80) {       
      return 'A';     }     
    if (grade >= 60 && grade <= 80)     {
      return 'B';     }      
    if (grade >= 50 && grade <= 60)     {  
      return 'C';     }   
    if (grade >= 45 && grade <= 50)     {  
      return 'D';     }     
    if (grade >= 25 && grade <= 45)     { 
      return 'E';     }    
    else      { 
      return 'F';     }   } 
  
}
