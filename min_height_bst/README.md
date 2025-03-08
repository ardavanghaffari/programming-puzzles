# Min Height BST
Write a function that takes in a non-empty sorted array of distinct integers, constructs a BST
from the integers, and returns the root of the BST.

The function should minimize the height of the BST.

Example usage:
```
array = [1, 2, 5, 7, 10, 13, 14, 15, 22]

         10
       /     \
      2      14
    /   \   /   \
   1     5 13   15
          \       \
           7      22
// This is one example of a BST with min height
// that you could create from the input array.
// You could create other BSTs with min height
// from the same array; for example:
         10
       /     \
      5      15
    /   \   /   \
   2     7 13   22
 /           \
1            14
```

## Time & Space Complexity
Constructing a BST with $n$ nodes requires $O(n)$ time and space.

</br>

Topic: [#Tree](), [#Binary search tree]()