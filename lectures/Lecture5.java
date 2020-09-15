/** 
 * this code illustrates integer vs floating point division 
 * using integer literals and floating point literals
 * PMCampbell
 * 2020-09-15
 */ 
public class Lecture5 {
  public static void main(String[] args) {
    System.out.println("Integer values 1/2 + 1/2 = " + (1/2 + 1/2));  // integer division
    System.out.println("Integer values 1/2 + 1/2 = " + (1.0/2.0 + 1./2.));   // floating point division
  }
}