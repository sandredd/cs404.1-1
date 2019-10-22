import random
import unittest

from python.src.util.hashset import HashSet


class HashSetTest(unittest.TestCase):

    def setUp(self):
        self.set = HashSet()
        self.randmax = 999999

    def test_clear(self):
        self.set.add(1)

        self.assertEqual(1, self.set.size())
        self.assertFalse(self.set.is_empty())

        self.set.clear()

        self.assertEqual(0, self.set.size())
        self.assertTrue(self.set.is_empty())
        self.assertFalse(self.set.contains(1))

    def test_size_is_empty(self):
        self.assertTrue(self.set.is_empty())
        self.assertEqual(0, self.set.size())

        self.set.add(1)

        self.assertEqual(1, self.set.size())
        self.assertFalse(self.set.is_empty())

    def test_contains(self):
        self.assertFalse(self.set.contains(1))
        self.set.add(1)
        self.assertTrue(self.set.contains(1))

    def test_put_size(self):
        for i in range(10):
            self.set.add(random.randrange(self.randmax))
            self.assertEqual(i + 1, self.set.size())

    def test_add_duplicate_no_size_increase(self):
        self.assertEqual(0, self.set.size())
        self.set.add(1)
        self.set.add(1)
        self.assertEqual(1, self.set.size())

    def test_delete(self):
        keys = [0] * 10
        for i in range(len(keys)):
            keys[i] = random.randrange(self.randmax)
            self.set.add(keys[i])

        index = random.randrange(len(keys))
        key = keys[index]
        self.set.remove(key)

        self.assertFalse(self.set.contains(key))


if __name__ == '__main__':
    unittest.main()
