# Question Topic - Grinding Geek


## Link - https://www.geeksforgeeks.org/problems/grinding-geek/1


## Description

GeeksforGeeks has introduced a special offer where you can enroll in any course, and if you manage to complete 90% of the course within 90 days, you will receive a refund of 90%.

Geek was fascinated by this offer. This offer was valid for only n days, and each day a new course was available for purchase. 

Geek decided that if he bought a course on some day, he will complete that course on the same day itself and redeem floor[90% of cost of the course] amount back. 

Find the maximum number of courses that Geek can complete in those n days if he had total amount initially.

Note: On any day, Geek can only buy the new course that was made available for purchase that day.

## Your Task:
This is a function problem. The input is already taken care of by the driver code. 
You only need to complete the function max_courses() that takes N the number of days, the total amount, and the cost array as input argument and return the maximum amount of courses that could be purchased.

### Expected Time Complexity: O(n*total)

### Expected Auxiliary Space: O(n*total)

## Constraints:

1 <= n <= 1000

0 <= total <= 1000

1 <= cost[i] <= 1000
