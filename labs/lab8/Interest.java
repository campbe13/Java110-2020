import java.util.Scanner;
/**  
 * Lab8 
 * calculate interest based on the formula
 * Amount = P (1 + r) ^ t
 * P  principal to start with
 * r  anual interest rate
 * t  time
 * 
 * input:   principal, interest rate, time.
 * 
 * @author PMCampbell
 * @version 2020-09-25
 */
public class Interest {
   
     public static void main(String[] args) {  
       Scanner in = new Scanner(System.in); 
       double interest, principal, time;
              
       System.out.println("Calculate interest ");
       
       System.out.print("Bank account balance: ");
       principal = in.nextDouble();
       System.out.print("Interest rate: ");
       interest = in.nextDouble();
       interest = interest / 100;
       System.out.print("Time: ");
       time = in.nextDouble();
       
       System.out.println("Principal "+ principal);
       System.out.println("Interest  "+ interest);
       System.out.println("Time      "+ time);

       System.out.println("\nInterest earned "
                 + (principal * Math.pow(1+interest, time)));
     }
}