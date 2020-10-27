/**  
 * lab 11
 * compiler errors
 * 
 * @version 2020-10-27
 * @author PMCampbell
 */
public class Lab11Part1_3 {
  public static void main(String[] args) {
    int x = 0;
    System.out.println(x);
    //confusing(x);
    confusingFix1(x);
    confusingFix2(x);
    System.out.println(x);
  }
  // error compiler thinks no return if value of  y is <= 0
  /*
  public static int confusing(int y) {
    if (y > 0) {
      return 0;   
    }
  }
  */
  // fix1
public static int confusingFix1(int y) {
    if (y > 0) {
      return 0;   
    }
    // not sure what to do here, depends on definition
    // so just returning y
    return y;
  }
public static int confusingFix2(int y) {
    if (y > 0) {
      return 0;   
    } else { 
    // not sure what to do here, depends on definition 
    // so just returning y
    return y;
    }
  }
}
