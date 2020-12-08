/**
 * lab 21
 * 
 * method to swap values in an array
 * create a new array
 *
 * */
public class Lab21SwapValues {
  public static void main(String args[]) {
  int array[] = { 3,4,5,6,7 } , swapped[];
  int array2[] = {1,2,9,8,7,6,5,4};
  
  swapped = swapValues(array, 2 ,array.length-1);
  printArray(array, "original array");
  printArray(swapped, "new array after swap");
  System.out.println("array address" + array);
  System.out.println("swapped address" + swapped);
  printArray(array2, "array2 before swap");
  swapValuesInPlace(array2, 0, array2.length-1);
  printArray(array2, "array2 after swap");
  System.out.println("array2 address" + array2);
}
/**
 * given an int array and 2 positions in the array
 * create a new array with the values swapped at 
 * those positions
 * 
 * @param int array[] original array
 * @param first value to swap
 * @param second value to swap
 * 
 * @return new array with swapped values 
 */
public static void swapValuesInPlace(int array[], int pos1, int pos2) {
  int save;
  save = array[pos1];
  array[pos1] = array[pos2];
  array[pos2] = save;
}

  /**
 * given an int array and 2 positions in the array
 * create a new array with the values swapped at 
 * those positions
 * 
 * @param int array[] original array
 * @param first value to swap
 * @param second value to swap
 * 
 * @return new array with swapped values 
 */
public static int[] swapValues(int array[], int pos1, int pos2) {
  int  swapped[],  save;
  swapped = new int[array.length];
  // deep copy of my array (== duplicate it in memory)
  for (int i=0; i <array.length; i++) {
    swapped[i] = array[i];
  }
  save = swapped[pos1];
  swapped[pos1] = swapped[pos2];
  swapped[pos2] = save;
  return swapped;
}
/**
   * display contents of an array with {}
   * 
   * @param array array to be printed
   */
  public static void printArray(int array[], String header) {
    System.out.print(header);
    System.out.print("{ ");
    for(int i=0;i <array.length; i++) {
      if (i == array.length-1) {
        System.out.print(array[i]);
      }else { System.out.print(array[i] + ","); }
    }
    System.out.println(" }");
  }
}
