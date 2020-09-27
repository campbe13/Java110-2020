# part 1 theory
For any of the below, I suggest you try doing these in code, 
make sure they compile & run & display the output.

## 1. which are valid, given
Signiature ```Dawson.fun(double, int) -> double```

and variables ``` double x;   int y;```

```
a.	Dawson.fun(10.0, 3 + 2);    // OK
b.	Dawson.fun(x, y);           // OK
c.	Dawson.fun(double x, int y);    // nope!
d.	Dawson.fun();                   // nope!
e.	Dawson.fun(“x”, “y”);           // nope!
f.	double r = Dawson.fun(2,3);     // OK widening conv 2-> 2.0
g.	int q = Dawson.fun(3, 4);       // nope!    returns double
h.	int r = (int) Dawson.fun(2,10) + 10;    // OK
i.	double z = Dawson.fun(3, 4.0 + 2);      // nope!  2nd arg double
j.	double a = Dawson.fun( Dawson.fun(10, 3), 3);    // OK
k.	double b = Dawson.fun( Dawson.fun(10,3), Dawson.fun(10,2));  // nope!  2nd call to Dawson.fun returns double
l.	double c = Dawson.fun( Dawson.fun(10, 3), (int) Dawson.fun(10,2));  // OK
```