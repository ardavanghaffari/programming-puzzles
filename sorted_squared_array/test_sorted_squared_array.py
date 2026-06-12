import unittest
from sorted_squared_array import baseline, split_and_merge, two_pointers


solutions = [baseline, split_and_merge, two_pointers]
params = [
    ([], []),
    ([0], [0]),
    ([1], [1]),
    ([-1], [1]),
    ([-10, -5, 0, 5, 10], [0, 25, 25, 100, 100]),
    ([-7, -3, 1, 9, 22, 30], [1, 9, 49, 81, 484, 900]),
    ([-9, -7, -3, -1], [1, 9, 49, 81]),
    ([1, 2, 3, 5, 6, 8, 9], [1, 4, 9, 25, 36, 64, 81]),
    ([-4, -3, -2, -1, 0], [0, 1, 4, 9, 16]),
    ([-50, -4, -3, -2, 0, 1, 8, 20], [0, 1, 4, 9, 16, 64, 400, 2500]),
]


class TestSortedSquaredArray(unittest.TestCase):
    def test_sorted_squared_array(self):
        for solution in solutions:
            for array, expected in params:
                with self.subTest(solution=solution.__name__, array=array, expected=expected):
                    self.assertEqual(solution(array), expected)


if __name__ == "__main__":
    unittest.main()
