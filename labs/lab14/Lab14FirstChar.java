import java.util.Scanner;
/**
 *
 * Lab 14
 * implement isFirstChar
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab14FirstChar {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char ch; String phrase;
    
    System.out.println("Check first char");
    
    System.out.print("Enter a character ");
    ch = in.next().charAt(0);
    
    System.out.print("Enter a string (ex phrase) ");
    phrase = in.next();
    // weirdness if I read the char after  the string
    // due to the way Scanner works
    // have to ask for the char first
    /*
    System.out.print("Enter a character ");
    ch = in.next().charAt(0);
    */
    // technically the same, & gives right result butn
    // not the right answer to the request
    //if (phrase.charAt(0) == ch)
    if (isFirstChar(phrase, ch)) {
       System.out.println("The first letter matches!");
    } else {
       System.out.println("The first letter does not match!");
    }
  }
   /* 
  * isFirstChar
  * checks if the first char of the string is == to the char given
  * 
  * @param ch character
  * @return boolean 
  */
  public static boolean isFirstChar(String str, char ch) {
    return (str.charAt(0) == ch);
    
  }
}
