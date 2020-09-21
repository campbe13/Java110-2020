import java.util.Scanner;
/**  
 * lab 6, from lab 4
 * see flowchart, given two sized calculate the perimeter of a right triangle
 * 
 * WARNING WARNING WARNING
 * this uses:
 *    floating point numbers double data type
 *    a method from the Math class sqrt()
 * 
 * 
 * @version 2020-09-21
 * @author PMCampbell
 */
public class RightTrianglePerim {
   
     public static void main(String[] args) { 
       Scanner in = new Scanner(System.in);
       double side1, side2, hypotenuse, perimeter;
       
       System.out.println("Calculating the perimeter of a right angle triangle");
       
       System.out.print("what is the length side 1: ");
       side1 = in.nextInt();
       System.out.print("what is the length side 2: ");
       side2 = in.nextInt();
       
       hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
       perimeter = side1 + side2 + hypotenuse;
       
       System.out.print("A  Right triangle with Sides of " + side1 + " and " +side2 );
       System.out.println(" has an hypotenuse of  " + hypotenuse );
       System.out.println("The perimeter is then  " + perimeter);
     }
     
     
}
