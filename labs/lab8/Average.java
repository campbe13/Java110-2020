import java.util.Scanner;
/**  
 * Lab 8 from lab 6
 * The average of 3 numbers user input
 * added cast to double
 * 
 * @author PMCampbell
 * @version 2020-09-21
 */
public class Average {
   
     public static void main(String[] args) { 
       Scanner stdin = new Scanner(System.in);
       int num1, num2, num3;
       System.out.println("Calculating the average of 3 numbers");
       
       System.out.print("First number: ");
       num1 = stdin.nextInt();
       System.out.print("Second number: ");
       num2 = stdin.nextInt();
       System.out.print("Third number: ");
       num3 = stdin.nextInt();
       
       System.out.println("The average is " + ((double)num1+num2+num3)/3);
     }   
}
