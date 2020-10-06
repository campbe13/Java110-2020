import java.util.Scanner;
/**
 * 
 * Code examples from the Lecture slides
 * Lecture 10 powerpoint
 *   
 * convert temperature Fahrenheit to Celcius
 *  *  
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture10FtoC {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double f, c;
    System.out.println("Convert F to C");
    
    System.out.println("Enter a temp in Fahrenheit:");
    f  = in.nextDouble();
    c = convertFahrenheitToCelcius(f);
    /*
     * \u9999  get the ascii value of the number
     * \u00B0  get the ascii value B0     
     * B0 base 16 == 176 base 10  == degree character
     
    System.out.println("\u0061 \u0062 \u0063");  // ridiculous don't do this
    System.out.println("a b c");
    */
    System.out.println(f+ "\u00B0 F is "+ c + "\u00B0 C ");
    System.out.println(f+"\u00B0 F is "+ Math.round(c) +"\u00B0 C (rounded)");
    System.out.println("Water freezing point in Celcius is "+ convertFahrenheitToCelcius(32)); 
    System.out.println("Water boiling point in Celcius is "+ convertFahrenheitToCelcius(212)); 
    System.out.println("Water freezing point on mars is Celcius is "+ 10*convertFahrenheitToCelcius(212)); 
    System.out.println("\u00A9  2020 P.M.Campbell");     
    convertFahrenheitToCelcius(212);  // ignore return value
    // convertFahrenheitToCelcius("123",123);  check the header
  }
  /**
   * Convert Fahrenheit to Celcius
   * ref https://en.wikipedia.org/wiki/Fahrenheit
   * 
   * @param f     temperature in fahrenheit
   * @return      fahrenheit converted to celcius
   * 
   * @author PCampbell
   * @version 2020-10-05
   */
  public static double convertFahrenheitToCelcius(double f) {
    return (f - 32.0 ) * 5.0 / 9.0;
  }
}