# Question Topic - Count all Possible Path


## Link - https://www.geeksforgeeks.org/problems/castle-run3644/1

## Description 

You are presented with an undirected connected graph consisting of n vertices and connections between them represented by an adjacency matrix. 

Your objective is to determine whether it is possible to start traversing from a node, x, and return to it after traversing all the vertices at least once, using each edge exactly once.

## Your Task:

You don't need to read or print anything. 

Your task is to complete the function isPossible() which takes adjacency matrix paths as an input parameter and returns 1 if it is possible to start traversing from a node, x, and come back to it after traversing all the vertices at least once, using each edge exactly once.

### Expected Time Complexity: O(n2)

### Expected Space Compelxity: O(1)

## Constraints:

1 <= n <= 100

0 <= paths[i][j] <= 1

Note: paths[i][j] = 0 where i == j or there exists no edge between i and j. paths[i][j] = 1 means there is a path between i to j.
