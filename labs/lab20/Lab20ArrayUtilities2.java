import java.util.Scanner;
/**
 * Test class for this method:
 * 
 * Write a method countMultiples that takes as input an int[] and a second number n.
 * The method should return the number of elements in the int[] that are multiples of n. 
 *
 * 
 * @author PCampbell
 * @version 2020-12 
 */
public class Lab20ArrayUtilities2 {
  public static void main(String[] args) {
    int ar1[] = { 9, 8, 7, 6, 5 };
    int ar2[] = { 222, 123, 1172, 6, 1 };
    
    printArray(ar1);
    System.out.println("multiples of 3: " + countMultiples(ar1, 3));  // should be 2
    System.out.println("multiples of 11: " + countMultiples(ar1, 11));  // should be 0
    printArray(ar2);
    System.out.println("multiples of 2: " + countMultiples(ar2, 2));  // should be 3  
  }
/**
 * check array for mutltiples 
 * 
 * @param int[]  array of integers
 * @param int    multiple to check for
 * @return int   count of multiples of mult in array
 */
public static int countMultiples(int array[], int mult) {
  int count=0;
  for(int i=0; i<array.length;i++) {
    /* 
     * for testing
    System.out.println("array " +array);
    System.out.println("i " +i);
    System.out.println("array[] " +array[i]);
    System.out.println("mult " +mult);
    System.out.println("mod mult " +array[i]%mult);
    */
    // compare for multiples if y%x == 0 then x is a multiple of y
    if (array[i]%mult == 0) {
      count++;
    }
  }
  return count;
}
/**
   * display contents of an array with {}
   * 
   * @param array array to be printed
   */
  public static void printArray(int array[]) {
    System.out.print("{ ");
    for(int i=0;i <array.length; i++) {
      if (i == array.length-1) {
        System.out.print(array[i]);
      }else { System.out.print(array[i] + ","); }
    }
    System.out.println(" }");
  }
}




