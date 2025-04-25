# Linked List Construction

Write a DoublyLinkedList class that has a head and a tail, both of which point to either a
linked list node or None / null. The class should support:

- Setting the head and tail of the linked list.
- Inserting nodes before and after other nodes as well as at given positions
  (the position of the head node is 1).
- Removing given nodes and removing nodes with given values.
- Searching for nodes with given values.

Note that the setHead, setTail, insertBefore, insertAfter, insertAtPosition, and remove methods
all take in actual nodes as input parameters - not integers (except for insertAtPosition, which
also takes in an integer representing the position); this means that you don't need to create any
new nodes in these methods. The input nodes can be either stand-alone nodes or nodes that are
already in the linked list. If they're nodes that are already in the linked list, the methods will
effectively be moving the nodes within the linked list. You won't be told if the input nodes are
already in the linked list, so your code will have to defensively handle this scenario.

Each node has an integer value as well as a prev node and a next node, both of which can point to
either another node or None / null.

Example usage:

```
Assume the following linked list has already been created:
1 <-> 2 <-> 3 <-> 4 <-> 5

Assume that we also have the following stand-alone nodes:
3, 3, 6

Set the existing node with value 4 as the head
setHead(4): 4 <-> 1 <-> 2 <-> 3 <-> 5

Set the stand-alone node with value 6 as the tail
setTail(6): 4 <-> 1 <-> 2 <-> 3 <-> 5 <-> 6

Move the existing node with value 3 before the existing node with value 6
insertBefore(6, 3): 4 <-> 1 <-> 2 <-> 5 <-> 3 <-> 6

Insert a stand-alone node with value 3 after the existing node with value 6
insertAfter(6, 3): 4 <-> 1 <-> 2 <-> 5 <-> 3 <-> 6 <-> 3

Insert a stand-alone node with value 3 in position 1
insertAtPosition(1, 3): 3 <-> 4 <-> 1 <-> 2 <-> 5 <-> 3 <-> 6 <-> 3

Remove all nodes with value 3
removeNodesWithValue(3): 4 <-> 1 <-> 2 <-> 5 <-> 6

Remove the existing node with value 2
remove(2): 4 <-> 1 <-> 5 <-> 6

containsNodeWithValue(5): true
```

## Time & Space complexity

All methods use constant space.

`set_head`, `set_tail`, `insert_before`, `insert_after` and `remove` all run in constant time.

`insert_at_position`, `remove_nodes_with_values` and `contains_node_with_value` run in worst case
in $O(n)$ where n is the number of nodes in the linked list.

</br>

Topic: [#Linked List]()
