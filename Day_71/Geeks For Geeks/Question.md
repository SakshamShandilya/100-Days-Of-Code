# Question Topic - Brackets in Matrix Chain Multiplication

## Link - https://www.geeksforgeeks.org/problems/brackets-in-matrix-chain-multiplication1024/1

## Description

Given an array p[] of length n used to denote the dimensions of a series of matrices such that the dimension of i'th matrix is p[i] * p[i+1]. 

There are a total of n-1 matrices. Find the most efficient way to multiply these matrices together. 

As in MCM, you were returning the most effective count but this time return the string which is formed of A - Z (only Uppercase) denoting matrices & Brackets( "(" ")" ) denoting multiplication symbols. For example, if n =11, the matrixes can be denoted as A - K as n<=26 & brackets as multiplication symbols.

NOTE:

Each multiplication is denoted by putting open & closed brackets to the matrices multiplied & also Please note that the order of matrix multiplication matters, as matrix multiplication is non-commutative A*B != B*A

As there can be multiple possible answers, the console would print "True" for the correct string and "False" for the incorrect string. You need to only return a string that performs a minimum number of multiplications.


## Your Task:
You do not need to read input or print anything.

Your task is to complete the function matrixChainOrder() which takes n and p[] as input parameters and returns the string of parenthesis for n-1 matrices. Use uppercase alphabets to denote each matrix.

### Expected Time Complexity: O(n3)

### Expected Auxiliary Space: O(n2)

## Constraints:

2 ≤ n ≤ 26 

1 ≤ p[i] ≤ 500
