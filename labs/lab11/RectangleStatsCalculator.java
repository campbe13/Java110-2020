import java.util.Scanner;
/**
 * 
 * Lab 11 from Lab 10 
 * write methods to show stats for a rectangle given 2 sides
 *   
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class RectangleStatsCalculator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double length, width;
    
    System.out.println("Calculating Stats for a Rectangle");
    
    System.out.print("Enter a rectangle length:");
    length = in.nextDouble();
    if (length <= 0 )  {
      System.out.print("Invalid length");
    } else { 
      System.out.print("Enter a rectangle width:");
      width = in.nextDouble();
      if (width <= 0 )  {
        System.out.print("Invalid width");
      } else { 
        System.out.println("Given a length of  "+length+" and width of " + width);
        System.out.println("The perimeter is: " + perimeterRectangle(length, width));
        System.out.println("The area is: " + areaRectangle(length, width));
        System.out.println("The diagonal is: " + findDiagonal(length, width));
      }
    }
  }
  
  public static double perimeterRectangle(double side1, double side2) {
    return (side1 * 2 + 2 * side2);
  }
  public static double areaRectangle(double side1, double side2) {
    return (side1 * side2);
  }
  public static double findDiagonal(double side1, double side2) {
    return (Math.sqrt(side1 * side1 + side2 * side2));
  }
}