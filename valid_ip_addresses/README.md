# Valid IP Addresses

You're given a string of length 12 or smaller, containing only digits. Write a function that
returns all the possible IP addresses that can be created by inserting three `.`s in the string.

An IP address is a sequence of four positive integers that are separated by `.`s, where each
individual integer is within the range 0 - 255, inclusive.

An IP address isn't valid if any of the individual integers contains leading `0`s. For example,
`192.168.0.1` is a valid IP address, but `192.168.00.1` and `192.168.0.01` aren't, because they
contain `00` and `01`, respectively. Another example of a valid IP address is `99.1.1.10`;
conversely, `991.1.1.0` isn't valid, because 991 is greater than 255.

Example:

```
input = "1921680"
expected output =
[
    "1.9.216.80",
    "1.92.16.80",
    "1.92.168.0",
    "19.2.16.80",
    "19.2.168.0",
    "19.21.6.80",
    "19.21.68.0",
    "19.216.8.0",
    "192.1.6.80",
    "192.1.68.0",
    "192.16.8.0"
]
```

## Time & Space Complexity

The implementation runs in constant time and space since the input string is itself constant
(12 or less).

</br>

Topic: [#String](), [#Recursion]()
