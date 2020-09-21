import java.util.Scanner;
/**  
 * lab 6 from lab 4
 * Calculate perimiter of a rectangle
 * added user input
 * 
 * @author PMCampbell
 * @version 2020-09-21
 */
public class Perimeter {
   
     public static void main(String[] args) { 
       Scanner stdin = new Scanner(System.in);
       int length, width, perimeter;
       System.out.println("Calculating the perimeter of a rectangle");
       
       System.out.print("what is the length of your rectangle: ");
       length = stdin.nextInt();
       System.out.print("what is the width of your rectangle: ");
       width = stdin.nextInt();
       
       perimeter = 2 * width + 2 * length;
       System.out.println("The perimeter of the Rectangle is " + perimeter);
       System.out.print("The Rectangle width is " + width );
       System.out.println(" and length is " + length );
     }
     
     
}
