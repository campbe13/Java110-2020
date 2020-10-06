public class Trace3 {
  public static void main(String[] args) {
    int x = 0;     // 1
    int y = 2;      // 2
    confusing(x + y);    // 3
    // 9
  }
  public static int confusing(int x) {  // 4
    return more(x * x);  // 5
  }
  
  public static int more(int y) {  // 6
    System.out.println(y); // 7
    return y;  // added // 8 
  }
}
/*
 main:   x | y  | confusing:  x  |  more y   | Screen
 1.      0 |    |                |           |
 2.      0 | 2  |                |           |
 3.      0 | 2  |    (2+0)       |           |
 4.      0 | 2  |             2  |           |
 5.      0 | 2  |             2  |   (2*2)   |
 6.      0 | 2  |             2  |     4     |
 7.      0 | 2  |             2  |     4     |   4
 8.      0 | 2  |             2  |     4     |   
 9.      0 | 2  |             -  |     -     |   
*/