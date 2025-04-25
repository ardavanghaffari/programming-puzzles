# Min Heap Construction

Implement a MinHeap class that supports:

- Building a Min Heap from an input array of integers.
- Inserting integers in the heap.
- Removing the heap's minimum / root value.
- Peeking at the heap's minimum / root value.
- Sifting integers up and down the heap, which is to be used when inserting and removing values.

Note that the heap should be represented in the form of an array.

Example usage:

```
array = [48, 12, 24, 7, 8, -5, 24, 391, 24, 56, 2, 6, 8, 41]

MinHeap(array): instantiate a MinHeap - calls the buildHeap method and populates the heap
[-5, 2, 6, 7, 8, 8, 24, 391, 24, 56, 12, 24, 48, 41]

insert(-10):
[-10, 2, -5, 7, 8, 8, 6, 391, 24, 56, 12, 24, 48, 41, 24]

peek(): -10
[-10, 2, -5, 7, 8, 8, 6, 391, 24, 56, 12, 24, 48, 41, 24]

remove(): -10
[-5, 2, 6, 7, 8, 8, 24, 391, 24, 56, 12, 24, 48, 41]

insert(87):
[-5, 2, 6, 7, 8, 8, 24, 391, 24, 56, 12, 24, 48, 41, 87]

remove(): -5
[2, 7, 6, 24, 8, 8, 24, 391, 87, 56, 12, 24, 48, 41]
```

## Time & Space complexity

Given $n$ is the size of the heap, sifting each node up or down takes $O(\log(n))$ since we'd be
eliminating half of the nodes at each step. The heap can be built by either sifting all nodes up
or sifting all parent nodes down. The sifting up approach results in $O(n\log(n))$ time complexity
as one would expect but the sifting down approach takes only $O(n)$. Its mathematical proof is
hard but intuitively speaking, most of the nodes for which we'd be sifting down reside at the lower
levels of the tree where they're closer to the leaves. Sifting them down takes constant time. There
are only a few for which we'd get close to $O(\log(n))$. Root is the only one that would actually
take $\log(n)$ time. So in total, it doesn't become $O(n\log(n))$ but rather converges more
towards $O(n)$. In the sifting up approach however, the majority of the nodes are at the bottom
of the tree each taking $O(\log(n))$ which would result in $O(n\log(n))$ time complexity.

In light of this, `buildHeap()` takes $O(n)$. `peek()` is constant time and both `insert()` and
`remove()` are done in $O(\log(n))$.

</br>

Topic: [#Heap]()
