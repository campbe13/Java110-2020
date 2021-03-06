/**  
 * lab 5
 * see flowchart, given two sides calculate the perimeter of a right triangle
 * 
 * this uses:
 *    floating point numbers double data type
 *    a method from the Math class sqrt()
 * 
 * @version 2020-09-11
 * @author PMCampbell
 */
public class RightTrianglePerim {
   
     public static void main(String[] args) { 
       // var declaration
       double  side1, side2, hypotenuse, perimeter;
       side1 = 5;
       side2 = 4;
       // calculations
       hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
       perimeter = side1 + side2 + hypotenuse;
       // output
       System.out.print("A  Right triangle with Sides of " + side1 + " and " +side2 );
       System.out.println(" has an hypotenuse of  " + hypotenuse );
       System.out.println("The perimeter is then  " + perimeter);
     }
     
     
}
