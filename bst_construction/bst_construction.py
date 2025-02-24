class Bst:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, value):
        if value >= self.value:
            if self.right is not None:
                self.right.insert(value)
            else:
                self.right = Bst(value)

        if value < self.value:
            if self.left is not None:
                self.left.insert(value)
            else:
                self.left = Bst(value)

    def contains(self, value):
        if value == self.value:
            return True

        if value > self.value:
            if self.right is not None:
                return self.right.contains(value)

        if value < self.value:
            if self.left is not None:
                return self.left.contains(value)

        return False

    def remove(self, value):
        if self.is_single_node_tree(): # don't remove from single-node tree
            return

        node, n_parent = self.find_to_be_removed_node_and_its_parent(value)

        if node is None: # not found
            return

        if node.is_leaf():
            self.remove_leaf(node, n_parent)
            return

        replacement, r_parent = node.find_replacement_and_its_parent()

        if node == r_parent: # replacement is node's child
            if node == n_parent.left: # node is its parent's left child
                n_parent.left = replacement
            else: # it is its right child
                n_parent.right = replacement
            if node.has_two_children():
                replacement.left = node.left
        else: # node and its replacement are not adjacent
            node.value = replacement.value
            if replacement.is_leaf():
                # should always be this case but will keep the else branch for thoroughness
                if replacement.left_child_of(r_parent):
                    r_parent.left = None
                else:
                    r_parent.right = None
            else:
                # then it can only have a right child node. It couldn't have had a left child
                # since that child would have been the replacement
                r_parent.left = replacement.right

    def find_to_be_removed_node_and_its_parent(self, value):
        node = self
        parent = None

        while node is not None:
            if value == node.value:
                return [node, parent]

            if value < node.value:
                parent = node
                node = node.left
            else:
                parent = node
                node = node.right

        return [None, None]

    def find_replacement_and_its_parent(self):
        if self.right is None:
            return [self.left, self]

        parent = self
        replacement = self.right # one right
        node = replacement.left
        while node is not None: # and then all the way to the left
            parent = replacement
            replacement = node
            node = node.left

        return [replacement, parent]

    def remove_leaf(self, node, parent):
        if node.left_child_of(parent):
            parent.left = None
        else:
            parent.right = None

    def is_single_node_tree(self):
        return self.is_leaf()

    def is_leaf(self):
        return self.left is None and self.right is None

    def left_child_of(self, parent):
        return self == parent.left

    def has_two_children(self):
        return self.left is not None and self.right is not None

    # Used only for testing
    def in_order_traversal(self):
        result = []

        def traverse(node):
            if not node:
                return
            traverse(node.left)
            result.append(node.value)
            traverse(node.right)

        traverse(self)
        return result
