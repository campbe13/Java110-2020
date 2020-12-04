import java.util.Scanner;
/**
 * This class is to test lab19 
 * Write a method setArray2 that takes as input an int size 
 * and returns an array of size size with numbers ranging 
 * from 0,1,2,….size-1. 
 * For example, if size is 4, the method should return the array {0,1,2,3}
 * 
 * @author PCampbell
 * @version 2020-12 
 */
public class Lab19SetArray2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int array1[], array2[], array3[], array4[], size;
    
    array1 = setArray2(3);
    array2 = setArray2(4);
    array3 = setArray2(10);
    
    System.out.print("What size array? ");
    size = in.nextInt();
    array4 = setArray2(size);
    
    printArray(array1);
    printArray(array2);
    printArray(array3);
    printArray(array4);
    
  }
  /**
   * create an array, init with same as ix
   * 
   * @param size size of the array
   * @return the int array
   */
  public static int[] setArray2(int size) {
    int array[];
    array = new int[size];
    // wow !! int arrays are init to zero! 
    for(int i=0;i <array.length; i++) {
      //array[i] = i;    // array[0] = 0 etc
      array[i] = i+1;    // array[0] = 1 array[1] = 2 etc
    }
    return array;
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



