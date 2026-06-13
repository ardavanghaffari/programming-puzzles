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

The dynamic programming solution stores `ways[amount]`, the number of ways to make each amount from
`0` through `n`. It initializes `ways[0] = 1`, because there is exactly one way to make zero cents:
choose no coins.

For each denomination, it walks forward through the amounts and adds `ways[amount - denom]` into
`ways[amount]`. Processing denominations in the outer loop counts combinations once, without
counting different coin orders as separate answers.

This gives $O(nd)$ time and $O(n)$ space, where `n` is the target amount and `d` is the number of
denominations.

<br>

Topic: [#Dynamic Programming]()
