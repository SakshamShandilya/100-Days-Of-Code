# Question Topic - Count digit groupings of a number

## Link - https://www.geeksforgeeks.org/problems/count-digit-groupings-of-a-number1520/1

## Description

Given a string str consisting of digits, you can divide it into sub-groups by separating the string into substrings. 

For example, "112" can be divided as {"1", "1", "2"}, {"11", "2"}, {"1", "12"}, and {"112"}.

A valid grouping can be done if you are able to divide sub-groups where the sum of digits in a sub-group is less than or equal to the sum of the digits of the sub-group immediately right to it. 

Your task is to determine the total number of valid groupings that could be done for a given string.

## Your Task:

You don't need to read or print anything. 

Your task is to complete the function TotalCount() which takes the string str as input parameter and returns total possible groupings.

### Expected Time Complexity: O(N3) where N is the length of the string.

### Expected Space Complexity: O(N2)

## Constraints:

1 <= N <= 100

stri ∈ {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
