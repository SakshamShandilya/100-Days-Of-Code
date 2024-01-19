# Question Topic - Top k numbers in a stream

## Link - https://www.geeksforgeeks.org/problems/top-k-numbers3425/1


## Description

Given N numbers in an array, your task is to keep at most the top K numbers with respect to their frequency.

In other words, you have to iterate over the array, and after each index, determine the top K most frequent numbers until that iteration and store them in an array in decreasing order of frequency. 

An array will be formed for each iteration and stored in an array of arrays. If the total number of distinct elements is less than K, then keep all the distinct numbers in the array. 

If two numbers have equal frequency, place the smaller number first in the array.

## Your Task:

Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. 

You just need to complete the function kTop() that takes array a, integer n and integer k as parameters and returns the array of arrays.

### Expected Time Complexity: O(N*K).

### Expected Auxiliary Space: O(N).

## Constraints:

1 ≤ N ≤ 104

1 ≤ K ≤ 102

1 ≤ a[i] ≤ 102 
