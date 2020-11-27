/**
 * This class illustrates comparing 2 arrays
 * lecture 19 exercise
 * 
 * @author PMCampbell
 * @version today
 **/
import java.util.Scanner;
public class Lecture19CompareArrays {
 public static void main(String[] args) {
   int array1[] = {1,2,3, 1};
   int array2[] = new int[4];
   boolean equal = true;
   array2[0] =1;
   array2[1] =6;
   array2[2] =3;
   array2[3] =1;
   System.out.println("compare array1 pointer to array2 pointer " + (array1 == array2));
   
   for (int i = 0; i < array1.length; i++) {
     if (array1[i] != array2[i]) {
       equal = false;
       System.out.println("debug: at i "+i+" array1 "+array1[i]+" array2 "+array2[i]);
     }
   }
   if (equal) {
     System.out.println("The array contents are equal");
   } else {
     System.out.println("The array contents are NOT equal");
   }
   // compare 1st element to other elements in the array
   equal = false;
   int zeroth = array1[0];
   for (int i = 1; i<array1.length; i++) {
     if (zeroth == array1[i]) {
       equal = true;
     }
   }
   if (equal) {
     System.out.println("The 0th element of the array occurs more than once");
   } else {
     System.out.println("The 0th element of the array DOES NOT occur more than once");
   }
   equal = false;
    for (int i = 0; i<array1.length; i++) {
     if (array1[i] == array1[i+1]) {
       equal = true;
     }
   }
    if (equal) {
     System.out.println("The 0th element of the array occurs more than once");
   } else {
     System.out.println("The 0th element of the array DOES NOT occur more than once");
   }   
 }
}