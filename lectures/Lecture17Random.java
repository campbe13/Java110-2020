import java.util.Random;
import java.util.Scanner;
/**
 *
 * Lecture 17 using the Random class
 * added scanner & input
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lecture17Random {
  
  public static void main(String[] args ) {
    Random randGen = new Random();
    Scanner in = new Scanner(System.in);
    int x, y,y2, y3, max;
    double z, t;
    
    System.out.print("I will generate a random number for you between 0 & (exclusive):");
    max = in.nextInt();
    y3 = randGen.nextInt(max);
    
    // random int
    x = randGen.nextInt(); 
    
    // a random int between 0 and 9 (inclusive)
    // I want a random number between  1 & 10
    y = randGen.nextInt(10) + 1;
    // between 0-10
    y2 = randGen.nextInt(11);   // between 0 & (11-1)
    // I want a random number between  1 & 10
    
    // a random double between 0 and 1
    z = randGen.nextDouble();
    
    // a random double between 0 and 5
    t = randGen.nextDouble() * 5;
    
    System.out.println("random int x: " + x);
    System.out.println("random int between 0-9: " + y);
    System.out.println("random int between 0-10: " + y2);    
    System.out.println("random double between 0-1: " + z);
    System.out.println("random double between 0-5: " + t);
    System.out.println("random int between 0-" + (max-1)+": " + y3);    
  }
} 