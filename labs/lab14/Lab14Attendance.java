import java.util.Scanner;
/**
 *
 * Lab 14
 * implement checkAttendance
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab14Attendance {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int held, attended;
    
    System.out.println("Attendance Verification");
    
    System.out.print("Enter number of classes held this term");
    held = in.nextInt();
    
    System.out.print("Enter number of classes attended this term");
    attended = in.nextInt();
    
    if (checkAttendance(held, attended)) {
       System.out.println("Student can write the exam.");
    } else {
       System.out.println("Student cannot write the exam.");
    }
  }
   /* 
  * checkAttendance
  * 
  * @param held number of classes held 
  * @param attended number of classes attended
  * @return boolean  true if attended 75% of classes 
  */
  public static boolean checkAttendance(int held, int attended) {
     // what happens if we omit the cast (double) ?
     double ratio   = (double)attended/held;
     System.out.println("Percentage of classes attended "+ratio);
     if (ratio >= 0.75) {
       return true;
     } else {
       return false;
     }
     // instead of if block could do this
     // return (ratio >= 0.75)   
  }
}