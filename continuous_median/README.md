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

## Hints
<details>
<summary>Hint 1</summary>
The median of a set of numbers is often, by definition, one of the numbers in the set.
Thus, you likely have to store all of the inserted numbers somewhere to be able to continuously
compute their median.
</details>

<details>
<summary>Hint 2</summary>
The median of a set of numbers is either the middle number of that set or the average of the middle
numbers. This means that if you could somehow keep track of the middle number(s) of the set of
inserted numbers, you could easily compute the median by finding the indices of the middle numbers
and doing some simple calculations. Perhaps storing all of the numbers in a sorted array could work,
but what would be the runtime implication of inserting each new number into a sorted array?
</details>

<details>
<summary>Hint 3</summary>
Realizing that you only need to keep track of the middle numbers in the set of inserted numbers
to compute the median, try keeping track of two subsets of the numbers: a max-heap of the lower
half of the numbers and a min-heap of the greater half of the numbers. Any time you insert a number,
pick the heap to place it in by comparing it to the max / min values of the heaps. Then, re-balance
the heaps in an effort to keep their sizes apart by at most one. Doing so will allow you to access
the middle number(s) of the set of inserted numbers very easily, which will make calculating the
median a trivial computation. Re-balancing the heaps can be accomplished by simply removing a value
from the larger heap and inserting it in the smaller one. What are the runtime implications of all
these operations?
</details>

## Time & Space complexity
I chose to use Python's `heapq` module over implementing a Heap and its operations from scratch
mainly because I had already done that in the `min_heap_construction` example. Inserting and
removing from a Heap is a $O(\log(n))$ operation and all our implementation of `insert()` does is
a series of insertions and removals to and from the min/max heaps. `insert()` has therefore also a
$O(\log(n))$ time complexity. Space complexity is $O(1)$ as we don't use any extra storage.

</br>

Topic: [#Heap]()