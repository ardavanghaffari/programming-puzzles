import unittest
from min_max_stack import MinMaxStack


class TestMinMaxStack(unittest.TestCase):
    impl = MinMaxStack()

    def test_min_max_stack(self):
        self.impl.push(5)
        self.assertEqual(self.impl.get_min(), 5)
        self.assertEqual(self.impl.get_max(), 5)
        self.assertEqual(self.impl.peek(), 5)

        self.impl.push(7)
        self.assertEqual(self.impl.get_min(), 5)
        self.assertEqual(self.impl.get_max(), 7)
        self.assertEqual(self.impl.peek(), 7)

        self.impl.push(2)
        self.assertEqual(self.impl.get_min(), 2)
        self.assertEqual(self.impl.get_max(), 7)
        self.assertEqual(self.impl.peek(), 2)

        self.impl.pop()
        self.impl.pop()
        self.assertEqual(self.impl.get_min(), 5)
        self.assertEqual(self.impl.get_max(), 5)
        self.assertEqual(self.impl.peek(), 5)


if __name__ == "__main__":
    unittest.main()
