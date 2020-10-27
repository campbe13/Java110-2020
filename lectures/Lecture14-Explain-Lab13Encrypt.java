import java.util.Scanner;
/**
 *
 * Lab 13
 * implement encrypt 
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab13Encrypt {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char ch;
    
    System.out.println("encrypt chars");
    
    System.out.print("Enter a character, I will encrypt it");
    ch = in.next().charAt(0);
    
    System.out.println("Char "+ch+" encrypted is "+encrypt(ch));
  }
   /* 
  * getGrades
  * given a char encrypt it by shifting +3 
  * 
  * @param ch character
  * @return char encrypted character
  */
  public static char encrypt(char ch) {
    /*
    if (ch >= 'x' || ch >= 'X') {
      return ((char)((ch+3)%24));
  } else {
  */
    return (char)(ch + 3);
  }
}
