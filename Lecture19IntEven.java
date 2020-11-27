import java.util.Scanner;
/**
 * 
 * Code examples from the Lecture slides
 * Lecture 19 
 * method to return the count of even numbers in an int array
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture19IntEven {
  public static void main(String[] args) {
    int dogAges[] =  { 10, 5, 12, 14, 15,18 };
    int dogAges2[] = new int[] { 1, 5, 2, 6 };
    int dogAges3[] = new int[5];  // have to use new int[]
    System.out.println(" array has "  + countEven(dogAges) +" even numbers");
    System.out.println(" array 2 has "  + countEven(dogAges2) +" even numbers");
  }

public static int countEven(int array[]) {
  int count =0;
  for (int ix =0; ix < array.length; ix++) {
    if (array[ix] % 2 == 0) {
      count++;
  }
  }
  return count;
}
}