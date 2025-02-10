# Powerset
Write a function that takes in an array of unique integers and returns its powerset.

The powerset `P(x)` of a set `x` is the set of all subsets of `x`.
For example, the powerset of `[1, 2]` is `[[], [1], [2], [1, 2]]`.

Note that the sets in the powerset do not need to be in any particular order.

## Time & Space Complexity

### Recursive solution
Given $n$ is the size of the input, time complexity is $O(n * 2^n)$ since there are $n$ function
calls and each call takes $O(2^n)$ to complete. Time complexity of each call depends on the size
of the result, returned from the previous call. Each call generates all the subsets of its
corresponding input, which would be a set of $2^n$ elements. Remaining operations in the function
such as deep copying, use this set which in total results in $O(2^n)$ time complexity.

Space Complexity is also $O(n * 2^n)$. We will have $n$ recursive function calls on the call stack,
each of which requires $O(2^n)$ space to store all of its subsets.

### Iterative solution
This is the iterative implementation of the recursive solution. A simple loop suffices and there
is no need for an explicit stack. Time and space complexity is $O(n * 2^n)$ as we iterate $n$ times
and each iteration constructs a powerset.

### Bit manipulation solution
The implementation consists of a nested for loop. For an input with $n$ elements, the outer loop
executes $2^n$ times, generating all the binary representations from 0 to $2^n - 1$, each
corresponding to one of the subsets. The inner loop executes $n$ times, iterating through
all the bits in the binary representation and deciding if the element should be included in
the subset. This results in a $O(n * 2^n)$ time complexity.

Space complexity is similarly $O(n * 2^n)$ as there are $2^n$ subsets, each containing at most
$n$ elements.

</br>

Topic: [#Complete search](), [#Recursion](), [#Iteration](), [#Bit manipulation]()