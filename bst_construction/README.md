# BST Construction
Write a BST class for a Binary Search Tree. The class should support:

* Inserting values with the insert method.
* Removing values with the remove method; this method should only remove the first instance
  of a given value.
* Searching for values with the contains method.

Note that you can't remove values from a single-node tree. In other words, calling the remove
method on a single-node tree should simply not do anything.

Each BST node has an integer value, a left child node, and a right child node. A node is said
to be a valid BST node if and only if it satisfies the BST property: its value is strictly greater
than the values of every node to its left; its value is less than or equal to the values of every
node to its right; and its children nodes are either valid BST nodes themselves or None / null.

Example usage:
```
         10
       /     \
      5      15
    /   \   /   \
   2     5 13   22
 /           \
1            14

insert(12):   10
            /     \
           5      15
         /   \   /   \
        2     5 13   22
      /        /  \
     1        12  14

remove(10):   12
            /     \
           5      15
         /   \   /   \
        2     5 13   22
      /           \
     1            14

contains(15): true
```

## Time & Space Complexity
For a tree with $n$ nodes, average time complexity of all three methods is $O(\log(n))$. That
happens when the tree is balanced. Since we'd be eliminating half of the nodes at each level when
traversing the tree. In the worst case, $O(n)$ if the tree is skewed to one side.

</br>

Topic: [#Tree](), [#Binary search tree]()