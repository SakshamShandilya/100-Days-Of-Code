# Question Topic - Recamans sequence


## Link - https://www.geeksforgeeks.org/problems/recamans-sequence4856/1


## Description

Given an integer n, return the first n elements of Recaman’s sequence.

It is a function with domain and co-domain as whole numbers. It is recursively defined as below:

Specifically, let a(n) denote the (n+1)th term. (0 being the 1st term).

The rule says:

a(0) = 0

a(n) = a(n-1) - n, if a(n-1) - n > 0 and is not included in the sequence previously
       =  a(n-1) + n otherwise.

## Your Task:
You do not need to read input or print anything. Your task is to complete the function recamanSequence() which takes n as the input parameter and returns the sequence.

### Expected Time Complexity: O(n)

### Expected Auxiliary Space: O(n)

## Constraints:

1 ≤ n ≤ 105
