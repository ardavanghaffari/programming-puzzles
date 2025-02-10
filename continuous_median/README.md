# Continuous Median
Write a ContinuousMedian class that supports:

* The continuous insertion of numbers with the insert method.
* The instant retrieval of the median of the numbers that have been inserted thus far with the
  getMedian method.

The median of a set of numbers is the "middle" number when the numbers are ordered from smallest
to greatest. If there's an odd number of numbers in the set, as in `{1, 3, 7}`, the median is the
number in the middle (3 in this case); if there's an even number of numbers in the set, as in
`{1, 3, 7, 8}`, the median is the average of the two middle numbers (`(3 + 7) / 2 == 5` in this
case).

Example usage:
```
ContinuousMedian(): - // instantiate a ContinuousMedian
insert(5): -
insert(10): -
getMedian(): 7.5
insert(100): -
getMedian(): 10
```

## Time & Space complexity
We can keep the numbers in a sorted array to enable instant median retrieval. This is however
unnecessary since we only need to track the two middle numbers. Additionally, maintaining a
sorted array would result in $O(n)$ insertion time.

We could instead use two Heaps to keep track of two subsets of the numbers. A max-heap for the
small half and a min-heap for the larger half. This way, we can query the two middle numbers and
compute the median in instant time by just peeking at the two heaps. With every insert, we pick
the right heap and possibly also rebalance the heaps to keep their sizes apart by at most one.

I chose to use Python's `heapq` module over implementing a Heap and its operations from scratch
mainly because I had already done that in the `min_heap_construction` example. Inserting and
removing from a Heap is a $O(\log(n))$ operation and all our implementation of `insert()` does is
a series of insertions and removals to and from the min/max heaps. `insert()` has therefore also a
$O(\log(n))$ time complexity.

Space complexity is $O(n)$ due to the usage of two arrays backing the two heaps.

</br>

Topic: [#Heap]()