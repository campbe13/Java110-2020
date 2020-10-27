# Part 1 theory
1. Given these declarations and initializations:
```
char c = ‘d’;
char d = ‘3’;
```
To what will these expressions evaluate?
```
c >= ‘a’ && c <= ‘z’     
c + 4
d + 2
```
* c >= ‘a’ && c <= ‘z’      evaluates to true because both are true
* c + 4                     evaluates to 'h'  
* d + 2                     evaulates to '5'

2.	Assume you have a char variable c. Write a Boolean expression to check if the character stored in c represents a letter between g and s upper & lower case. 
```
(c >= 'g' && c <= 's')  || (c >= 'G' && c <= 'S') 
```
3.	(Bonus: Try this on your own) Write an algorithm to print the first 1000, negative numbers (i.e. -1,-2,-3,-4,-5,…) We will be looking at repetition in the next class. (Hint: How do you keep track of when to stop the program?)
