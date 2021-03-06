/**
 * This class illustrates exercises from the slide deck for the course
 * 
 * Arrays
 * Parallel arrays
 * Copy Arrays  (Shallow & Deep)
 * 
 * @author PMCampbell
 * @version today
 **/
import java.util.Scanner;
public class Lecture19ArrayCopy {
 public static void main(String[] args) {
  
   int array[]  = { 2, 4, 6, 8, 10 };
   int array2[];

   // shallow copy, both arrays refer to the same area in heap
   // not a copy, you are using two pointers for the same array
   array2 = array;
   System.out.println("shallow copied array:"); 
   System.out.println("array[2] contains " + array[2]);
   System.out.println("array2[2] contains " + array2[2]);
   
   array[2] = 99;
   array2[2] = 5;
   System.out.println("after mod array[2] = 99 and array2[2] = 5");   
   System.out.println("array[2] contains " + array[2]);
   System.out.println("array2[2] contains " + array2[2]);
   System.out.println("are they equal?  " + (array2 == array));

   // deep copy, different area in heap for each array
   System.out.println("deep copied array:"); 
   array2 = new int[5];
   for (int i = 0; i < 5; i++) {
    array2[i]  = array[i];
   }
   System.out.println("array[2] contains " + array[2]);
   System.out.println("array2[2] contains " + array2[2]);

   array[2] = 99;
   array2[2] = 15;
   System.out.println("after mod array[2] = 99 and array2[2] = 15");   
   System.out.println("array[2] contains " + array[2]);
   System.out.println("array2[2] contains " + array2[2]);
   System.out.println("are they equal?  " + (array2 == array));
   
  } //main()
} // ArraySize