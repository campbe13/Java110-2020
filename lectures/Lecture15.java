import java.util.Scanner;
/**
 *
 * Lecture 15
 * user input of numbers 100,000 times
 * count the even numbers input
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lecture15 {
  public static void main(String[] args) {
    int count = 0, evenCount = 0, number;
    Scanner in = new Scanner(System.in);
    while (count < 5) {   // should be 100000 using 5 for testing
      System.out.print("enter a number: ");
      number  = in.nextInt();
      if (number % 2 == 0 ) {
        evenCount = evenCount +1;
      }
      System.out.println("count "+count);
      count = count + 1;
  }
    System.out.println("even numbers "+evenCount);
  }
}