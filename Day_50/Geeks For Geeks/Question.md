# Question Topic - Techfest and the Queue

## Link - https://www.geeksforgeeks.org/problems/techfest-and-the-queue1044/1

## Description

A Techfest is underway, and each participant is given a ticket with a unique number. Organizers decide to award prize points to everyone who has a ticket ID between a and b (inclusive). The points given to a participant with ticket number x will be the sum of powers of the prime factors of x.

For instance, if points are to be awarded to a participant with ticket number 12, the amount of points given out will be equal to the sum of powers in the prime factorization of 12 (22 × 31), which will be 2 + 1 = 3.

Given a and b, determine the sum of all the points that will be awarded to the participants with ticket numbers between a and b (inclusive).

## Your Task:
You don't need to read or print anything. Your task is to complete the function sumOfPowers() which takes a and b as input parameters and returns the sum of the power of primes that occur in prime factorization of the numbers between a to b (inclusive).

### Expected Time Complexity: O( b*log(b) )

### Expected Space Complexity: O( b*log(b) )

## Constraints:

1 <= a <= b <= 2x105

1 <= b-a <= 105
