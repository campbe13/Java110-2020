import java.util.Scanner;
/**
 *
 * Lab 16 exercise Bonus Loop #3
 * ask for a number input 
 * count the numbers when their value exceeds the
 * position they are in 
 * 1st count if >1 
 * 2nd count if > 2
 * display the count
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab16BonusLoop3 {
  public static void main(String[] args) {
    int counter =0, sumOfBigger = 0, number;
     
    while ( counter < 10 ) { 
      counter++;
      number = getPositive();
      if (number > counter) {
        sumOfBigger++;
      }
    }
    System.out.println(sumOfBigger + " were > their position ");
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