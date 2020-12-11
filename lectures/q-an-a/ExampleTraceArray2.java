public class ExampleTraceArray2 {
  public static void main(String[] args) {
    int[] a = new int[] { 1, 3, 10, 5};
    int ret;
    System.out.println(a[0]);
    ret = stuff(a);  // a[0] returned by stuff
    System.out.println(ret);
    System.out.println(a[0]);
  }
  public static int stuff(int[] a) {
    System.out.println(a[0]);
    a[0] = 50;
    System.out.println(a[0]);
    return a[0];
  }
 }
