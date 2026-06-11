# Branch Sums

Write a function that takes in a Binary Tree and returns a list of its branch sums ordered from
leftmost branch sum to rightmost branch sum.

A branch sum is the sum of all values in a Binary Tree branch. A Binary Tree branch is a path of
nodes in a tree that starts at the root node and ends at any leaf node.

Each BinaryTree node has an integer value, a left child node, and a right child node. Children nodes
can either be BinaryTree nodes themselves or None / null.

Example:

```
input =     1
         /     \
        2       3
      /   \    /  \
     4     5  6    7
   /   \  /
  8    9 10

output = [15, 16, 18, 10, 11]
```

## Time & Space Complexity

$O(n)$ time and $O(n)$ space where `n` is the number of nodes in the Binary Tree. This analysis is
affected by:

- Recursive nature of solution: there are multiple recursive function calls on the call stack at
  once. Best or average case would be a balanced binary tree where we'll have $\log{n}$ recursive
  calls on the stack, by the time we reach the (left most) leaf. In the example, by the time we get
  to 8 and right before we start popping the call for 8 off the stack, we'll have 4 ($\log{n}$)
  recursive calls on the stack (those for 1, 2, 4 and 8). That's because we eliminate half of the
  nodes at each step as we go down. In the worst case that'd be `n` calls on the stack and that is
  for a binary tree that is skewed all the way to left. So by the time we get to the only leaf, all
  the nodes are actually on the call stack. That's $O(n)$ according to this factor. This analysis is
  pretty standard for BSTs. It applies when the solution is recursive or when it's iterative and it
  uses a stack (both regarded as depth first traversal). But what if it's iterative and it uses a
  queue or in other words when the solution is BFS? In case of BFS, space complexity depends on how
  large the queue gets. Best case actually is when the binary tree is skewed to one side in which
  case we'll have at most one node in the queue at any given time. That'd be $O(1)$. Worst case is
  when the tree is balanced in which case the maximum number of nodes in the queue equals to the
  number of leaves and that is $O(n)$.
- Number of leafs in the binary tree: the number of leaf nodes in a full binary tree with `n` nodes
  is equal to `(n+1) / 2` (there are proofs by induction for it). How many branch sums or leafs are
  we going to have in the BST? Since that will dictate the length of the list. You can look up the
  math formulas that calculates the number of leaf nodes in a BST with `n` nodes. But we'll never
  have more than `n` leaf nodes in a BST with `n` nodes. So that list is bounded by $O(n)$. In case
  of a balanced binary tree, roughly half of the nodes are leaf nodes. Looking at it in another way,
  with every level added to BST, number of leaf nodes doubles so that roughly tells us that half of
  the nodes in a BST are leaf nodes and that would be again $O(n)$.

<br>

Topic: [#Binary Tree](), [#Recursion]()
