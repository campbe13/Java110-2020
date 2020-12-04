import java.util.Scanner;
/**  
 * Lecture 21 
 * calling methods
 * pass arguments by value
 * 
 * 
 * @author PMCampbell
 * @version 2020-12-01
 */
public class Lecture21DoubleArray {
  
  public static void main(String[] args) {  
    double[] z =  { 1.0, 2.0, 1.34567 };
    double[] q =  { 1.0, 3.0, 4.0 };                
    
    printArray(z, "Array z, before calling doubleMe() ");
    doubleMe(z);
    printArray(z, "Array z, after calling doubleMe() ");
    
    printArray(q, "\nArray q, before calling doubleMe() ");
    doubleMe(q);
    printArray(q, "Array q, after calling doubleMe() ");
    
  }
  /**
   * double the elements of an array
   * 
   * @param array to be doubled
   */
  public static void doubleMe(double array[]) {
    for(int i=0;i<array.length;i++) {
      array[i] = array[i] * 2;
      // array[i] *= 2;
    }
  }
  /**
   * display contents of an array with {}
   * from lab 19
   * 
   * @param array array to be printed
   * @param header header to print before array contents
   */
  public static void printArray(double array[], String header) {
    System.out.println(header);
    System.out.print("{ ");
    for(int i=0;i <array.length; i++) {
      if (i == array.length-1) {
        System.out.print(array[i]);
      }else { System.out.print(array[i] + ","); }
    }
    System.out.println(" }");
  }
}