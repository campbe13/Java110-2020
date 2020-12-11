/*
 * Sample code, string to int
 * 
 * Convert a string value to an int
 * 1.  do it 1 at a time
 * 2.  loop
 * 
 * @author PCampbell
 * @version 2020-12
 */
import java.util.Scanner;
public class Lecture22StringToIntFor {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    String s = "1234";
    int digit, wholenum = 0, power = s.length()-1;
    
    
    for (int i=0;i <s.length();i++) {
      digit = s.charAt(i) - '0';
      System.out.println("digit " +digit);
      wholenum += digit * Math.pow(10, power);
      System.out.println("wholenum " +wholenum);
      power--;
    }
    System.out.println("int  " +wholenum);
    System.out.println("int -20 " + (wholenum-20));
    // System.out.println("s -20 " + (s-20)); // op - undefined for String
}
}