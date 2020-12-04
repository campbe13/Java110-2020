import java.util.Scanner;
/**  
 * Lecture 21 
 * calling methods
 * pass arguments by value
 * 
 * @author PMCampbell
 * @version 2020-12-01
 */
public class Lecture21PassPrimitive {
   
     public static void main(String[] args) {  
       double x=0,y=0;
       double z = 5;
       // argument 1 => 10.0 argument2 => value in z => 5
       foo(10.0, z);
       System.out.println("x " + x);
       System.out.println("y " + y);
       System.out.println("z " + z);
     }
     public static void foo(double x, double y) {
       System.out.println("foo x " + x);
       System.out.println("foo y " + y);
       x=3;
       y=4;
       System.out.println("foo x " + x);
       System.out.println("foo y " + y);
     }
}