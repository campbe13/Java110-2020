import java.util.Scanner;
/**  
 * lab 11 from lab 10, from lab 6, from lab 4
 * given two sides calculate the perimeter of a right triangle
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
    double side1, side2, perimeter;
    
    System.out.println("Calculating the perimeter of a right angle triangle");
    
    System.out.print("what is the length side 1: ");
    side1 = in.nextDouble();
    if (side1 > 0) {
      System.out.print("what is the length side 2: ");
      side2 = in.nextDouble();
      if (side2 > 0) {
        
        System.out.print("A  Right triangle with Sides of " + side1 + " and " +side2 );
        perimeter = perimeterRightTriangle(side1, side2);
        System.out.println(" has a perimeter of  " + perimeter);
        System.out.println(" has a perimeter of  " + perimeterRightTriangle(side1, side2));
      } else {
        System.out.println("Invalid - 2nd side");
      }
    } else {
      System.out.println("Invalid - 1st side");
    }
  }
/**
 * given the length of the two right sides of a right angle triangle
 * return the perimeter 
 *  
 * @param sidea      one side length 
 * @param sidea      another side length 
 * 
 * @return  double the perimeter calculated using  sides
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public static double perimeterRightTriangle(double sidea, double sideb) {
  double hypotenuse = Math.sqrt(sidea * sidea + sideb * sideb);
  return sidea + sideb + hypotenuse;
  /*
   * could do the following instead 
   * return sidea + sideb + Math.sqrt(sidea * sidea + sideb * sideb);
   * or 
   * return sidea + sideb + Math.sqrt(Math.pow(sidea,2) + Math.pow(sideb,2));
   * 
   */
}
}
