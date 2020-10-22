import java.util.Scanner;
/**
 *
 * Lab 12
 * Quadratic equation
 *
 * No real roots a = 1 b = -3 c = 4
 * one root a = -4 b = 12 c = -9
 * two roots a = 2 b = -11 c = 5
 * ref http://www.biology.arizona.edu/biomath/tutorials/quadratic/roots.html
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab12Quadratic {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double a, b, c, posroot, negroot, bsq4ac;

    System.out.println("Roots of a Quadratic equation");

    System.out.print("Enter a value for a");
    a = in.nextDouble();
    System.out.print("Enter a value for b");
    b = in.nextDouble();
    System.out.print("Enter a value for b");
    c = in.nextDouble();
    bsq4ac = b*b - 4*a*c;
    System.out.println("b*b - 4*a*c " + bsq4ac);
    if ( bsq4ac < 0) {
      System.out.println("No real roots for a "+a+" b "+b+" c "+c);
    } else if (bsq4ac == 0) {
      // only one real root
      posroot = -b / 2 * a; negroot = posroot;
      System.out.println("only one root "+posroot +" for a "+a+" b "+b+" c "+c);
    } else {   // no need to if (bsq4ac > 0) as it is the only possibility here
      posroot = (-b + Math.sqrt(bsq4ac)) / 2 * a;
      negroot = (-b - Math.sqrt(bsq4ac)) / 2 * a;
      System.out.println("pos root "+posroot +" for a "+a+" b "+b+" c "+c);
      System.out.println("neg root "+negroot +" for a "+a+" b "+b+" c "+c);
    }
  }
}
