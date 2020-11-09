import java.util.Scanner;
/**
 *
 * Lab 16 exercise #3 
 * ask for a number input 
 * countdown from that number
 * 
 * Using the method from exercise #1 to 
 * ensure the input is +ve
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab16ex3 {
  public static void main(String[] args) {
    int n = getPositive();
    
    while ( n > 0 ) { 
      System.out.println(n--);
    }
    
    System.out.print("Blastoff!!");
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