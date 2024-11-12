# Powerset
Write a function that takes in an array of unique integers and returns its powerset.

The powerset `P(x)` of a set `x` is the set of all subsets of `x`. 
For example, the powerset of `[1, 2]` is `[[], [1], [2], [1, 2]]`.

Note that the sets in the powerset do not need to be in any particular order.

## Optimal Space & Time Complexity
$O(n * 2^n)$ time | $O(n*2^n)$ space - where $n$ is the length of the input array

## Hints
<details>
<summary>Hint 1</summary>
Try thinking about the base cases. What is the powerset of the empty set?  What is the powerset 
of sets of length 1?
</details>

<details>
<summary>Hint 2</summary>
If you were to take the input set X and add an element to it, how would the resulting powerset 
change?
</details>

<details>
<summary>Hint 3</summary>
Can you solve this problem recursively? Can you solve it iteratively? What are the advantages 
and disadvantages of using either approach?
</details>

</br>

Topic: [#Recursion](), [#Iteration]()