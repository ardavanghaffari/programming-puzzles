import unittest
from search_in_sorted_matrix import search_in_sorted_matrix


params = [
    (
        [
            [1, 2, 3],
            [4, 5, 6],
            [7, 8, 9],
            [10, 11, 12],
        ],
        10,
        [3, 0],
    ),
    (
        [
            [1, 2, 3, 4],
            [5, 6, 7, 8],
        ],
        8,
        [1, 3],
    ),
    (
        [
            [1, 4, 7, 12, 15, 1000],
            [2, 5, 19, 31, 32, 1001],
            [3, 8, 24, 33, 35, 1002],
            [40, 41, 42, 44, 45, 1003],
            [99, 100, 103, 106, 128, 1004],
        ],
        44,
        [3, 3],
    ),
    (
        [
            [1, 4, 7, 12, 15, 1000],
            [2, 5, 19, 31, 32, 1001],
            [3, 8, 24, 33, 35, 1002],
            [40, 41, 42, 44, 45, 1003],
            [99, 100, 103, 106, 128, 1004],
        ],
        1,
        [0, 0],
    ),
    (
        [
            [1, 4, 7, 12, 15, 1000],
            [2, 5, 19, 31, 32, 1001],
            [3, 8, 24, 33, 35, 1002],
            [40, 41, 42, 44, 45, 1003],
            [99, 100, 103, 106, 128, 1004],
        ],
        1004,
        [4, 5],
    ),
    (
        [
            [1, 4, 7, 12, 15, 1000],
            [2, 5, 19, 31, 32, 1001],
            [3, 8, 24, 33, 35, 1002],
            [40, 41, 42, 44, 45, 1003],
            [99, 100, 103, 106, 128, 1004],
        ],
        43,
        [-1, -1],
    ),
]


class TestSearchInSortedMatrix(unittest.TestCase):
    def test_search_in_sorted_matrix(self):
        for matrix, target, expected in params:
            with self.subTest(matrix=matrix, target=target, expected=expected):
                self.assertEqual(search_in_sorted_matrix(matrix, target), expected)


if __name__ == "__main__":
    unittest.main()
