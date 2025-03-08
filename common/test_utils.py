import unittest


def expect_in_order_traversal_to_be(bst, expected):
    unittest.TestCase().assertEqual(in_order_traversal(bst), expected)


def in_order_traversal(bst):
    result = []

    def traverse(bst):
        if not bst:
            return
        traverse(bst.left)
        result.append(bst.value)
        traverse(bst.right)

    traverse(bst)
    return result
