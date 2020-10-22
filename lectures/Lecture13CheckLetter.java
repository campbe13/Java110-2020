import java.util.Scanner;
/**
 * 
 * Lecture 13
 * implement isLetter method
 *   
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture13CheckLetter {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char letterMaybe;
    
    System.out.print("enter a single char I will tell you if it is a letter a-z or A-Z:");
    letterMaybe = in.next().charAt(0);
    if (isLetter1(letterMaybe)) {
      System.out.println("The input "+ letterMaybe + " is a letter.");
    } else {
      System.out.println("The input "+ letterMaybe + " is NOT a letter.");
    }
    if (isLetter2(letterMaybe)) {
      System.out.println("The input "+ letterMaybe + " is a letter.");
    } else {
      System.out.println("The input "+ letterMaybe + " is NOT a letter.");
    }
  }
  public static boolean isLetter1(char testChar) {
    if (testChar >= 97 && testChar <= 122) {
      return true;
    } else if (testChar >= 65 && testChar <= 90) {
      return true;
    }
    return false;
  }
  
  public static boolean isLetter2(char testChar) {
    if (testChar >= 'a' && testChar <= 'z') {
      return true;
    } else if (testChar >= 'A' && testChar <= 'Z') {
      return true;
    }
    return false;
  }
}