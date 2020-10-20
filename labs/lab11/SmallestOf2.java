import java.util.Scanner;
/**  
 * lab 11
 * ask for 2 numbers, display the minimum of the 2
 * 
 * @version 2020-10-13
 * @author PMCampbell
 */
public class SmallestOf2 {
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int first, second;
    System.out.println("Smallest of two numbers");
    System.out.print("Enter a number:");
    first = in.nextInt();
    System.out.print("Enter another number:");
    second = in.nextInt();
      if (num1 < num2) {
      System.out.println("The smallest is " + num1);
    } else{
      System.out.println("The smallest is " + num2);
    }
    System.out.println("You entered " + first +" and " + second);
    //System.out.println("The smallest is " + minOfTwoIntegers(first,second));
  }
  public static int minOfTwoIntegers (int num1, int num2) {
    if (num1 < num2) {
      return num1;
    } else{
      return num2;
    }
    
  }
}