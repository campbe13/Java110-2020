import java.util.Scanner;
/**  
 * Lecture 8 
 * used as a scratch pad for code during lecture
 * 
 * @author PMCampbell
 * @version 2020-09-22
 */
public class Lecture8ScratchPad {
   
     public static void main(String[] args) {  double x = -b / 2 * a; 
        
       int change = 455;
       int toonies = change / 200;    // 455 / 200 -> 2
       change = change % 200;   // remainder 455 % 200 -> 55
       int loonies = change / 100;     // 55 / 100 -> 0
       change = change % 100;         // 55 % 100 -> 55 
       int quarters = change / 25;     // 55/25 ->2
       change = change % 25;            // 55 % 25 -> 5
       
       
       
       double x = 3 * 5.0 ;  
        // 3.0 * 5.0  -> 15.0
        double i = 4 + 10.0/3;   
        // 10.0 / 5.0  -> 3.3333333333333
        // 4.0 + 2.0   -> 7.333333333333
        String s = "5" + 2;
        s = "this " + "that" ;   // "this that"
        s = "that " + i;         // "that 6.0"
        // "5" + "2" -> "52"
        double i2 = 4.0 + 10/3;   
        // 10 / 3 -> 3
        // 4.0 + 3.0 -> 7.0
        
       // eval to x = (-b/2) * a  // wrong for our purposes
       double x = -b / (2 * a);
     
       /*
        5 * 6.4 -> conv to double
        6 - 4 -> int
        6.0 - 4 -> conv to double
        */
     }
}