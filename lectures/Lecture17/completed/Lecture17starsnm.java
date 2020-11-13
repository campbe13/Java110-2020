import java.util.Scanner;
/**
 *
 * Lecture 17 
 * print a number of * 
 * determined by user input n
 * a number of times 
 * determined by user input m
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lecture17Starsnm  {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n,m,counter;
    
    System.out.print("enter number of lines of stars ");
    m = in.nextInt();
    System.out.print("enter number of stars ");
    n = in.nextInt();
    
    for( ; m >= 1; m--) {
      for (counter = n ; counter >=1 ; counter--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}





