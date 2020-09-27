import java.util.Scanner;
/**
 * 
 * Code examples from the Lecture slides
 * Lecture 9 powerpoint
 *   
 * void method, 1 parameters
 *  
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture9BoxSymbolFinal {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String symbol = in.next();
    showBox(symbol);
    showBox("A");
    showBox("%");
    showBox("=");
  }
  public static void showBox(String symbol) {
     System.out.println(""+symbol+symbol+symbol+symbol+symbol);
     System.out.println(symbol+"   "+symbol);
     System.out.println(symbol+"   "+symbol);
     System.out.println(symbol+"   "+symbol);
     System.out.println(""+symbol+symbol+symbol+symbol+symbol);
  }
}