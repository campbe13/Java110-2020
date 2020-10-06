import java.util.Scanner;
/**
 * 
 * Code examples from the Lecture slides
 * Lecture 9 powerpoint
 *   
 * void method, 2 parameters
 *  
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture9Greet {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a person :");
    String person1  = in.next();
    System.out.print("Enter another person :");
    String person2  = in.next();
    sayGreeting(person1, person2);
    sayGreeting(person2, person1);
    sayGreeting(person2, person2);
    sayGreeting(person1, person1);
  }
  public static void sayGreeting(String listener, String speaker) {
     System.out.println("Hello there "+listener+" it's me "+ speaker + "!");
  }
}