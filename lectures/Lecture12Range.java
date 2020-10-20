import java.util.Scanner;
/**
 * 
 * Lecture 12
 * misc content: if && range check
 *   
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture12Range {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num;
        
    System.out.print("enter a number between 15 & 85 inclusive");
    num = in.nextInt();
    System.out.println(num +" "+ (num>=15));
    System.out.println(num +" "+ (num<=85));
    if (num >=15  && num <= 85) {
      System.out.println("valid number");
    }  else {
      System.out.println("invalid number try again");  
    }
  }
}