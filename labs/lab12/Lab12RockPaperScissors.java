import java.util.Scanner;
/**
 * 
 * Lab 12
 * Rock Paper Scissors
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lab12RockPaperScissors {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char player1, player2;
    
    System.out.println("Rock Paper Scissors");
    System.out.print("Player 2, close your eyes\nPlayer1 r, p or s? ");
    player1 = in.next().charAt(0);
    
    System.out.print("Player 1, close your eyes\nPlayer2 r, p or s? ");
    player2 = in.next().charAt(0);
    
    if  (player1 == player2) {
      System.out.println("Tied");
    } else if (player1 == 'r' && player2 == 's') {
        System.out.println("Player 1 wins, rock breaks scissors");
    } else if (player1 == 's' && player2 == 'p') {
              System.out.println("Player 1 wins, scissors cut paper");
    } else if (player1 == 'p' && player2 == 'r') {
              System.out.println("Player 1 wins, paper covers rock");
    } else if (player1 == 'r' && player2 == 'p') {
              System.out.println("Player 2 wins, paper covers rock");
    } else if (player1 == 's' && player2 == 'r') {
              System.out.println("Player 2 wins,  rock breaks scissors");
    } else if (player1 == 'p' && player2 == 's') {
              System.out.println("Player 2 wins,  scissors cut paper");
    }
  }
}