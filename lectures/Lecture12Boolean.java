import java.util.Scanner;
/**
 * 
 * Lecture 12
 * misc content: booleans
 *   
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture12Boolean {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int x = in.nextInt();
    boolean b = x > 5; //x > 5 is “true” or “false”
    boolean b2 = 3*x + 5 < 0;
    System.out.println(b); // prints true or false
    System.out.println(b2);
    System.out.println(" x is even ? " + isEven(x));
    if (isEven(x)) {
      System.out.println(x + " is even");
    } else {
      System.out.println(x + " is odd");
    }  
  } 
  public static boolean isEven (int num) {
    if (num % 2 == 0 )  {
      return true;
    } else {
      return false;
    }
  }
}
