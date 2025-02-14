import unittest
from permutations import recursive
from permutations import backtracking

params = [
    ([], []),
    ([1], [[1]]),
    ([1, 2], [[1, 2], [2, 1]]),
    ([1, 1], [[1, 1], [1, 1]]),
    ([1, 2, 3], [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]),
]


class TestPermutations(unittest.TestCase):
    def test_recursive(self):
        for numbers, expected in params:
            with self.subTest(numbers=numbers, expected=expected):
                self.assertCountEqual(recursive(numbers), expected)

    def test_backtracking(self):
        for numbers, expected in params:
            with self.subTest(numbers=numbers, expected=expected):
                self.assertCountEqual(backtracking(numbers), expected)


if __name__ == "__main__":
    unittest.main()
