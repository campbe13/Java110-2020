import java.util.Scanner;
/**
 *
 * Lecture 15
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lecture15BadLoop {
  public static void main(String[] args) {
    int x = 3;
    while (x > 0) {   
      System.out.println("x > 0");
      x = x - 1;    
      // x = x + 1;  this will make x get farther & farther 
      //          from 0 so never false  == infinite loop
    }
    System.out.println("end prog");
  }
}