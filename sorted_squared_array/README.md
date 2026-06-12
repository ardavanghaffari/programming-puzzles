# Sorted Squared Array

Given an array of integers that are sorted in increasing order, write a function that squares all
the integers in the array and returns them in a new array, also sorted in increasing order.

Example:

```
input = [-7, -3, 1, 9, 22, 30]
expected_output = [1, 9, 49, 81, 484, 900]
```

## Time & Space Complexity

- `baseline`: squares every value and then sorts the squared values. This is simple and correct for
  negative numbers, but sorting dominates the runtime: $O(n \log n)$ time and $O(n)$ space.
- `split_and_merge`: finds the first non-negative value, then merges squares from the negative side
  and the non-negative side in sorted order. This uses the fact that negative values get smaller as
  you move left from zero: $O(n)$ time and $O(n)$ space.
- `two_pointers`: compares absolute values at the left and right ends, placing the larger square
  into the result from back to front. This is the optimal approach here: $O(n)$ time and $O(n)$
  space.

<br>

Topic: [#Arrays]()
