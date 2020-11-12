import java.util.Scanner;
/**
 *
 * Lab 16 exercise Bonus Loop #1
 * ask for a number input 
 * count the numbers < 10 
 * display the count
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab16BonusLoop1 {
  public static void main(String[] args) {
    int counter =0, lessThan10 = 0;
    //0-4 (5)  (<5)    0 1 2 3 4    GOOOD
    //0-5 (6)  (<=5)   0 1 2 3 4 5   BAAAD
    //0-4 (5)  (<=4)   0 1 2 3 4    GOOD
    // while ( counter < 100 ) {   
    while ( counter < 5 ) { // changed to 5 for testing
      if (getPositive() < 10) {
        lessThan10++;
      }
      counter++;
    }
    System.out.println(lessThan10 + " were < 10 ");
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