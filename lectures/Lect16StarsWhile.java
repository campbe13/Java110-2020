import java.util.Scanner;
/**
 *
 * Lecture 16 
 * print a number of * 
 * determined by user input
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lect16Stars{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n, n2;
    System.out.print("how many stars? ");
    n = in.nextInt();
    
    while (n >= 1) {
      System.out.print("*");
      n--;
    }
    System.out.print("how many stars? ");
    n2 = in.nextInt();
    for (;n2 >=1;n2--) {
      System.out.print("*");
    }  
    System.out.print("how many stars? ");
    
    for (int n3 = in.nextInt();n3 >=1;n3--) {
      System.out.print("*");
    }  
}
}