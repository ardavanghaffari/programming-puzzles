# Permutations

Given an array of distinct integers, return all the possible permutations.

Example:

```
Input: [1, 2, 3]
Output: [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
```

## Time & Space Complexity

Given $n$ is the size of the input, both time and space complexity of both solutions is $O(n * n!)$.
By the time the algorithms terminate, we'll have generated $n!$ permutations each of size $n$. We
cannot produce a result like that using less time and/or space. So we're upper bounded by
$O(n * n!)$. Intuitively speaking, the recursive solution uses more space though as it creates
copies of partial permutations and modifies them. The backtracking solution sticks to the original
list by swapping elements back and forth as it moves up and down the recursion tree.

</br>

Topic: [#Complete search](), [#Recursion](), [#Backtracking]()
