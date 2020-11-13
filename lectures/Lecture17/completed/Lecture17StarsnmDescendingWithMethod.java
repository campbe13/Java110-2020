import java.util.Scanner;
/**
 *
 * Lecture 17 
 * print a number of * 
 * determined by user input 
 * starting with 1 to n
 * ex 3
 * *
 * **
 * ***
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lecture17StarsnmDescendingWithMethod  {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n;
    
    System.out.print("enter number of stars ");
    n = in.nextInt();
    
    for (int m = 1 ;m <= n; m++) {
      printStars(m);    
      System.out.println();
    }
}
/**
 * print a line of stars
 * 
 * @param numstars number of stars to print
 */
public static void printStars(int numstars) {
  for (int counter = numstars;counter >= 1; counter--) {
        System.out.print("*");
      }
  }
}






