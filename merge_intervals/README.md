# Merge Intervals
Given an array of intervals, merge all overlapping intervals, and return an array of the
non-overlapping intervals that cover all the intervals in the input.

Examples:
```
Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
```
Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

```
Input: [[1,4],[4,5]]
Output: [[1,5]]
```
Intervals [1,4] and [4,5] are considered overlapping.

## Time & Space complexity
Given $n$ is the number of intervals in the input array, time complexity is $O(n\log(n))$
because of the sort operation. There is a nested for loop in the implementation which might give
the impression that time complexity is $O(n^2)$ but that's not the case since we're actually
iterating once through the array. The outer loop is always one element behind the inner loop.
The implementation can therefore be improved and made simpler by using only a single loop but
I did not end up doing that.

Space complexity is $O(n)$ because of the auxiliary storage we're using for constructing and
returning the result.

</br>

Topic: [#Array]()