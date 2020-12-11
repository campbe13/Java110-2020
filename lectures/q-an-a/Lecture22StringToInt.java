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
public class Lecture22StringToInt {
  public static void main (String[] args) {
    //Scanner in = new Scanner (System.in);
    String s = "9234";  // 9000 + 200 + 30 + 4
    int digit, wholenum = 0;
    
    digit = s.charAt(0) - '0';
    wholenum = digit * 1000;
    digit = s.charAt(1) - '0';
    wholenum += digit * 100;
    digit = s.charAt(2) - '0';
    wholenum += digit * 10;
    digit = s.charAt(3) - '0';
    wholenum += digit * 1;
    
    System.out.println("wholenum   " + wholenum);
    System.out.println("wholenum * 2 " + (wholenum*2));
    //System.out.println("wholenum * 2" + s*2);
    
    //System.out.println("digit   " + digit);
    //System.out.println("digit +1 " + (digit+1));
}
}



