public class Trace2 {
 public static void main(String[] args) {
        int x = 0;   // 1
  System.out.println(x);  //2 
  confusing(x);  // 3
  System.out.println(x);         
 }
 public static void confusing(int x) {   // 4
  System.out.println(x);   // 5
        x = x + 1;    // 6
  System.out.println(x);  }  // 7
}
/*
  main:  x   | confusing:     x       |  Screen
 1.   0      |                        |            
 2.   0      |                        |  0
 3-4. 0      |            0           |
 5.   0      |            0           |  0
 6.   0      |            1           |
 7.   0      |            1           |  1 
 8.   0      |            -           |  0 
 */