import java.util.Scanner;
/**  
 * Lab7  
 * given a total number of cents
 * make change in toonies, looines, quarters, dimes, nickles, pennies
 * 
 * @author PMCampbell
 * @version 2020-09-22
 */
public class MakeChange {
   
     public static void main(String[] args) {  
       Scanner in = new Scanner(System.in); 
       int check, change, toonies, loonies, quarters, dimes, nickles, pennies;
       
       System.out.print("How many cents do you have? ");
       change = in.nextInt();
       System.out.println("Total "+ change + " cents");
       
       check = change;
       toonies = change / 200; 
       change = change % 200;   
       loonies = change / 100;
       change = change % 100;     
       quarters = change / 25;
       change = change % 25;      
       dimes = change / 10;   
       change = change % 10;      
       nickles = change / 5;   
       pennies = change % 5;
       
       // verify my results
       check = check - (toonies * 200 + loonies * 100 + quarters * 25 +
                dimes * 10 + nickles * 5 + pennies);

       System.out.println("toonies  $2.00 "+ toonies);
       System.out.println("loonies  $1.00 "+ loonies);
       System.out.println("quarters $0.25 "+ quarters);
       System.out.println("dimes    $0.10 "+ dimes);
       System.out.println("nickles  $0.05 "+ nickles);
       System.out.println("pennies  $0.01 "+ pennies);

       System.out.println("if this is zero we did it correctly: " + check);
     }
}