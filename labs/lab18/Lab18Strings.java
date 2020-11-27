import java.util.Scanner;
/**
 * This program lets  the user enter a String 
 * counts the number of words in the String by counting the number of spaces.
 * (If there are 3 spaces for example, there are 4 words.) 
 * assuming that the user has never entered 2 consecutive spaces. 
 * 
 * @author PCampbell
 * @version 2020-11-27
 */
public class Lab18Strings {
  public static void main(String[] args) {
    String phrase;
    int words;
    Scanner in = new Scanner(System.in);
  
    
    System.out.print("Enter a phrase: ");
    phrase = in.nextLine();   // accepts spaces, next() does not
    words = countSpaces(phrase);   
    /*
    words = countSpaces("Mares eat oats ");   
    System.out.println("\n Your phrase has " + words );  // sb 3
    words = countSpaces("I like mayonaise on fries  and in my peanut butter sandwiches ");   
    System.out.println("\n Your phrase  has " + words );  // sb 12
    */
    System.out.println("\n Your phrase  has " + words +  " words ");  
  }
/** 
 *  count the number of spaces in a string
 * 
 * @param s string to check for spaces
 * @return int the number of spaces in s. All printing and scanning should be done in the main method.
 * */
public static int countSpaces(String s) {
  int count =0;
  for(int i=0; i<s.length(); i++) {
    if (s.charAt(i) == ' ') {
      count++;
      System.out.println("debug: char in s " + s.charAt(i) + " i "+i);  
    }

  }
  return count;
}
}




