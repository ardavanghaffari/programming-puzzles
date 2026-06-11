# Nth Fibonacci

The Fibonacci sequence is defined as follows: the first number of the sequence is 0, the second
number is 1, and the `n`th number is the sum of the `(n - 1)`th and `(n - 2)`th numbers. Write a
function that takes in an integer `n` and returns the `n`th Fibonacci number.

Example:

```
Fib(6) = 5 // 0, 1, 1, 2, 3, 5
```

## Time & Space Complexity

### Recursive

Implementation almost the same as the mathematical formula. A naive solution. Does a lot of
recalculation. Stuff can instead be memoized. Exponential time complexity $O(2^n)$. For `fib(n)`, we
start from `n` and we go all the way down to `fib(1)`, and at each of these fibs we call two more
fibs. `fib(n)` calls two fibs and each child calls two more fibs and so on. So basically we are
doing 2 times 2 times 2 ... and we are doing that n times (height of the tree). It becomes a
complete, balanced binary tree where the number of nodes at each level doubles. There will be `n`
levels (going down from n to 1) and hence $O(2^n)$. Note that it converges to $(2^n)$. This analysis
is intuitive.

As for space complexity, we'd have to determine the maximum number of frames on the callstack at a
given time. That only determines the space complexity as the recursive solution does not use any
auxiliary storage. We'll have at most `n` frames on the callstack. Beyond that, we'll start hitting
base cases, popping calls from the stack going back up. We'd still push frames on the stack as we go
back up to `fib(n)` but the number of frames will never exceed `n`. And `n` corresponds to the
height of the tree. There will be n levels at most.

### Memoization

Time complexity becomes $O(n)$ because calculating `fib(n)` reduces to only `fib(n - 1)`.
`fib(n - 2)` will become constant time as it will be found in the memoization. In other words, right
side of the tree will become constant time. Not only that, but also in the left tree, we'd only have
calculations up to `fib(3)`. Once we get there and on the way back to `fib(n)`, everything will have
already been calculated. Practically every right child node will be in the memoization and thus
constant time operation.

Space complexity remains the same $O(n)$. The callstack aspect is same as above and still there will
be at most `n` frames on the callstack. Apart from that we'll be using a hash with max `n` size for
the memoization and so in total it will be $O(n)$.

### Iterative

Keeps the last two fib numbers as it goes up to `n`. Auxiliary storage is an array of size 2. Time
complexity $O(n)$ and space complexity $O(1)$.

Topic: [#Dynamic Programming]()
