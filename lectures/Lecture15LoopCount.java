import java.util.Scanner;
/**
 * 
 * Lecture 15
 * ask the user to input 10,000
 * count all even numbers & display at end
 *   
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture15LoopCount {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num, count = 0, evenCount = 0;
    // supposed to be 10,000 but that's 
    // too long to test
    while (count < 10) {
      
      System.out.print("enter a number:");
      num = in.nextInt();
      if (num % 2 == 1) {
        evenCount = evenCount +1;
      }
      count = count +1;
    }
    System.out.println("You entered "+ evenCount + " even numbers.");
    // can you display the count of odd numbers ?
  }
}