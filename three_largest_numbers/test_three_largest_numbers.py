import unittest
from three_largest_numbers import three_largest_numbers

params = [
    ([10, 5, 9, 10, 12], [10, 10, 12]),
    ([141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7], [18, 141, 541]),
]


class TestBalancedBrackets(unittest.TestCase):
    def test_three_largest_numbers(self):
        for numbers, expected in params:
            with self.subTest(numbers):
                self.assertEqual(three_largest_numbers(numbers), expected)


if __name__ == "__main__":
    unittest.main()
