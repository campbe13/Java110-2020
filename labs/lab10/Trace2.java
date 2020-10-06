public class Trace2 {
  public static void main(String[] args) {
    int x = 0;   // 1
    System.out.println(x);  //2 
    x = confusing(x);  // 3
    System.out.println(x);   // 9
  }
  public static int confusing(int y) {   // 4
    System.out.println(y);   // 5
    y = y + 1;    // 6
    System.out.println(y);    // 7
    return y - 1;    // 8
  }
}
/*
 main:  x   | confusing:     y        |  Screen
 1.   0      |                        |            
 2.   0      |                        |  0
 3.   0      |                        |
 4.   0      |            0           |
 5.   0      |            0           |  0
 6.   0      |            1           |
 7.   0      |            1           |  1 
 8.   0      |            0           |   
 9.   0      |            -           |  0 
 */