def create_min_height_bst_from(numbers):
    return min_height_bst(numbers, None, 0, len(numbers) - 1)


def min_height_bst(numbers, root, i, j):
    # Base case only one element in the subarray
    if i == j:
        if root is None:
            return BST(numbers[i])
        root.insert(numbers[i])
        return root

    # Base case two elements in the subarray
    if j - i == 1:
        if root is None:
            root = BST(numbers[i])
            root.insert(numbers[j])
            return root
        root.insert(numbers[i])
        root.insert(numbers[j])
        return root

    # Recursive case
    m = (i + j) // 2
    if root is None:
        root = BST(numbers[m])
    else:
        root.insert(numbers[m])
    min_height_bst(numbers, root, i, m - 1)
    min_height_bst(numbers, root, m + 1, j)
    return root


class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, value):
        if value < self.value:
            if self.left is None:
                self.left = BST(value)
            else:
                self.left.insert(value)
        else:
            if self.right is None:
                self.right = BST(value)
            else:
                self.right.insert(value)
