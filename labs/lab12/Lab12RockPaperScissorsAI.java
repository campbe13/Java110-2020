import java.util.Scanner;
/**
 * 
 * Lab 12
 * Rock Paper Scissors + AI (cheating)
 * 
 * @author P.M.Campbell
 * @version 2020-fall
 * 
 */
public class Lab12RockPaperScissorsAI {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char player1, player2;   // player 1 is human, player2 is AI
    
    System.out.println("Rock Paper Scissors");
    System.out.println("Player 2 is AI\n");
    
    System.out.print("Opponent, what is your play r, p or s? ");
    player1 = in.next().charAt(0);
    
    // cheating, choose a winning throw, depending on player 1's move
    if (player1 == 'r') {
      player2 = 'p';
    } else if (player1 == 'p') {
      player2 = 's';
    }  else {  // only other possibility is s 
      player2 = 'r';
    }
    
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