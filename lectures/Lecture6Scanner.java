import java.util.Scanner;

public class Lecture6Scanner {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // read in a floating point number
    
    // read in an integer
    System.out.print("What is your name: ");
    String name = input.nextLine();
    
    System.out.println("how many fingers do you have?");
    int fingers = input.nextInt();
    
    System.out.print("What is the USD exchange for a CAD: ");
    double  dollars = input.nextDouble();
   
    System.out.println("\n\nHello " + name);
    System.out.println("you have " + fingers + " fingers");
    System.out.println("1.00$ CAD is worth  " + dollars + "$ US");
  }
}