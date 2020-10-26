import java.util.Scanner;
/**
 * 
 * Lab 12
 * given x & y values determine
 * which quadrant in a cartesian plane
 * 
 *    2  |  1
 *   ----+----
 *    3  |  4
 * 
 * assuming 0 is positive
 *  
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lab12Qudrant {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double x,y;
     
    System.out.println("Which quadrant");
    
    System.out.print("Enter a value for x:");
    x = in.nextDouble();
    System.out.print("Enter a value for y:");
    y = in.nextDouble();
    
    if ( x >= 0 && y >=0 ) {
      System.out.println("1st quadrant x:" + x+ " y:" + y);
    } else if ( x < 0 && y >=0 ) {
      System.out.println("2nd quadrant x:" + x+ " y:" + y);
    } else if ( x < 0 && y < 0 ) {
      System.out.println("3rd quadrant x:" + x+ " y:" + y);
    } else {
      System.out.println("4th quadrant x:" + x+ " y:" + y);
    }
    
}
}