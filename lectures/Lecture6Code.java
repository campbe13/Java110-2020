import java.util.Scanner;
/**
 * 
 * Code examples from the Lecture slides
 * Lecture 6 powerpoint
 * introducing Scanner
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture6Code {
  public static void main(String[] args) {
    int inumber;
    double fnumber;
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Enter a whole number: ");
    inumber = reader.nextInt();
    
    System.out.print("Enter a number with a fraction: ");
    fnumber = reader.nextDouble();
       
    System.out.println("Numbers input: whole " + inumber + " floating point " + fnumber);
    }
}