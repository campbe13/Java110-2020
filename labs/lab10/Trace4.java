public class Trace4 {
  public static void main(String[] args) {
    int x = 0;            // 1
    int y = 1;            // 2
    confusing(y);    // 3
  } 
  public static void confusing(int x) {  // 4
    if (x < 0) {                        // 5
      System.out.println(-x);   
    }
    else {
      System.out.println(x);    // 6
    }
  }
  
}
/*
 main:   x | y  | confusing:  x  |  Screen
 1.      0 |    |                |   
 2.      0 | 1  |                |   
 3.      0 | 1  |                |   
 4.      0 | 1  |             1  |   
 5.      0 | 1  |(1<0 false)  1  |   
 6.      0 | 1  |             1  |    1  
 */