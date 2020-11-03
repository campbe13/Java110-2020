import java.util.Scanner;
/**
 *
 * Lab 15 exercise #1 
 * display numbers betweeen 1& 1000
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab15ex1 {
  public static void main(String[] args) {
    int count =1;
    
    while ( count <= 1000 ) {  // 1001 <= 100 >>>> false
      System.out.println("count " + count);
      count = count + 1;
    }
    System.out.println("count @ end " + count);
  }
}