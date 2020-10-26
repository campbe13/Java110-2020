import java.util.Scanner;
/**
 *
 * Lab 13
 * implement isSquare()
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab13Square {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int side1, side2;
    
    System.out.println("check if square");
    
    System.out.print("Enter a value for side1");
    side1 = in.nextInt();
    System.out.print("Enter a value for side2");
    side2 = in.nextInt();
    
    System.out.print("Given side1 " +side1 + " side2 " +side2 + " the rectangle ");
    if (isSquare(side1, side2)) {
      System.out.println(" is a square");
    } else {
      System.out.println(" is NOT a square");
    }
  }
  public static boolean isSquare(int length, int breadth) {
    return (length == breadth);
  }
}
