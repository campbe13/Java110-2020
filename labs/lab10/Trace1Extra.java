public class Trace1Extra {
    public static void main(String[] args) {
      int x = 0, save;                                  // 1
      System.out.println(x);                      // 2
      save = confusing(x);                               // 3
      System.out.println(save);                               // 9a
      System.out.println(x);             // 9b
    }
    public static int confusing(int y) {    // 4
      System.out.println(y);       // 5
      y = y + 1;     // 6
      System.out.println(y);    // 7
      return y;    // 8
    }
  }
  /*
   main:  x    | confusing:     y       |  Screen  | save
   1.   0      |                        |             
   2.   0      |                        |  0       |
   3-4. 0      |            0           |
   5.   0      |            0           |  0
   6.   0      |            1           |
   7.   0      |            1           |  1 
   8.   0      |            1           |    
   9.a   0     |            -           |          |   1
   9.a   0     |            -           |  1        |   1
   9.b   0     |            -           |  0        |   1   
   */