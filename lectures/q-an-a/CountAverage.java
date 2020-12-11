/*
 * Sample code, demo fix 
 * 
 * Repeatedly asks user to type a positive number until they type -1 or any negative number.
 * display  average of numbers inputted.
 * 
 * loop doesn't end, keeps going, needs to be fixed 
 */
import java.util.Scanner;
public class CountAverage {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    double goodNum,  total=0;
    int counter=0;
    
    System.out.print("Enter a number.");
    goodNum = in.nextDouble();
    
    while (goodNum !=-1) {
      total += goodNum;
      counter++;
        
      System.out.print("Enter another number. If you would like to stop, type -1.");
      goodNum = in.nextDouble();
      
      }
    System.out.println(total/counter);
    }
  }