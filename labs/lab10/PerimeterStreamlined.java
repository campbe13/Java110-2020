import java.util.Scanner;
/**
 * 
 * Lab 10 
 * write 1 method to calculate perimeters of a
 * square &
 * pentagon, hexagon, octagon (all regular)
 *   
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class PerimeterStreamlined {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double length;
    System.out.print("Calculating perimeters\n enter a side length:");
    length = in.nextDouble();
    System.out.println("The perimeter of a square of side "+length+" is: " + 
                       perimeter(length, 4));
    System.out.println("The perimeter of a pentagon of side "+length+" is: " + 
                       perimeter(length, 5));
    System.out.println("The perimeter of a hexagon of side "+length+" is: " + 
                       perimeter(length, 6));
    System.out.println("The perimeter of a octagon of side "+length+" is: " + 
                       perimeter(length, 8));
  }
/**
 * given a length of a side & the number of sides in the
 * geometric object return the perimeter 
  *  
 * @param length     the side length 
 * @param sideCount  the number  of sides
 * 
 * @return  double the perimeter calculated using length & sides
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
  public static double perimeter(double length, double sideCount) {
     return (length * sideCount);
  }
}