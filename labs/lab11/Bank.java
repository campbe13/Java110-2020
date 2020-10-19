import java.util.Scanner;
/**
 * 
 * Lab 11
 * calculate service charges for a cheque
 *   
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Bank {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double amount, service=0;
    
    System.out.println("Calculating Service Charge");
    
    System.out.print("Enter a cheque amount:");
    amount = in.nextDouble();
    if (amount < 10) {
      service = amount * .01;
    } else if (amount >= 10) {
      if (amount < 100) {
        service = amount * .1;
      } else if (amount < 1000) {
        service = 5+ amount * .05;
      } else {
        service = 40 +amount * .01;
      }
    }
    System.out.println("Check value:     "+amount);
    System.out.println("Service charge:  "+service);
  }
}