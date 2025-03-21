import unittest
from remove_islands import remove_islands

params = [
    (
        [
            [1],
        ],
        [
            [1],
        ],
    ),
    (
        [
            [0, 1, 0],
        ],
        [
            [0, 1, 0],
        ],
    ),
    (
        [
            [0],
            [1],
            [0],
            [1],
        ],
        [
            [0],
            [1],
            [0],
            [1],
        ],
    ),
    (
        [
            [1, 1, 1],
            [1, 1, 1],
            [1, 1, 1],
        ],
        [
            [1, 1, 1],
            [1, 1, 1],
            [1, 1, 1],
        ],
    ),
    (
        [
            [0, 0, 0],
            [0, 1, 0],
            [0, 0, 0],
        ],
        [
            [0, 0, 0],
            [0, 0, 0],
            [0, 0, 0],
        ],
    ),
    (
        [
            [1, 0, 0, 0, 0, 0],
            [0, 1, 0, 1, 1, 1],
            [0, 0, 1, 0, 1, 0],
            [1, 1, 0, 0, 1, 0],
            [1, 0, 1, 1, 0, 0],
            [1, 0, 0, 0, 0, 1],
        ],
        [
            [1, 0, 0, 0, 0, 0],
            [0, 0, 0, 1, 1, 1],
            [0, 0, 0, 0, 1, 0],
            [1, 1, 0, 0, 1, 0],
            [1, 0, 0, 0, 0, 0],
            [1, 0, 0, 0, 0, 1],
        ],
    ),
]


class TestRemoveIslands(unittest.TestCase):
    def test_remove_islands(self):
        for matrix, expected in params:
            with self.subTest(matrix=matrix, expected=expected):
                self.assertEqual(remove_islands(matrix), expected)


if __name__ == "__main__":
    unittest.main()
