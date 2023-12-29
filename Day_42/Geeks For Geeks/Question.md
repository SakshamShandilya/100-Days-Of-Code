# Question Topic - Check if a string is repetition of its substring of k-length

### Link - https://www.geeksforgeeks.org/problems/check-if-a-string-is-repetition-of-its-substring-of-k-length3302/1

## Description

Given a string s, check if it is possible to convert it into a string that is the repetition of a substring of length k. Conversion has to be done by following the steps mentioned below only once:

1. Select two indices i and j (zero-based indexing, i could be equal to j), such that i and j are divisible by k.

2. Select substrings of length k starting from indices i and j.

3. Replace substring starting at index i with substring starting at index j within the string.


## Your Task:
You don't need to read input or print anything. 

Your task is to complete the function kSubstrConcat() which takes a string s, 

its length n and an integer k as inputs and return 1 if convertion of the given string is possible, else 0.

### Expected Time Complexity: O(n).

### Expected Auxiliary Space: O(n).

## Constraints:

2 <= k < n <= 105
