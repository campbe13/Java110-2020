import java.util.Scanner;
/**
 *
 * Lab 14
 * implement getDay
 * given an int 1-7 show the day
 * assuming Sunday is day 1
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lab14Day {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int dayNum; String day;
    
    System.out.println("Day of week");
    
    System.out.print("Enter a number between 1-7 ");
    dayNum  = in.nextInt();
    
    if (dayNum >= 1 && dayNum <=7) {
      day = getDay(dayNum);
      System.out.print("Number "+dayNum +" represents " + day);
      if (isWeekend(day)) {
        System.out.println(" it's the weekend!");
      } else {
        System.out.println(" it's NOT the weekend!");
      }
    }  else {
      System.out.print("Invalid value");
    }
    
  }
  /* 
   * getDay
   * assumes the param is between 1-7
   * returns the day of week associated with it
   * assumes 1 is Sunday
   * 
   * @param day number between 1-7
   * @return String  day of week
   */
  public static String getDay(int day) {
    if (day == 1) {
      return "Sunday"; 
    } else if (day == 2) {
      return "Monday"; 
    } else if (day == 3) {
      return "Tuesday"; 
    } else if (day == 4) {
      return "Wednesday";
    } else if (day == 5) {
      return "Thursday";
    } else if (day == 6) {
      return "Friday";
    } else if (day == 7) {
      return "Saturday";
    } else {
      return "Sunday";
    }
  }
  /* 
   * isWeekend
   * returns true if the day is Sunday or Saturday
   * 
   * @param day string 
   * @return boolean false if not Sunday or Saturday
   */
  public static boolean isWeekend(String day) {
    return (day == "Sunday"  || day == "Saturday" );
  }

  /* 
   * isWeekendInt
   * assumes the param is between 1-7
   * returns true if the day is Sunday or Saturday
   * assumes 1 is Sunday 
   * 
   * @param day number between 1-7
   * @return boolean false if not Sunday or Saturday
   */
  public static boolean isWeekend(int day) {
    return (day == 1 || day == 7);
  }
}
