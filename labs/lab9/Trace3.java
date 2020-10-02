public class Trace3 {
 public static void main(String[] args) {
    int x = 0;    // 1
    int y = 1;      // 2
    confusing(y,x);  // 3 -> confusing ( 1 , 0)
    confusing(9, 8);
 }
 public static void confusing(int x, int y) {  // 3
  System.out.println(x);   // 4
  System.out.println(y);   // 5
 }
}
/*
  main:  x | y  | confusing:  x  | y      |  Screen
 1.      0 |    |                |        |
 2.      0 | 1  |                |        |
 3.      0 | 1  |             1  | 0      |
 4.      0 | 1  |             1  | 0      |   1
 5.      0 | 1  |             1  | 0      |   0
*/