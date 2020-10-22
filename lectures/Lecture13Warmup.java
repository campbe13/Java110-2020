import java.util.Scanner;
/**
 * 
 * Lecture 13
 * warm up exercise skeleton
 *   
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture13Warmup {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int year;
        
    System.out.print("enter a year, I will tell you if it's a Leap year:");
    year = in.nextInt();
    if (isLeap(year)) {
      System.out.println("The year "+ year + "is a leap year.");
    } else {
      System.out.println("The year "+ year + "is NOT a leap year.");
    }
}
public static boolean isLeap(int year) {
  // skeleton method, add your code here
  return true;
}