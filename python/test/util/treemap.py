import unittest
import random
import sys

from python.src.util.treemap import TreeMap


class TreeMapTestT(unittest.TestCase):

    def setUp(self):
        self.map = TreeMap()
        self.randmax = 999999

    def test_size_is_empty(self):
        self.assertTrue(self.map.is_empty())
        self.assertEqual(0, self.map.size())

        self.map.put(1, 2)
        self.map.put(2, 3)

        self.assertEqual(2, self.map.size())
        self.assertFalse(self.map.is_empty())

    def test_contains(self):
        self.assertFalse(self.map.contains(1))
        self.map.put(1, 2)
        self.assertTrue(self.map.contains(1))

    def test_get_nonexistent(self):
        self.assertIsNone(self.map.get(1))

    def test_put(self):
        for i in range(10):
            self.map.put(random.randrange(100), random.randrange(100))
            self.assertTrue(self.map.is_bst())

    def test_get(self):
        keys = [0] * 10
        values = [0] * len(keys)
        for i in range(len(keys)):
            keys[i] = random.randrange(self.randmax)
            values[i] = random.randrange(self.randmax)
            self.map.put(keys[i], values[i])

        for i in range(len(keys)):
            self.assertEqual(values[i], self.map.get(keys[i]))

    def test_put_duplicate_overwrite(self):
        key = random.randrange(self.randmax)
        value = random.randrange(self.randmax)
        self.map.put(key, value)

        for i in range(10):
            self.map.put(random.randrange(self.randmax), random.randrange(100))

        self.assertEqual(value, self.map.get(key))

        value = random.randrange(self.randmax)
        self.map.put(key, value)
        self.assertTrue(self.map.is_bst())
        self.assertEqual(value, self.map.get(key))

    def test_delete_min(self):
        minimum = sys.maxsize
        for i in range(10):
            r = random.randrange(self.randmax)
            self.map.put(r, random.randrange(self.randmax))

            if r < minimum:
                minimum = r

        self.assertTrue(self.map.contains(minimum))
        self.assertEqual(minimum, self.map.min())

        self.map.delete_min()

        self.assertTrue(self.map.is_bst())
        self.assertFalse(self.map.contains(minimum))
        self.assertNotEqual(minimum, self.map.min())

    def test_delete_max(self):
        maximum = 0
        for i in range(10):
            r = random.randrange(self.randmax)
            self.map.put(r, random.randrange(self.randmax))

            if r > maximum:
                maximum = r

        self.assertTrue(self.map.contains(maximum))
        self.assertEqual(maximum, self.map.max())

        self.map.delete_max()

        self.assertTrue(self.map.is_bst())
        self.assertFalse(self.map.contains(maximum))
        self.assertNotEqual(maximum, self.map.max())

    def test_delete(self):
        keys = [0] * 10
        for i in range(len(keys)):
            keys[i] = random.randrange(self.randmax)
            self.map.put(keys[i], random.randrange(self.randmax))

        index = random.randrange(len(keys))
        key = keys[index]
        self.map.delete(key)

        self.assertTrue(self.map.is_bst())
        self.assertFalse(self.map.contains(key))
        self.assertIsNone(self.map.get(key))

    def test_iterator(self):
        keys = [0] * 10
        for i in range(len(keys)):
            keys[i] = random.randrange(self.randmax)
            self.map.put(keys[i], random.randrange(self.randmax))

        keys.sort()
        for key in self.map:
            self.assertTrue(key in keys)


if __name__ == '__main__':
    unittest.main()
