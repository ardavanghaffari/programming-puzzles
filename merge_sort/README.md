# Merge Sort
Write a function that takes in an array of integers and returns a sorted version of that array.
Use the Merge Sort algorithm to sort the array.

Your implementation of Merge Sort almost certainly uses a lot of auxiliary space and likely does not
sort the input array in place. What is the space complexity of your algorithm?

Can you implement a version of the algorithm using only one additional array of the same length
as the input array, and can this version sort the input array in place?

Example:
```
Input: [8, 5, 2, 9, 5, 6, 3]
Output: [2, 3, 5, 5, 6, 8, 9]
```

## Time & Space Complexity

### First Iteration
This is the most basic and traditional implementation of merge sort. It is not in-place and does
indeed use a lot of auxiliary space. The input is halved with each invocation, so we'll get to the
bottom of the recursion tree in $log(n)$ steps. Each step requires $O(n)$ space for storing the
left and right sub-arrays plus $O(n)$ for storing the merged result. That is $O(n)$ space
in total for each level of the recursion tree and there are $log(n)$ levels. Hence a space
complexity of $O(n\log{(n)})$.

Time complexity is also $O(n\log{(n)})$. Merging the two sorted sub-arrays at each level is the only
operation that determines the time complexity which takes $O(n)$.

### Second Iteration
This implementation is in-place but does not achieve $O(n)$ space complexity as asked by the
question. Similar to previous approach, it requires $O(n\log{(n)})$ space but it is actually less
since it no longer needs $O(n)$ for the merge step. It does however allocate extra space for storing
the left and right sub-arrays.

Time complexity is $O(n\log{(n)})$ and cannot be improved beyond that. That is because Merge sort is
an algorithm that sorts by comparing elements and such algorithms are lower bounded by
$O(n\log{(n)})$.[^1]

### Third Iteration
Here we achieve $O(n)$ space complexity by using only one auxiliary array the size of the input. At
each merge step, portion of the main array corresponding to the already sorted left and right
sub-arrays are first copied to the auxiliary array and from there merged back to the main array.

Time complexity remains at $O(n\log{(n)})$. Copying to the auxiliary array prior to merging results
in an extra $O(n)$ but that doesn't increase the overall time complexity.

</br>

Topic: [#Sorting](), [#Recursion](), [#TopDown]()

[^1]: Competitive Programmer’s Handbook, Antti Laaksonen page 28