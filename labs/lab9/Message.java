/**
 * 
 * Lab 9 
 * weird request display a message
 *   
 * void method, no parameters
 *  
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Message {
  public static void main(String[] args) {
    int total_hours_wasted_here = 39;
    System.out.println("Dear maintainer:");
    printThreeNewLines();
    System.out.println("Once you are done trying to 'optimize' this program, and have realized what a terrible mistake that was, please increment the following counter as a warning to the next guy:");
    printThreeNewLines();
    System.out.println("total_hours_wasted_here "+total_hours_wasted_here);
  } 
/**
 * print 3 blank lines
 *  
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
  public static void printThreeNewLines() {
    /* you can use \m
     System.out.println("\n\n");
     or you can call print 3 times
     */
     System.out.println();
     System.out.println();
     System.out.println();
  }
}