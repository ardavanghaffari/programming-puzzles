class Node:
    def __init__(self, value):
        self.value = value
        self.prev = None
        self.next = None


class DoublyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    def set_head(self, node):
        if self.head is None:
            self.head = node
            self.tail = node
            return
        self.insert_before(self.head, node)

    def set_tail(self, node):
        if self.tail is None:
            self.set_head(node)
            return
        self.insert_after(self.tail, node)

    def insert_before(self, node, node_to_insert):
        if self.contains_node(node_to_insert):
            self.remove(node_to_insert)
        prev = node.prev
        if prev is None:
            node_to_insert.next = node
            node_to_insert.prev = None
            node.prev = node_to_insert
            self.head = node_to_insert
        else:
            prev.next = node_to_insert
            node_to_insert.prev = prev
            node_to_insert.next = node
            node.prev = node_to_insert

    def insert_after(self, node, node_to_insert):
        if self.contains_node(node_to_insert):
            self.remove(node_to_insert)
        next = node.next
        if next is None:
            node_to_insert.next = None
            node_to_insert.prev = node
            node.next = node_to_insert
            self.tail = node_to_insert
        else:
            node.next = node_to_insert
            node_to_insert.prev = node
            node_to_insert.next = next
            next.prev = node_to_insert

    def insert_at_position(self, position, node_to_insert):
        if position == 1:
            self.set_head(node_to_insert)
            return
        node = self.head
        cur = 1
        while node and cur != position:
            node = node.next
            cur += 1
        if node:
            self.insert_before(node, node_to_insert)
        else:
            self.set_tail(node_to_insert)

    def remove_nodes_with_value(self, value):
        node = self.head
        while node:
            next = node.next
            if node.value == value:
                self.remove(node)
            node = next

    def remove(self, node):
        if node == self.head:
            self.head = self.head.next
        if node == self.tail:
            self.tail = self.tail.prev
        next = node.next
        prev = node.prev
        if prev is not None:
            prev.next = next
        if next is not None:
            next.prev = prev
        node.prev = node.next = None

    def contains_node_with_value(self, value):
        node = self.head
        while node:
            if node.value == value:
                return True
            node = node.next
        return False

    def contains_node(self, node):
        return node.next is not None and node.prev is not None
