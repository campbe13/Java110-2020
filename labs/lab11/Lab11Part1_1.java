/**  
 * lab 11
 * compiler errors
 * 
 * @version 2020-10-27
 * @author PMCampbell
 */
public class Lab11Part1_1 {
  public static void main(String[] args) {
    int x = 0;
    double xDouble =0;
    System.out.println(x);
    // confusing(x);
    confusingfix2(x);
    confusingfix1(xDouble);
    System.out.println(x);
  }
  // this method requires int & returns nothing
  /*
   public static int confusing(int y) {
   System.out.println(y);
   }
   */
// solution 1
  public static void confusingfix1(double y) {
    System.out.println(y);
  }
// solution 2
  public static int confusingfix2(int y) {
    System.out.println(y);
    return y;
  }
}
