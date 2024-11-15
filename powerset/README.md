# Powerset
Write a function that takes in an array of unique integers and returns its powerset.

The powerset `P(x)` of a set `x` is the set of all subsets of `x`. 
For example, the powerset of `[1, 2]` is `[[], [1], [2], [1, 2]]`.

Note that the sets in the powerset do not need to be in any particular order.

## Time & Space Complexity

### Recursive solution
Given $n$ is the size of the input, time complexity is $O(n * 2^n)$ since there are $n$ function
calls and each call takes $O(2^n)$ to complete. Time complexity of each call dependes on the size
of the result, returned from the previous call. Each call generates all the subsets of it's 
corresponding input, which would be a set of $2^n$ elements. Remaining operations in the function 
such as deep copying, use this set which in total results in $O(2^n)$ time complexity.

Space Complexity is also $O(n * 2^n)$. We will have $n$ recursive function calls on the call stack,
each of which requires $O(2^n)$ space to store all of its subsets.

## Hints
<details>
<summary>Hint 1</summary>
Try thinking about the base cases. What is the powerset of the empty set?  What is the powerset 
of sets of length 1?
</details>

<details>
<summary>Hint 2</summary>
If you were to take the input set `x` and add an element to it, how would the resulting powerset 
change?
</details>

<details>
<summary>Hint 3</summary>
Can you solve this problem recursively? Can you solve it iteratively? What are the advantages 
and disadvantages of using either approach?
</details>

</br>

Topic: [#Recursion](), [#Iteration]()