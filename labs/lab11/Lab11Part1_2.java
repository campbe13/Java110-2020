/**  
 * lab 11
 * compiler errors
 * 
 * @version 2020-10-27
 * @author PMCampbell
 */
public class Lab11Part1_2 {
  public static void main(String[] args) {
    int x = 0;
    System.out.println(x);
    //confusing(x);
    confusingFix1(x);
    confusingFix2(x);
    System.out.println(x);
  }
  // error: takes an int, return statement but type void
  /*
   public static void confusing(int y) {
   System.out.println(y);
   return 0;
   }
   */
  // fix 1
  public static void confusingFix1(int y) {
    System.out.println(y);
  }
  // fix 2
  public static int confusingFix2(int y) {
    System.out.println(y);
    return 0;
  }
  
}
