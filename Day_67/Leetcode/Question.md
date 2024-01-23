# Question Topic - LRU Cache


## Link - https://leetcode.com/problems/lru-cache/description/?envType=study-plan-v2&envId=top-100-liked


## Description

Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

Implement the LRUCache class:

LRUCache(int capacity) Initialize the LRU cache with positive size capacity.

int get(int key) Return the value of the key if the key exists, otherwise return -1.

void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.

The functions get and put must each run in O(1) average time complexity.


## Constraints:

1 <= capacity <= 3000

0 <= key <= 104

0 <= value <= 105

At most 2 * 105 calls will be made to get and put.
