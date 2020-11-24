import java.util.Scanner;
/**
 * 
 * Code examples from the Lecture slides
 * Lecture 19 
 * Strings count letters
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture19CountLetters {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    // Strings are a collections of chars   
    String word;
    int counta = 0;
    
    // note: if you type in anything with space 
    // Scanner.next() considers it the end of the input
    // and will stop reading at that point
    System.out.println("What is your favourite word? ");
    word = reader.next();
    
    System.out.println( word.length());
    System.out.println("length "+ word.length());
    System.out.println("1st char " + word.charAt(0));
    System.out.println("last char " + word.charAt(word.length()-1));
    
    // count the occcurences of the letter a
    for (int i=0; i < word.length();i++) {
      if (word.charAt(i) == 'a') {      // we have to use a char
        counta++;
      }
    }       
    System.out.println("counted " + counta + " occurrences of a");
  }
}