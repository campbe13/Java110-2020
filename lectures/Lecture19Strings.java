import java.util.Scanner;
/**
 * 
 * Code examples from the Lecture slides
 * Lecture 19 
 * Strings
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture19Strings {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String colour;
    
    System.out.println("What is your favourite colour? ");
    colour = reader.next();
    System.out.println( colour.length());
    System.out.println("length "+ colour.length());
    System.out.println("1st char " + colour.charAt(0));
    System.out.println("last char " + colour.charAt(colour.length()-1));
    // what happens here ?
    // System.out.println("last char " + colour.charAt(colour.length()));
  }
}