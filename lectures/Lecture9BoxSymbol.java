import java.util.Scanner;
/**
 * 
 * Code examples from the Lecture slides
 * Lecture 9 powerpoint
 *   
 * void method, 1 parameter
 * 
 * error: variable out of scope ???
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 */
public class Lecture9BoxSymbol {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("enter a symbol to use:");
    String symbol = in.next();
    showBox();
    showBox();
    showBox();
    showBox();
  }
  
  public static void showBox() {
     System.out.println(""+symbol+symbol+symbol+symbol+symbol);
     System.out.println(symbol+"   "+symbol);
     System.out.println(symbol+"   "+symbol);
     System.out.println(symbol+"   "+symbol);
     System.out.println(""+symbol+symbol+symbol+symbol+symbol);
  }
}