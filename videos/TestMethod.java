import java.util.Scanner;
public  class TestMethod {
  public static void main(String[] args) {
   Scanner  in = new Scanner(System.in);
   char mychar; 
   
   System.out.println("character a is a number :" +isNumber('a'));
   System.out.println("character Z is a number :" +isNumber('Z'));
   System.out.println("character 5 is a number :" +isNumber('5'));
   System.out.println("character 7 is a number :" +isNumber('7'));
   
   System.out.print("Enter a character, I will tell you if it is a number: ");
   mychar = in.next().charAt(0);
   System.out.println("character " +mychar+ " is a number :" +isNumber(mychar));
  }
  
  public static boolean isNumber(char ch) {
    if (ch < '0' || ch > '9') {
      return false;
    }
    return true;
  }
}