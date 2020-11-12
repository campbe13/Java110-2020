import java.util.Scanner;
/**
 *
 * Lecture 16 
 * print a number of * 
 * determined by user input n
 * a number of times 
 * determined by user input m
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lect17Starsnm  {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n, m, counter;
    
    System.out.print("how many stars? ");
    n = in.nextInt();
    System.out.print("how lines of stars? ");
    m = in.nextInt();
    
    for (; m>=1 ; m--){
      for(counter=n ; counter >= 1 ; counter--) {
        System.out.print("*");
      }
      
    }
  }
}