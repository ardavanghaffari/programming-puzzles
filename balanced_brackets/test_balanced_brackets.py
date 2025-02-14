import unittest
from balanced_brackets import is_balanced

params = [
    ("()", True),
    ("()[]{}", True),
    ("([])", True),
    ("(]", False),
    ("(){", False),
    ("()}", False),
    ("){}", False),
]


class TestBalancedBrackets(unittest.TestCase):
    def test_is_balanced(self):
        for brackets, expected in params:
            with self.subTest(brackets=brackets, expected=expected):
                self.assertEqual(is_balanced(brackets), expected)


if __name__ == "__main__":
    unittest.main()
