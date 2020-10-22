/**
 * 
 * Lab 12
 * boolean values
 *   
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lab12Q1 {
  public static void main(String[] args) {
    boolean found = true;
    double hours = 45.3, overtime = 15.;
    int count = 20;
    char ch = 'B';
    
    System.out.println(!found);
    System.out.println(hours > 40.0);
    System.out.println(!found && (hours>=0));
    System.out.println(!(found && (hours >=0)));
    System.out.println(hours + overtime <= 75 );
    System.out.println((count >= 0) && (count <= 100));
    System.out.println((ch >= 'A' && ch <='Z'));
    System.out.println((ch >= 'a' && ch <= 'z'));
    // try to compile, error:  The operator < is undefined for the argument type(s) boolean, int
    //System.out.println(10 < count < 30);  
    System.out.println(10 < count);
    System.out.println(count < 30); 
    System.out.println(10 < count && count < 30);  
  }
}