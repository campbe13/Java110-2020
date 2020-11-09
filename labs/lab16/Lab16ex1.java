import java.util.Scanner;
/**
 *
 * Lab 16 exercise #1 
 * ask for a number input 
 * display numbers betweeen 1 that number 
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab16ex1 {
  public static void main(String[] args) {
    int counter =1, n;
    n = getPositive();
    
    while ( counter < n ) { 
      System.out.print(" " + counter++);
    }
    counter = n;
    while ( counter >= 1 ) { 
      System.out.print(" " + counter--);
    }
  }
/**
 * read in a number, return only +ve number
 * 
 * @return int   positive number
 */
public static int getPositive() {
      Scanner in = new Scanner(System.in);
      int number;
      System.out.print("Enter a number: ");
      number = in.nextInt();
      while (number <=0) {
      System.out.print("Enter a number: ");
      number = in.nextInt();
      }
      return number;
}
} 