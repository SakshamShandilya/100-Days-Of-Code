# Question Topic - Distribute candies in a binary tree

## Link - https://www.geeksforgeeks.org/problems/distribute-candies-in-a-binary-tree/1


## Description

Given a binary tree with N nodes, in which each node value represents number of candies present at that node. 

In one move, one may choose two adjacent nodes and move only one candy from one node to another (the move may be from parent to child, or from child to parent.) 

The task is to find the number of moves required such that every node has exactly one candy.

Note that the testcases are framed such that it is always possible to achieve a configuration in which every node has exactly one candy, after some moves.

## Your task :

You don't have to read input or print anything. 

Your task is to complete the function distributeCandy() which takes the root of the tree as input and returns the number of moves required such that every node has exactly one candy.
 
## Expected Time Complexity: O(N)

## Expected Auxiliary Space: O(height of the tree)
 
## Constraints:

1 <= N <= 104

0 <= Value of each node <= 104
