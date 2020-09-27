import java.util.Scanner;
/**  
 * Lab8 
 * read in 2 numbers, x & y 
 * display the result of x to the power of y
 * 
 * @author PMCampbell
 * @version 2020-09-25
 */
public class UsePow {
   
     public static void main(String[] args) {  
       Scanner in = new Scanner(System.in); 
       double x, y;
       
       System.out.println("Calculate x to the power of y ");
       
       System.out.print("A value for x: ");
       x = in.nextDouble();
       System.out.print("A value for y: ");
       y = in.nextDouble();
       
       System.out.println(""+ x + "^"+y + " = "+Math.pow(x,y));
     }
}