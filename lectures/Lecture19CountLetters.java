import java.util.Scanner;
/**
 * 
 * Code examples from the Lecture slides
 * Lecture 19 
 * Strings
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture19CountLetters {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String word;
    int counta=0;
    
    System.out.println("Enter a word: ");
    word = reader.next();
    for(int ix=0; ix < word.length();ix++) {
      if (word.charAt(ix) == 'a') {
        counta++;
      }
    }
    
    System.out.println("word "+ word + " has " + counta +" letter a");
  }
}