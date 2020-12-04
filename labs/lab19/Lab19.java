import java.util.Scanner;
/**
 * 
 * 
 * @author PCampbell
 * @version 2020-12 
 */
public class Lab19 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x[] = { 5, 10,15 };
    int y[] = new int[2]; 
    int z[] = { 25, 20,55, 105 };
    y[0] = 8; y[1] =16;
    int q[] = y;
    int t = 5;
    
    System.out.println("x " + x);
    System.out.println("y " + y);
    System.out.println("z " + z);
    System.out.println("q " + q);
    System.out.println("q[0] " + q[0]);
    q = z;
    System.out.println("q " + q);
    System.out.println("q[0] " + q[0]);
    System.out.println("z[2] " + z[2] + " z " + z);
    System.out.println("t " + t);
  }
}




