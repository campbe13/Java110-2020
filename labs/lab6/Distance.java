import java.util.Scanner;
/**  
 * lab 6
 * The distance between 2 points on a cartesian plane
 * via user input
 * 
 * @author PMCampbell
 * @version 2020-09-21
 */
public class Distance {
   
     public static void main(String[] args) { 
       Scanner stdin = new Scanner(System.in);
       double dist, x1, x2, y1, y2;
       
       System.out.println("Distance between 2 points");
       
       System.out.print("x1: ");
       x1 = stdin.nextDouble();
       System.out.print("x2: ");
       x2 = stdin.nextDouble();
       System.out.print("y1: ");
       y1 = stdin.nextDouble();
       System.out.print("y2: ");
       y2 = stdin.nextDouble();
       
       dist  = Math.sqrt(((x2 - x1)*(x2 -x1)) + ((y2 - y1)*(y2 -y1)));
       System.out.println("The distance is " + dist);
     }   
}
