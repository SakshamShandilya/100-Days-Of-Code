# Question Topic - Count the nodes at distance K from leaf

## Link - https://www.geeksforgeeks.org/problems/node-at-distance/1

## Description

Given a binary tree with n nodes and a non-negative integer k, the task is to count the number of special nodes.

A node is considered special if there exists at least one leaf in its subtree such that the distance between the node and leaf is exactly k.

Note: Any such node should be counted only once. For example, if a node is at a distance k from 2 or more leaf nodes, then it would add only 1 to our count.


## Your Task:

You don't have to read input or print anything. 

Complete the function printKDistantfromLeaf() that takes root node and k as inputs and returns the number of nodes that are at distance k from a leaf node. 

### Expected Time Complexity: O(n).
### Expected Auxiliary Space: O(Height of the Tree).

## Constraints:

1 <= n <= 105
