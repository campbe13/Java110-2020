# number conversion
## Binary  to Decimal
Convert the following to base 10 (decimal)

0011 1000 = 2\^3 + 2\^4 + 2\^5 = 8 + 16 + 32 = 56 base 10

1110 0111 = if unsigned 2\^7 + 2\^6 +2\^5 + 2\^2 + 2\^1 + 2\^0 = 231
base 10

1110 0111 = if signed, using signed magnitude (leftmost reserved for
sign) 2\^6 +2\^5 + 2\^2 + 2\^1 + 2\^0 = -103 base 10

1110 0111 = if signed, using 2s complement (reverse 2s comp, don't worry
if you can't do this)\
subtract 1 -\> 1110 0110\
flip bits -\> 0001 1001 -\> 2\^4 + 2\^3 + 2\^0 -\> -25 base 10

## Decimal to Binary 
Convert the following to base 2 (binary)

-73 base 10 = 1011 0111 base 2 (2s compliement)\
convert 73 to binary

73/2 -\> 36 rem 1\
36/2 -\>18 rem 0\
18/2 -\> 9 rem 0\
9/2 -\> 4 rem 1\
4/2 -\> 2 rem 0\
2/2 -\> 1 rem 0\
1/2 -\> 0 rem 1

73 -\> 0100 1001 base2\
subtract 1 -\> 0100 1000\
flip bits -\> 1011 0111

51 base 10 = 0011 0011 base 2\
51/2 -\> 25 rem 1\
25/2 -\> 12 rem 1\
12/2 -\> 6 rem 0\
6/2 -\> 3 rem 0\
3/2 -\> 1 rem 1\
1 / 2 -\> 1 rem 1
