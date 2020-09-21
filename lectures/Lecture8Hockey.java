import java.util.Scanner;
/**
 * 
 * Code examples from the Lecture slides
 * Lecture 8 powerpoint
 * problems with 
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lecture8Hockey {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int games, goalsAgainst; 
    
    System.out.println("Enter games played:");
    games= reader.nextInt();
    System.out.println("Enter goals against");
    goalsAgainst = reader.nextInt();
    System.out.println("The average is " + goalsAgainst / games);
    // fix using tricks
    System.out.println("The average is " + (0.0 +goalsAgainst) / games);
    // fix using cast
    System.out.println("The average is " + (double)goalsAgainst / games);
  }
}