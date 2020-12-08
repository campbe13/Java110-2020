import java.util.Scanner;
/**
 * lecture 22
 * 
 * while vs do-while
 * 
 * 
 * */
public class Lecture22doWhile {
  public static void main(String args[]) {
    int num;
    Scanner in = new Scanner(System.in);
    
    num = in.nextInt();
    // if num is -ve executed >= 1  times
    // validate for +ve number >0
    while (num < 0 ) {
      System.out.println("Try Again: ");
      num = in.nextInt();
    }
    System.out.println("Thanks-after while");
    // no need to prime the condition
    // executed at least once, no matter what 
    do {
      System.out.println("Try Again: ");
      num = in.nextInt();
    } while(num < 0);
    System.out.println("Thanks-after do while");
  }
}