/**  
 * lab 11
 * compiler errors
 * 
 * @version 2020-10-27
 * @author PMCampbell
 */
public class Lab11Part1_4 {
  public static void main(String[] args) {
    java.util.Scanner reader = new java.util.Scanner(System.in);
    // error .next() returns a String
    // int x = reader.next();
    int x = reader.nextInt();
    // need to init as if we never get into the braces
    // "local variable y may not have been initialized"
    int y = 0;   
    if (x > 0) {
      // error scope of y is in the braces {} 
      // int y = 10;
      y = 10;
    }
    System.out.println(y);
  }
}
