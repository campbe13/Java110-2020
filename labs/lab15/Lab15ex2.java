import java.util.Scanner;
/**
 *
 * Lab 15 exercise #2 
 * display numbers betweeen
 * input range given by user
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab15ex2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int low, high;
    System.out.println("enter a beginning number");
    low = in.nextInt();
    System.out.println("enter a ending number");
    high = in.nextInt();
    if (low > high) {  // prevent infinite loop 
      System.out.println(" low " + low 
           +  " must be less than high " +high);
    } else {
      printRange(low,high);
    }
  }
/** 
 * display the numbers between the 1st param & 2nd
 * no error checking
 * 
 * @param begin starting number
 * @param end ending number
 */ 
  public static void printRange(int begin, int end) {
    while (begin <= end ) {
      System.out.println(begin);
      begin = begin + 1;
    }
  }
}
  
  
  
  
  
  
  