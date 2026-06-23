import unittest
from single_cycle_check import has_single_cycle


params = [
    ([0], True),
    ([0, 1], False),
    ([1, 1, 1, 1], True),
    ([1, 1, 1, 1, 1], True),
    ([1, 1, 1, 1, -4], True),
    ([2, 2, -1], True),
    ([2, 2, 2], True),
    ([2, 3, 1, -4, -4, 2], True),
    ([1, 1, 1, 1, 2], False),
    ([1, 1, 0, 1], False),
    ([1, -1, 1, -1], False),
    ([3, 5, -6, 2, -4], False),
]


class TestSingleCycleCheck(unittest.TestCase):
    def test_single_cycle_check(self):
        for array, expected in params:
            with self.subTest(array=array, expected=expected):
                self.assertEqual(has_single_cycle(array), expected)


if __name__ == "__main__":
    unittest.main()
