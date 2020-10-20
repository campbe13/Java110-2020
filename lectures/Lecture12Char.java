import java.util.Scanner;
/**
 * 
 * Lecture 12
 * misc content: chars
 *   
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture12Char {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char c2,c3,c = 'a'; // stores a single letter into char c
    String s = "a"; // stores a single letter letter into String s
    System.out.println("char " + c);
    System.out.println("String " + s);
    // to upper / lower ??  
    
    
    c = (char)126;   // cast an int to char 126 ascii is ~
    System.out.println("char 126 " + c);
    c2 = 200;
    System.out.println("char 200 " + c2);   
    c3 = (char)64;
    System.out.println("char 64 " + c3);
    System.out.println("enter an int between 0 & "+(int)(Math.pow(2,15)-1));
    c = (char)in.nextInt();
    System.out.println("char for  " + c);
    
    // read in a string
    System.out.print("enter your name: ");
    s = in.next();     // next() reads in string
    System.out.println("Hello " + s + "!");
    // read in a char
    System.out.print("enter a char: ");
    c = in.next().charAt(0);     // next() reads in string, charAt(0) reads 1st char in the string
    System.out.println("char for  " + c);
    
    
  }
  
  public static boolean isEven (int num) {
    if (num % 2 == 0 )  {
      return true;
    } else {
      return false;
    }
  }
}
