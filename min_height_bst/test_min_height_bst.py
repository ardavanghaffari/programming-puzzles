import unittest
from test_utils import expect_in_order_traversal_to_be
from min_height_bst import create_min_height_bst_from


class TestMinHeightBst(unittest.TestCase):
    numbers = [1, 2, 5, 7, 10, 13, 14, 15, 22]

    def test_min_height_bst(self):
        bst = create_min_height_bst_from(self.numbers)
        expect_in_order_traversal_to_be(bst, self.numbers)
        self.assertEqual(self.tree_height(bst), 4)

    def tree_height(self, node):
        if node is None:
            return 0
        return 1 + max(self.tree_height(node.left), self.tree_height(node.right))


if __name__ == "__main__":
    unittest.main()
