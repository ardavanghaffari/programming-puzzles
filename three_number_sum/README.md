# Three Number Sum
Write a function that takes in a non-empty array of distinct integers and an integer representing a
target sum. The function should find all triplets in the array that sum up to the target sum and
return a two-dimensional array of all these triplets. The numbers in each triplet should be ordered
in ascending order, and the triplets themselves should be ordered in ascending order with respect to
the numbers they hold. If no three numbers sum up to the target sum, the function should return an
empty array.

Example:
```
Input: [12, 3, 1, 2, -6, 5, -8, 6], 0
Output: [[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]
```

## Time & Space Complexity
Given an array of $n$ numbers, time complexity is $O(n^2)$ and space complexity is $O(n)$ at its
worst case, that is when all numbers contribute to unique triplets.

</br>

Topic: [#Arrays]()