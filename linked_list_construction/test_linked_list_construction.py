import unittest
from linked_list_construction import DoublyLinkedList
from linked_list_construction import Node


class TestDoublyLinkedList(unittest.TestCase):
    impl = DoublyLinkedList()

    def test_doubly_linked_list(self):
        self.given_linked_list_is_initialized_with([1, 2, 3, 4, 5])
        self.expect_linked_list_nodes_to_be([1, 2, 3, 4, 5])

        # Set the existing node with value 4 as the head
        self.impl.set_head(self.impl.nodes()[3])
        self.expect_linked_list_nodes_to_be([4, 1, 2, 3, 5])

        # Set the stand-alone node with value 6 as the tail
        self.impl.set_tail(Node(6))
        self.expect_linked_list_nodes_to_be([4, 1, 2, 3, 5, 6])

        # Move the existing node with value 3 before the existing node with value 6
        self.impl.insert_before(self.impl.nodes()[5], self.impl.nodes()[3])
        self.expect_linked_list_nodes_to_be([4, 1, 2, 5, 3, 6])

        # Insert a stand-alone node with value 3 after the existing node with value 6
        self.impl.insert_after(self.impl.nodes()[5], Node(3))
        self.expect_linked_list_nodes_to_be([4, 1, 2, 5, 3, 6, 3])

        # Insert a stand-alone node with value 3 in position 1
        self.impl.insert_at_position(1, Node(3))
        self.expect_linked_list_nodes_to_be([3, 4, 1, 2, 5, 3, 6, 3])

        # Remove all nodes with value 3
        self.impl.remove_nodes_with_value(3)
        self.expect_linked_list_nodes_to_be([4, 1, 2, 5, 6])

        # Remove the existing node with value 2
        self.impl.remove(self.impl.nodes()[2])
        self.expect_linked_list_nodes_to_be([4, 1, 5, 6])

        self.assertTrue(self.impl.contains_node_with_value(5))

    def given_linked_list_is_initialized_with(self, nodes):
        for p, n in enumerate([Node(n) for n in nodes], start=1):
            self.impl.insert_at_position(p, n)

    def expect_linked_list_nodes_to_be(self, expected):
        actual = [n.value for n in self.impl.nodes()]
        self.assertEqual(actual, expected)


if __name__ == "__main__":
    unittest.main()
