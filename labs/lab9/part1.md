# part 1 theory
For any of the below, I suggest you try doing these in code, 
make sure they compile & run & display the output.

## 1. which are valid, given

and variables ``` double x;   int y;``` have assigned values

Remember, widening conversions are automatic:
```
byte -> short -> int -> long -> float -> double
char -> int -> long -> float -> double
```

```
a.	long z = x;       // double to long  -- invalid
    long z = (long) x; 
b.	long z = y;         // int to long, ok
c.	double c = x/y;     // double to double, ok
d.	int c = x/y;           // doulble to int -- invalid
    int c = (int)(x/y);
e.	double b = 5/4;         // int to double, ok
f.	double b = (double) 5/4;        // double to double, ok
g.	int b = (int) 3*2.5;            // int to int, ok
h.	int b =  3*(int) 2.5;           // int to int, ok
i.	double a = (double)((int)3.0/(int)4.0);     // double to double, ok
j.	int a = Math.pow(3,2);          // double to int -- invalid (Math.pow ok)
    int a = (int)Math.pow(3,2);
k.	int a = Math.pow(3.5,2);        // double to int -- invalid (Math.pow ok)
    int a = (int)Math.pow(3.5,2);
l.	int a = (int) Math.sqrt(4);     // int to int, ok
```

## 2. given this code, determine scope of variables
In the code below, what variables are in scope at the part of code labelled SPOT A, B, C,  and D? (Answer for each labelled spot separately)
```java
public class Methods {
	public static void main(String[] args) {
		// SPOT A
        int x = 0;
		int y = 2;
		/// SPOT B
		foo(x);
		int r = 3;
		// SPOT D
	}
	public static void foo(int p) {
		int z = 3;
		// SPOT C	
	}
}
```
### Answer
A nothing   (only args)
B x and  y   (and args)
C p and z
D x and y and r (and args)
## 3. In the above code (2.) would we be allowed to declare a variable called x at SPOT C ? Why or why not?
yes you would, because x only exists in main() this would be a new separate x.
## 4. In the above code, (2.) what is String[] args?
it is the parameter for the main method
## 5.	Consider the following code: What will print? 
After you have come up with an answer, check your answer by putting it into the computer and running the program. Make sure you understand why the results are what they are.
```java
public class Methods {
	public static void main(String[] args) {
        int x = 0;
		System.out.println(x);
		confusing(x);
		System.out.println(x);
	}
	public static void confusing(int y) {
		System.out.println(y);
        y = y + 1;	
		System.out.println(y);
	}
}
```
### Answer
0        // main x
0        // confusing y
1        // confusing y
0        // main x
}
## 6.	Consider the following code: What will print? 
After you have come up with an answer, check your answer by putting it into the computer and running the program. Make sure you understand why the results are what they are.
```java
public class Methods {
	public static void main(String[] args) {
        int x = 0;
		System.out.println(x);
		confusing(x);
		System.out.println(x);
	}
	public static void confusing(int x) {
		System.out.println(x);
        x = x + 1;	
		System.out.println(x);
	}
}
```
### answer
0
0
1
0
## 7.	Consider the following code: What will print? 
After you have come up with an answer, check your answer by putting it into the computer and running the program. Make sure you understand why the results are what they are.

```java
public class Methods {
	public static void main(String[] args) {
    int x = 0;
    int y = 1;
    confusing(y,x);
	}
	public static void confusing(int x, int y) {
		System.out.println(x);
		System.out.println(y);
	}
}
```
### answer
1
0



