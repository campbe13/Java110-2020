import java.util.Scanner;
/**
 *
 * Lab 13
 * implement toLowerCase 
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab13Lower {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char ch;
    
    System.out.println("convert to lower case chars");
    
    System.out.print("Enter a character, I will make it lower case it");
    ch = in.next().charAt(0);

    System.out.println("Char "+ch+" lower case is "+toLowerCase(ch));
  }
   /* 
  * toLowerCase
  * given a char check if it's upper case if so return the
  * equiv lower case value
  * 
  * @param ch character
  * @return char  lower case or same character
  */
  public static char toLowerCase(char ch) {
    if (ch < 'A' || ch > 'Z'){
      // not an upper case character
      return ch;
    }
    return (char)(ch + 32);
}
}