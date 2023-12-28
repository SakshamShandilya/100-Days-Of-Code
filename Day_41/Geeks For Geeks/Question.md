# Question Topic - Wildcard string matching

## Link - https://www.geeksforgeeks.org/problems/wildcard-string-matching1126/1

## Description

Given two strings wild and pattern. Determine if the given two strings can be matched given that, 

wild string may contain * and ? but string pattern will not. * and ? can be converted to another character according to the following rules:

* --> This character in string wild can be replaced by any sequence of characters, it can also be replaced by an empty string.

? --> This character in string wild can be replaced by any one character.

## Your Task:
You don't need to read input or print anything. 

Your task is to complete the function match() which takes the string wild and pattern as input parameters

and returns true if the string wild can be made equal to the string pattern, otherwise, returns false.

### Expected Time Complexity: O(length of wild string * length of pattern string)

### Expected Auxiliary Space: O(length of wild string * length of pattern string)

## Constraints:
1 <= length of the two string <= 10^3 
