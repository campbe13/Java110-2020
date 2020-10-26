## boolean values
Given these declarations and initializations:
```java
boolean found = true;
double hours = 45.3, overtime = 15.;
int count = 20;
char ch = ‘B’;
```
To what will these expressions evaluate?
```java
!found
hours > 40.0
!found && (hours>=0)
!(found && (hours >=0))
hours + overtime <= 75 
(count >= 0) && (count <= 100)
(ch >= ‘A’ && ch <=‘Z’)
10 < count < 30
```
### Answers

* !found              
    * !found => !true => false
* hours > 40.0
    * hours > 40.0 => 45.3 > 40.0 => true
* !found && (hours>=0)
    * !found && (hours>=0) => !true && (45.3>0) => false && true => false
* !(found && (hours >=0))
    * !(found && (hours >=0)) => (true && (45.3>0) => (true && true)  => !true => false
* hours + overtime <= 75 
    * hours + overtime <= 75 => 45.3 + 15 => 60.3 <= 75 => true
* (count >= 0) && (count <= 100)
    * (count >= 0) && (count <= 100) => (20 >= 0) && (20 <= 100) => true && true => true
* (ch >= ‘A’ && ch <=‘Z’)
    * (ch >= ‘A’ && ch <=‘Z’) => 'B' >= 'A' && 'B' <= 'Z' => true && true => true
* 10 < count < 30
    * 10 < count < 30 => 10 < 20 =>  true < 30 =>  error! can't compare boolean < integer
#### What about lower case vs upper case, check the values for a-z & A-Z
* (ch >= 'a' && ch <='z')
    
