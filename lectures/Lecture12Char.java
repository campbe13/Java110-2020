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
    char c = 'a'; // stores a single letter into char c
    String s = "a"; // stores a single letter letter into String s
    System.out.println("char " + c);
    System.out.println("String " + s);
    // to upper / lower ??  
    c = (char)123;
    System.out.println("enter an int between 0 & "+(int)(Math.pow(2,15)-1));
    c = (char)in.nextInt();
    System.out.println("char for  " + c);
    System.out.println("enter a char");
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
