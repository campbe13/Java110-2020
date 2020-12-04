import java.util.Scanner;
/**  
 * Lecture 21 
 * calling methods
 * pass arguments by value
 * 
 * @author PMCampbell
 * @version 2020-12-01
 */
public class Lecture21PassReference {
  
  public static void main(String[] args) {  
    double[] z =  { 1.0, 2.0};
    double[] q =  { 1.0, 3.0, 4.0 };                
    
    //printArray(z, "Array z, before calling foo() ");
    printArray(q, "Array q, before calling foo() ");
    foo(q , z);
    //printArray(z, "Array z, after calling foo() ");
    printArray(q, "Array q, after calling foo() ");
    
  }
  /**
   * fake method to illustrate
   * that an array as an argument is a pointer
   * 
   * we cannot change the pointer itself  
   * but we can change the content of the array
   */
  public static void foo(double x[], double y[]) {
    y[0]= 5;
    x[1] = 123;
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