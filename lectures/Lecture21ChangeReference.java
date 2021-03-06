import java.util.Scanner;
/**  
 * Lecture 21 
 * calling methods
 * pass arguments by value
 * 
 * @author PMCampbell
 * @version 2020-12-01
 */
public class Lecture21ChangeReference {
  
  public static void main(String[] args) {  
    double[] z =  { 1.0, 2.0};
    double[] q =  { 1.0, 3.0, 4.0 };                
    
    printArray(z, "Array z, before calling foo() ");
    foo(q , z);
    printArray(z, "Array z, after calling foo() ");
    
  }
  /**
   * fake method to illustrate
   * that an array as an argument is a pointer
   * 
   * we cannot change the pointer itself  
   * but we can change the content of the array
   */
  public static void foo(double x[], double y[]) {
    double q[] = new double[3];
    y = new double[] {5,10,15,20,25 };
    y[3] = 55;
    // now y is pointing to a new array,  
    // not the same one it came in with
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