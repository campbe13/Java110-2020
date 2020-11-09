# lab 16
## question 1
What prints in the following code?

```java
int x = 3;
int y = ++x;
int z = x++;
int a = --x;
a += z;
System.out.println(x + " " + y + " " + z + " " + a);
```
### Trace: 

| x | y | z | a | Note |
|---|---|---|---|------|
| 3| | | |  |
| 4|4| | |         add before assign |
| 5|4|4| |         add after assign |
| 4|4|4|4|         subtract before assign |
| 4|4|4|8|        |

```
4 4 4 8 
```
## question 2
What prints in the following code?
```java
int x = 3;
int y = 2;
int z = x++ + ++y;

System.out.println(x + " " + y + " " + z);
```

### Trace :

| x | y | Note |
|---|---|---|
| 3| | | |
| 3| 2 | | |
| 4 | 3 |  6 |     add to y before (3) , add to x after (3)  so 3 + 3 = 6  |
```
4 3 6
```