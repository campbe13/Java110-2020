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
    
    System.out.println(countMultiples(ar1, 3));  // should be 2
    System.out.println(countMultiples(ar1, 11));  // should be 0
  }
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
    if (array == mult) {
      count++
    }
    return count;
  }
}
}




