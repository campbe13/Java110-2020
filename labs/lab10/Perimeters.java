import java.util.Scanner;
/**
 * 
 * Lab 10 
 * write methods to calculate perimeters of a
 * square &
 * pentagon, hexagon, octagon (all regular)
 *   
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Perimeters {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double length;
    System.out.print("Calculating perimeters\n enter a side length:");
    length = in.nextDouble();
    System.out.println("The perimeter of a square of side "+length+" is: " + 
                       perimeterSquare(length));
    System.out.println("The perimeter of a pentagon of side "+length+" is: " + 
                       perimeterPentagon(length));
    System.out.println("The perimeter of a hexagon of side "+length+" is: " + 
                       perimeterHexagon(length));
    System.out.println("The perimeter of a octagon of side "+length+" is: " + 
                       perimeterOctagon(length));
  }
/**
 * given a side, return the perimeter of a square
  *  
 * @param length   the side length 
 * @return  double the perimeter calculated using side
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
  public static double perimeterSquare(double length) {
     return (length * 4);
  }
/**
 * given a side, return the perimeter of a regular pentaogn
 *  
 * @param side   the side length 
 * @return  double the perimeter calculated using side
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
  public static double perimeterPentagon(double length) {
     return (length * 5);
  }
/**
 * given a side, return the perimeter of a regular hexagon
 *  
 * @param length   the side length 
 * @return  double the perimeter calculated using side
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
  public static double perimeterHexagon(double length) {
     return (length * 6);
  }
/**
 * given a side, return the perimeter of a regular octagon
 *  
 * @param   length   the side length 
 * @return  double the perimeter calculated using side
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
  public static double perimeterOctagon(double length) {
     return (length * 8);
  }
}