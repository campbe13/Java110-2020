import java.util.Scanner;
/**
 * Code examples from the Lecture slides
 * Lecture 11 powerpoint
 *   
 * conditional execution using if 
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture11If {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number;
    
    System.out.println("Using if, check for even, odd, number:");
    number = in.nextInt();
    usingIfEvenOdd(number);
    usingIfPosNeg(number);
    usingIfelseIf(number);
    unreachableCode(-5);  // case 1: <= 0
    unreachableCode(2);   // case 2: 0, 1, 2, 3
    unreachableCode(25);  // case 3: > 3
    noBraces(number);
    weirdBug(number);
  }
  /**
   * use if statements, check for even or odd
   * 
   * @param x  number to be checked
   * 
   * @author P.M.Campbell
   * @version 2020-fall
   */
  public static void usingIfEvenOdd(int x) {
    if (x % 2 == 1) {
      System.out.println(x+ " is odd ");
    }
    if (x % 2 == 0) {
      System.out.println(x+ " is even ");
    }
    
    if (x % 2 == 1) {
      System.out.println(x+ " is odd ");
    } else {
      System.out.println(x+ " is even ");
    }
    
  }
  /**
   * use nested if statements, check for positive/
   * negative numbers 
   * 
   * @param x  number to be checked
   * 
   * @author P.M.Campbell
   * @version 2020-fall
   */
  public static void usingIfPosNeg(int x) {
    if (x >0) {
      System.out.println(x+ " is positive ");
    } else {
      System.out.println(x+ " is negative ");
    }
    // what about zero ??
    // messy nested if
    if (x >0)  {
      System.out.println(x+ " is positive ");
    } else {
      if (x == 0 ) {
        System.out.println(x+ " is zero ");
      } else {
        System.out.println(x+ " is negative ");
      }
    }
  }
  /**
   * use else if instead of a  nested if statement,
   * check for positive / negative numbers 
   * 
   * @param x  number to be checked
   * 
   * @author P.M.Campbell
   * @version 2020-fall
   */
  public static void usingIfelseIf(int x) {
    // zero covered, better else / if structure
    if (x >0)  {
      System.out.println(x+ " is positive ");
    } else if (x == 0 ) {
      System.out.println(x+ " is zero ");
    } else {
      System.out.println(x+ " is negative ");
    }
  }
  /**
   * use if else/if statements
   * be careful of your logic
   * 
   * @param x  number to be checked
   * 
   * @author P.M.Campbell
   * @version 2020-fall
   */
  public static void unreachableCode(int x) {
    if (x > 0 ) {
      System.out.println(x+ " is > 0 ");
    } else if (x > 3 ) {
      System.out.println("Unreachable !!");
    }
  }
  /**
   * use if statements, potential problem with missing braces {}
   * 
   * @param x  number to be checked
   * 
   * @author P.M.Campbell
   * @version 2020-fall
   */
  public static void noBraces(int x) {
    if (x > 0 ) 
      System.out.println(x+ " is positive ");
      System.out.println("Always executed .... +ve or -ve or 0");
  }
  /**
   * use if statements, weird potential problem
   * 
   * @param x  number to be checked
   * 
   * @author P.M.Campbell
   * @version 2020-fall
   */
  public static void weirdBug(int x) {
    if (x > 0 ) ; {
      System.out.println(x+ " is positive ");
    }
  }
}