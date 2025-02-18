import unittest
from two_number_sum import brute_force
from two_number_sum import hash_table
from two_number_sum import two_pointer

params = [
    ([], 5, []),
    ([3, 3], 6, [3, 3]),
    ([3, 2, 4], 6, [2, 4]),
    ([3, 4, 2], 6, [2, 4]),
    ([1, 2, 3, 4, 5], 10, []),
    ([7, 11, 15, 2], 9, [2, 7]),
    ([7, 11, 15, -2], 9, [-2, 11]),
]


class TestTwoNumberSum(unittest.TestCase):
    def test_brute_force(self):
        for numbers, target_sum, expected in params:
            with self.subTest(numbers=numbers, target_sum=target_sum, expected=expected):
                actual = brute_force(numbers, target_sum)
                self.assertEqual(actual, expected)

    def test_hash_table(self):
        for numbers, target_sum, expected in params:
            with self.subTest(numbers=numbers, target_sum=target_sum, expected=expected):
                actual = hash_table(numbers, target_sum)
                self.assertEqual(actual, expected)

    def test_two_pointer(self):
        for numbers, target_sum, expected in params:
            with self.subTest(numbers=numbers, target_sum=target_sum, expected=expected):
                actual = two_pointer(numbers, target_sum)
                self.assertEqual(actual, expected)


if __name__ == "__main__":
    unittest.main()
