# Question Topic - Boolean Parenthesization

## Link - https://www.geeksforgeeks.org/problems/boolean-parenthesization5610/1

## Description

Given a boolean expression s of length n with following symbols.

Symbols

    'T' ---> true
    
    'F' ---> false
    
and following operators filled between symbols

Operators

    &   ---> boolean AND
    
    |   ---> boolean OR
    
    ^   ---> boolean XOR
    
Count the number of ways we can parenthesize the expression so that the value of expression evaluates to true.

Note: The answer can be large, so return it with modulo 1003


## Your Task:

You do not need to read input or print anything. 

Your task is to complete the function countWays() which takes n and s as input parameters and returns number of possible ways modulo 1003.

### Expected Time Complexity: O(n3)

### Expected Auxiliary Space: O(n2)

## Constraints:

1 ≤ n ≤ 200 
