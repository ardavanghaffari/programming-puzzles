import unittest
from bst_construction import Bst


class TestBst(unittest.TestCase):
    def setUp(self):
        self.bst = Bst(10)
        self.bst.left = Bst(5)
        self.bst.left.left = Bst(2)
        self.bst.left.left.left = Bst(1)
        self.bst.left.right = Bst(5)
        self.bst.right = Bst(15)
        self.bst.right.left = Bst(13)
        self.bst.right.left.right = Bst(14)
        self.bst.right.right = Bst(22)

    def test_bst(self):
        self.expect_in_order_traversal_to_be([1, 2, 5, 5, 10, 13, 14, 15, 22])

        self.bst.insert(12)
        self.expect_in_order_traversal_to_be([1, 2, 5, 5, 10, 12, 13, 14, 15, 22])

        # remove leaf node
        self.assertTrue(self.bst.contains(1))
        self.bst.remove(1)
        self.assertFalse(self.bst.contains(1))
        self.expect_in_order_traversal_to_be([2, 5, 5, 10, 12, 13, 14, 15, 22])

        self.bst.insert(4)
        self.expect_in_order_traversal_to_be([2, 4, 5, 5, 10, 12, 13, 14, 15, 22])

        # remove node with one right child
        self.assertTrue(self.bst.contains(2))
        self.bst.remove(2)
        self.assertFalse(self.bst.contains(2))
        self.expect_in_order_traversal_to_be([4, 5, 5, 10, 12, 13, 14, 15, 22])

        self.bst.insert(20)
        self.expect_in_order_traversal_to_be([4, 5, 5, 10, 12, 13, 14, 15, 20, 22])

        # remove node with one left child
        self.assertTrue(self.bst.contains(22))
        self.bst.remove(22)
        self.assertFalse(self.bst.contains(22))
        self.expect_in_order_traversal_to_be([4, 5, 5, 10, 12, 13, 14, 15, 20])

        # remove node with two children
        self.assertTrue(self.bst.contains(13))
        self.bst.remove(13)
        self.assertFalse(self.bst.contains(13))
        self.expect_in_order_traversal_to_be([4, 5, 5, 10, 12, 14, 15, 20])

        # remove root node
        self.assertTrue(self.bst.contains(10))
        self.bst.remove(10)
        self.assertFalse(self.bst.contains(10))
        self.expect_in_order_traversal_to_be([4, 5, 5, 12, 14, 15, 20])

    def expect_in_order_traversal_to_be(self, expected):
        self.assertEqual(self.bst.in_order_traversal(), expected)


if __name__ == "__main__":
    unittest.main()
