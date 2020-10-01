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
   public static void showBox(String symbol) {
    
    System.out.println(""+symbol+symbol+symbol+symbol+symbol);
    System.out.println(symbol+"   "+symbol);
    System.out.println(symbol+"   "+symbol);
    System.out.println(symbol+"   "+symbol);
    System.out.println(""+symbol+symbol+symbol+symbol+symbol);
  }
  public static void main(String[] args) {
    String str;
    Scanner in = new Scanner(System.in);
    System.out.print("enter a symbol to use:");
    String symbol = in.next();
    showBox("5");
    showBox(symbol);
    //showBox(5.4);
    //showBox(str);
    showBiggerBox();
    showBiggerBox();
  }
  
  
 
  public static void showBiggerBox() {
    Scanner in = new Scanner(System.in);
    System.out.print("enter a symbol to use:");
    String symbol = in.next();
    System.out.println(""+symbol+symbol+symbol+symbol+symbol+symbol+symbol+symbol);
    System.out.println(symbol+"      "+symbol);
    System.out.println(symbol+"      "+symbol);
    System.out.println(symbol+"      "+symbol);
    System.out.println(""+symbol+symbol+symbol+symbol+symbol+symbol+symbol+symbol);
  }
}