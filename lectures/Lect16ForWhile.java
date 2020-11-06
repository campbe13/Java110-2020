import java.util.Scanner;
/**
 *
 * Lecture 16 for & while loops
 *
 * @author P.M.Campbell
 * @version 2020-fall
 *
 */
public class Lect16ForWhile{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
  }
    System.out.println("end " +i);
    for (int j=0 ;j < 5;j++) {
      System.out.println(j);
  }
    // j is inside the scope of the for loop 
    // so not possible:
    // System.out.println("end " +j);
    int k;
    for (k=0 ;k < 5;k++) {
      System.out.println(k);
  }
    System.out.println("end " +k);
  }
}  