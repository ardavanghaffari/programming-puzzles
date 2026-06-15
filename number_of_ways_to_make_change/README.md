# Number Of Ways To Make Change

Given an array of distinct positive integers representing coin denominations and a single
non-negative integer `n` representing a target amount of money, write a function that returns the
number of ways to make change for that target amount using the given coin denominations. Note that
an unlimited amount of coins is at your disposal.

Example:

```
n = 6
denoms = [1, 5]
output = 2 // 1x1 + 1x5 and 6x1
```

## Time & Space Complexity

$O(nd)$ time and $O(n)$ space, where `n` is the target amount and `d` is the number of
denominations.

<br>

Topic: [#Dynamic Programming]()
