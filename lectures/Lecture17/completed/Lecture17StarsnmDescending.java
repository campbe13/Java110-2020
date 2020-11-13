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
public class Lecture17StarsnmDescending  {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n;
    
    System.out.print("enter number of stars ");
    n = in.nextInt();
    
    for (int m = 1 ;m <= n; m++) {
      for (int counter = m;counter >= 1; counter--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}






