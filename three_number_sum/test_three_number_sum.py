import unittest
from three_number_sum import two_pointer

params = [
    ([1, 2, 3, 4, 5], 15, []),
    ([1, 2, 3, 4, 5], 6, [[1, 2, 3]]),
    ([1, 2, 3, 4, 5], 9, [[1, 3, 5], [2, 3, 4]]),
    ([12, 3, 1, 2, -6, 5, -8, 6], 0, [[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]),
]


class TestThreeNumberSum(unittest.TestCase):
    def test_two_pointer(self):
        for numbers, target_sum, expected in params:
            with self.subTest(numbers=numbers, target_sum=target_sum, expected=expected):
                actual = two_pointer(numbers, target_sum)
                self.assertEqual(actual, expected)


if __name__ == "__main__":
    unittest.main()
