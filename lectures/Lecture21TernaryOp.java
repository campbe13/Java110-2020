import java.util.Scanner;
/**  
 * Lecture 21 
 * using the ternary operator
 * 
 * @author PMCampbell
 * @version 2020-12-01
 */
public class Lecture21TernaryOp {
  
  public static void main(String[] args) {  
    scopeProblem();
    solutionOne();
    ternarySolution();   
    System.out.println(ternaryPlural(1));
    System.out.println(ternaryPlural(35));
  }
  /**
   * this method won't compile,
   * max is out of scope for the print
   * comment it out to compile
   */
  public static void scopeProblem() {
    int x = 5, y=15;
    
    if (x > y) {
      int max = x;
    }
    else {
      int max = y;
    }
    System.out.println("The max is " + max);
  }
  /**
   * solution 1 for scopeProbem()
   */
  public static void solutionOne() {
    int x = 5, y=15, max;
    
    if (x > y) {
      max = x;
    }
    else {
      max = y;
    }
    System.out.println("The max is " + max);
  }
  /**
   * solution 2 for scopeProbem()
   * use the ternary operator
   * 
   */
  public static void ternarySolution() {
    int x = 55, y=15;
    
    System.out.println("The max is " + ( x > y ? x : y));
  }
  /**
   * example using the ternary operator
   * 
   */
  
  public static String ternaryPlural(int cookies) {
    return "There " + (cookies > 1 ? "are " + cookies + " cookies" : "is one cookie");
  }
  
}