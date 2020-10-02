public class Trace1 {
 public static void main(String[] args) {
        int x = 0;     // 1
  System.out.println(x);  // 2
  confusing(x);   // 3
  System.out.println(x);  // 8
 }
 public static void confusing(int y) {  // 4
  System.out.println(y);    // 5
        y = y + 1;    // 6
  System.out.println(y);   // 7
 }
}
/*
  main:  x   | confusing:     y       |  Screen
 1.   0      |                        |            
 2.   0      |                        |  0
 3-4. 0      |            0           |
 5.   0      |            0           |  0
 6.   0      |            1           |
 7.   0      |            1           |  1 
 8.   0      |            -           |  0 
 */