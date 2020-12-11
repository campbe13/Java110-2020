public class ExampleTraceArray {
  public static void main(String[] args) {
    int[] a = new int[] { 1, 3, 10, 5};
    int b[];
    System.out.println("inside main");
    System.out.println(a.length);
    System.out.println(a);
    b = stuff(a);
    //stuff(a);
    System.out.println("inside main");
    System.out.println(a.length);
    System.out.println(a);
    System.out.println(b.length);
    System.out.println(b);
  }
  
  public static int[] stuff(int[] a) {
  //public static void stuff(int[] a) {
    System.out.println("inside stuff");
    System.out.println(a.length);
    System.out.println(a);
    a = new int[100];
    System.out.println(a.length);
    System.out.println(a);
    return a;
  }
}
