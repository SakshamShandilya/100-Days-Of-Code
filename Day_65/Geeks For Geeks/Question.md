# Question Topic - Vertex Cover


## Link - https://www.geeksforgeeks.org/problems/vertex-cover/1


## Description

Vertex cover of an undirected graph is a list of vertices such that every vertex not in the vertex cover shares their every edge with the vertices in the vertex cover. 

In other words, for every edge in the graph, atleast one of the endpoints of the graph should belong to the vertex cover. 

You will be given an undirected graph G, and your task is to determine the smallest possible size of a vertex cover.

## Your Task:  

You don't need to read input or print anything. 

Your task is to complete the function vertexCover() which takes the edge list and an integer n for the number of nodes of the graph as input parameters and returns the size of the smallest possible vertex cover.

### Expected Time Complexity: O(M*2N)

### Expected Auxiliary Space: O(N2)

## Constraints:

1 <= N <= 16

1 <= M <= N*(N-1)/2

1 <= edges[i][0], edges[i][1] <= N
