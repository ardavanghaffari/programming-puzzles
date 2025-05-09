# Balanced Brackets

Given a string containing just the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the
input string is balanced. An input string is balanced if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

Examples:

```
Input: "()"
Output: true

Input: "()[]{}"
Output: true

Input: "([])"
Output: true

Input: "(]"
Output: false
```

## Time & Space complexity

Given $n$ is the length of the input string, time complexity is $O(n)$ since we iterate through the
characters in the string in the for loop. Space complexity is also $O(n)$ since at its worst case,
we'll have all the characters on the stack. For example in case of a string containing only opening
brackets.

</br>

Topic: [#Stack]()
