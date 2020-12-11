import java.util.Scanner;
import java.util.Random;
/*
 * Lab 22 array exercise 1
 * Write a method which takes as input 2 numbers, max and size. 
 * The method should create and return an array of size size filled with 
 * random integers greater than or equal to 0 and less than max.
 * 
 * 
 * @author PCampbell
 * @version 2020-12
 */

public class Lab22RandomArray {
  public static void main (String[] args) {
    //Scanner in = new Scanner (System.in);
    
    int array[], arraytoo[],array649[];
    array = randomArray(7,5);
    printArray(array);
    arraytoo = randomArray(999,15);
    printArray(arraytoo);
    array649 = randomArray(50,6);
    printArray(array649);
  }

/**
 * create an array of size size, of ints
 * initialize with random numbers between 0 & 
 * less than max
 * 
 * @param max maximum random number (min 0) 
 * @param size size of the array to be created
 * @return int array with random values
 */
public static int [] randomArray(int max, int size) {
  Random rand = new Random(); 
  int array[] = new int[size];
  // random generates a number 
  // we want an int, between 0- (max-1)
  // rand.nextInt(x);  // generate an int between 0 & x-1
  for (int i = 0; i<array.length; i++) {
    array[i] = rand.nextInt(max);
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

