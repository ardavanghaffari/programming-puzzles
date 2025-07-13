# Maximum Subarray Sum

Given an array of <var>n</var> numbers, calculate the maximum subarray sum, i.e. the largest
possible sum of a sequence of consecutive values in the array.

Example:

```
Input: [-1, 2, 4, -3, 5, 2, -5, 2]
Output: 10
```

## Time & Space complexity

### Brute Force Approach

Here we're using a nested for loop to iterate over every possible subarray of the input array. This
results in $O(n^2)$ time complexity. This is not optimal as demonstrated by the other solutions.
Space complexity is constant since we're not using any extra storage or more strictly speaking
because the storage used to calculate the result does not increase with the input size.

### Kadane's Algorithm

The subarray that results in the maximum sum is irrelevant. This $O(n)$ solution becomes possible
when we stop considering which subarray results in the maximum sum. The idea is to calculate for
each position <var>i</var> in the input, the maximum sum ending at that position and updating it
as we go along. By comparing `input[i]` with `input[i] + sum`, we're checking if the subarray
leading to <var>i</var> is improving the overall result or not. If it turns out that `input[i]` is
greater on its own, that means the leading subarray is reducing the overall result and so we ditch
it by starting a new sum/subarray from position <var>i</var>.

<br>

Topic: [#Array](), [#Kadane's Algorithm]()
