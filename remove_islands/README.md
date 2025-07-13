# Remove Islands

You're given a two-dimensional array (a matrix) of potentially unequal height and width containing
only `0`s and `1`s. The matrix represents a two-toned image, where each `1` represents black and
each `0` represents white. An island is defined as any number of `1`s that are horizontally or
vertically adjacent (but not diagonally adjacent) and that don't touch the border of the image. In
other words, a group of horizontally or vertically adjacent `1`s isn't an island if any of those
`1`s are in the first row, last row, first column or last column of the input matrix. Note that an
island can be L-shaped.

Write a function that returns a modified version of the input matrix, where all the islands are
removed. You remove an island by replacing it with `0`s.

Example:

```
input
[
    [1, 0, 0, 0, 0, 0],
    [0, 1, 0, 1, 1, 1],
    [0, 0, 1, 0, 1, 0],
    [1, 1, 0, 0, 1, 0],
    [1, 0, 1, 1, 0, 0],
    [1, 0, 0, 0, 0, 1],
]

expected output
[
    [1, 0, 0, 0, 0, 0],
    [0, 0, 0, 1, 1, 1],
    [0, 0, 0, 0, 1, 0],
    [1, 1, 0, 0, 1, 0],
    [1, 0, 0, 0, 0, 0],
    [1, 0, 0, 0, 0, 1],
]
```

## Time & Space Complexity

Given a matrix with <var>r</var> rows and <var>c</var> columns, both time and space complexity is
$O(r * c)$.

<br>

Topic: [#Graph]()
