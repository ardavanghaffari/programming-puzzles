import unittest
from continuous_median import ContinuousMedian


class TestContinuousMedian(unittest.TestCase):
    def test_continuous_median(self):
        impl = ContinuousMedian()

        impl.insert(5)
        self.assertEqual(impl.get_median(), 5)

        impl.insert(10)
        self.assertEqual(impl.get_median(), 7.5)

        impl.insert(100)
        self.assertEqual(impl.get_median(), 10)

        impl.insert(200)
        self.assertEqual(impl.get_median(), 55)

        impl.insert(6)
        self.assertEqual(impl.get_median(), 10)


if __name__ == "__main__":
    unittest.main()
