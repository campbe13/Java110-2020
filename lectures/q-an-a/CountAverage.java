/*
 * Sample code, demo fix 
 * 
 * Repeatedly asks user to type a positive number until they type -1 or any negative number.
 * Returns average of numbers inputted.
 * 
 * loop doesn't end, keeps going, needs to be fixed 
 */
import java.util.Scanner;
public class CountAverage {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    
    System.out.print("Enter a number.");
    double goodNum = in.nextDouble();
    double counter = 1;
    while (goodNum2 !=-1) {
      System.out.print("Enter another number. If you would like to stop, type -1.");
      double goodNum2 = in.nextDouble();
      if (goodNum2 <= -1) {
        System.out.println((double)(goodNum/counter));
      }
      else {
        goodNum += goodNum2;
        counter++;
      }
    }
  }
}