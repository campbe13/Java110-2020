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
public class Lecture22StringToIntLoop {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    // 9000 + 200 + 30 + 4
    // 9 x 10^3 + 2 x 10^2 + 3 x 10^1 + 4 x 10^0
    String s = "5";  
    int digit,  wholenum = 0;
    
    // use the string length to determine power of digits 
    int power = (int)Math.pow(10,s.length()-1);   
    
    for (int i=0; i< s.length() ; i++) {
      digit = s.charAt(i) - '0';
      System.out.println ( "digit " + digit);
      System.out.println ( "i " + i);
      System.out.println ( "power " + power);
      wholenum += digit *  power;
      System.out.println("wholenum    : " + wholenum);
      //power = power / 10;
      power /=  10;
    }
    System.out.println("wholenum    : " + wholenum);
    System.out.println("wholenum * 2: " + (wholenum*2));
    //System.out.println("wholenum * 2" + s*2);
    
    //System.out.println("digit   " + digit);
    //System.out.println("digit +1 " + (digit+1));
}
}



