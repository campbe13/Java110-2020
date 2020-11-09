import java.util.Scanner;
/**
 *
 * Lab 16 exercise Bonus Loop #2
 * ask for a number input 
 * count the numbers that end in 5
 * display the count
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab16BonusLoop2 {
  public static void main(String[] args) {
    int counter =0, endsIn5 = 0, number;
     
    // while ( counter < 100 ) {   
    while ( counter < 10 ) { // changed to 10 for testing
      number = getPositive();
      // 55 % 5   == 0
      // 55 % 10  != 0 
      // 50 % 5   == 0
      // 50 % 10  == 0 
      if (number % 5 == 0 && number % 10 != 0) {
        endsIn5++;
      }
      counter++;
    }
    System.out.println(endsIn5 + " ended in 5 ");
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