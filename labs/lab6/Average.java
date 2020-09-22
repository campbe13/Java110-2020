import java.util.Scanner;
/**  
 * lab 6
 * The average of 3 numbers
 * added user input
 * 
 * @author PMCampbell
 * @version 2020-09-21
 */
public class Average {
   
     public static void main(String[] args) { 
       Scanner stdin = new Scanner(System.in);
       double num1, num2, num3;
       System.out.println("Calculating the average of 3 numbers");
       
       System.out.print("First number: ");
       num1 = stdin.nextInt();
       System.out.print("Second number: ");
       num2 = stdin.nextInt();
       System.out.print("Third number: ");
       num3 = stdin.nextInt();
       
       System.out.println("The average is " + (num1+num2+num3)/3);
     }   
}
