# Task Scheduler

You are given an array of CPU `tasks` , each labeled with a letter from A to Z, and a number `n` .
Each CPU interval can be idle or allow the completion of one task. Tasks can be completed in any
order, but there's a constraint: there has to be a gap of **at least** `n` intervals between two
tasks with the same label.

Return the **minimum** number of CPU intervals required to complete all tasks.

Examples:

```
Input: tasks = ["A","A","A","B","B","B"], n = 2
Output: 8
A possible sequence is: A -> B -> idle -> A -> B -> idle -> A -> B.
```

After completing task A, you must wait two intervals before doing A again. The same applies to task
B. In the 3<sup>rd</sup> interval, neither A nor B can be done, so you idle. By the 4<sup>th</sup>
interval, you can do A again as 2 intervals have passed.

```
Input: tasks = ["A","C","A","B","D","B"], n = 1
Output: 6
A possible sequence is: A -> B -> C -> D -> A -> B.
```

With a cooling interval of 1, you can repeat a task after just one other task.

```
Input: tasks = ["A","A","A", "B","B","B"], n = 3
Output: 10
A possible sequence is: A -> B -> idle -> idle -> A -> B -> idle -> idle -> A -> B.
```

There are only two types of tasks, A and B, which need to be separated by 3 intervals. This leads
to idling twice between repetitions of these tasks.

Constraints:
* <code>1 <= tasks.length <= 10<sup>4</sup></code>
* `tasks[i]` is an uppercase English letter.
* `0 <= n <= 100`

## Time & Space Complexity

Given $n$ is the number of tasks, the implementation runs in $O(n)$ time and requires no extra
space. While the use of a priority queue and two auxiliary hash maps might suggest complexities of
$O(n\log(n))$ and $O(n)$ respectively, the actual complexity remains linear. This is because the
number of unique tasks is limited to 26 English letters which is a constant factor and can be
ignored in the estimation.

</br>

Topic: [#Array](), [#Hash Table](), [#Greedy](), [#Sorting](), [#Heap](), [#Counting]()
