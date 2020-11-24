import java.util.Scanner;
/**
 * Lecture 18 
 * 
 * variables vs arrays
 * 
 * Arrays
 * 
 *
 * @author PMCampbell
 * @version Fall 2020
 **/
public class Lecture18Array1 {
  public static void main(String[] args) {
    useVariables();
    useArray();
    useArrayFor();
  } 
  /**
   * sum three ints
   * 
   * @author pcampbell
   */
  public static void useVariables() {
    // define  some ints
    int num1, num2, num3, sum, mult;
      
    // assign integer literals to int variables
    num1 = 5;
    num2 = 10;
    num3 = 15;
    
    //  use int variables
    sum = num1 + num2 + num3;
    mult = num1 * num2 * num3;
    
    System.out.println("The sum of " +  num1 +  " + " +num2  +  " + " + num3  +  " is " + sum);
    System.out.println("The product of " +  num1 +  " * " +num2  +  " * " + num3  +  " is " + mult);
    
    
  }
  /**
   * sum three ints, using an array 
   * 
   * @author pcampbell
   */
  public static void useArray() {
    // define  the array  & accumulators
    int num[], sum, mult;
    // reserve memory for the array
    // this is different:
    num = new int[3];
    
    // assign integer literals to int array elements
    num[0] = 5;
    num[1] = 10;
    num[2] = 15;
    //  use int variables
    sum = num[0] +   num[1] + num[2];
    mult = num[0] * num[1] * num[2];
    // could we use a loop ???
    
    System.out.println("The sum of " +  num[0] +  " + " +num[1]  +  " + " + num[2]  +  " is " + sum);
    System.out.println("The product of " +  num[0] +  " * " +num[1]  +  " * " + num[2]  +  " is " + mult);
  }
  public static void useArrayFor() {
    // define  the array  & accumulators
    int num[], sum=0, mult=0;
    // reserve memory for the array
    // this is different:
    num = new int[3];
    
    // assign integer literals to int array elements
    num[0] = 5;
    num[1] = 10;
    num[2] = 15;
    //  use int variables
    for (int i =0; i < num.length; i++) {
          sum += num[i];
    }
    mult = num[0] * num[1] * num[2];
    // could we use a loop ???
    
    System.out.println("The sum of " +  num[0] +  " + " +num[1]  +  " + " + num[2]  +  " is " + sum);
    System.out.println("The product of " +  num[0] +  " * " +num[1]  +  " * " + num[2]  +  " is " + mult);
  }
} //