/**  
 * lab 11
 * compiler errors
 * 
 * @version 2020-10-27
 * @author PMCampbell
 */
public class Lab11Part1_5 {
  public static void main(String[] args) {
    int x = 0;
    System.out.println(x);
    // confusing(x);
    confusingFix1(x);
    confusingFix2(x);
    System.out.println(x);
  }
  // error System.out.println is a void method so returning void
  /*
  public static int confusing(int y) {
    return System.out.println(y);
  }
  */
  // fix1 
    public static void confusingFix1(int y) {
        System.out.println(y);
  }
  // fix2
    public static int confusingFix2(int y) {
        System.out.println(y);
        return y;
  }
}

