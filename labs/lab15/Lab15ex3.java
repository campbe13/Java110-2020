import java.util.Scanner;
/**
 *
 * Lab 15 exercise #3 
 * in exercise 2 we 
 * display numbers betweeen
 * input range given by user
 * this exercise we add an 
 * increment value given by the user
 * instead of the default of 1
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab15ex3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int low, high, incr;
    System.out.println("enter a beginning number");
    low = in.nextInt();
    System.out.println("enter a ending number");
    high = in.nextInt();
    
    if (low > high) {  // prevent infinite loop 
      System.out.println(" low " + low 
           +  " must be less than high " +high);
    } else {
      System.out.println("enter an increment value");
      incr = in.nextInt();
      printRange(low,high, incr);
    }
  }
/** 
 * display the numbers between the 1st param & 2nd
 * no error checking
 * 
 * @param begin starting number
 * @param end ending number
 * @param incr value by which to increment
 */ 
  public static void printRange(int begin, int end, int incr) {
    while (begin <= end ) {
      System.out.println(begin);
      // begin = begin + incr;  // long hand
      begin += incr;  // short hand
    }
  }
}
  
  
  
  
  
  
  