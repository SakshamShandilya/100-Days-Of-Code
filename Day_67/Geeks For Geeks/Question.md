# Question Topic - Course Schedule

## Link - https://www.geeksforgeeks.org/problems/course-schedule/1


## Description
There are a total of n tasks you have to pick, labelled from 0 to n-1. Some tasks may have prerequisite tasks, for example to pick task 0 you have to first finish tasks 1, which is expressed as a pair: [0, 1]
Given the total number of n tasks and a list of prerequisite pairs of size m. Find a ordering of tasks you should pick to finish all tasks.

Note: There may be multiple correct orders, you just need to return any one of them. If it is impossible to finish all tasks, return an empty array. Driver code will print "No Ordering Possible", on returning an empty array. Returning any correct order will give the output as 1, whereas any invalid order will give the output 0. 


## Your Task:
The task is to complete the function findOrder() which takes two integers n, and m and a list of lists of size m*2 denoting the prerequisite pairs as input and returns any correct order to finish all the tasks. Return an empty array if it's impossible to finish all tasks.

### Expected Time Complexity: O(n+m).

### Expected Auxiliary Space: O(n+m).
 
## Constraints:

1 ≤ n ≤ 105

0 ≤ m ≤ min(n*(n-1),105)

0 ≤ prerequisites[i][0], prerequisites[i][1] < n

All prerequisite pairs are unique

prerequisites[i][0] ≠ prerequisites[i][1]
