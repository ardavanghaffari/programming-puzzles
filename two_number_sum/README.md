# Two Number Sum

Write a function that takes in a non-empty array of distinct integers and an integer representing
a target sum. If any two numbers in the input array sum up to the target sum, the function should
return them in an array, in sorted order. If no two numbers sum up to the target sum, the function
should return an empty array. Assume that there will be at most one pair of numbers summing up to
the target sum.

Example:

```
Input: [3, 5, -4, 8, 11, 1, -1, 6], 10
Output: [-1, 11]
```

## Time & Space Complexity

Given an array of $n$ numbers, time and space complexity of the three solutions are as follows:

- Brute force: $O(n^2)$ time and $O(1)$ space.
- Hash table: $O(n)$ time and space.
- Two pointer: $O(n\log(n))$ time and $O(1)$ space

</br>

Topic: [#Array]()
