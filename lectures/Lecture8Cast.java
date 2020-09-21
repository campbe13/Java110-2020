// import java.util.Scanner;
/**
 * 
 * Code examples from the Lecture slides
 * Lecture 6 powerpoint
 * casting
 *
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture8Cast {
  public static void main(String[] args) {
    byte z;
    int x;
    short y = 32767;    // max value for a short 
    // x = (int) y;   // not required (widen) but OK short->int 
    x = y;   // not required (widen) but OK short->int 
    y = (short) x; // required (narrow) int -> short
    z = (byte) y;   // required (narrow) short  -> byte  
    System.out.println("x "+x+ " y "+y+ " z "+z);
  }
}