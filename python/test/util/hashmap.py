import random
import unittest

from python.src.util.hashmap import HashMap


class HashMapTest(unittest.TestCase):

    def setUp(self):
        self.map = HashMap()
        self.randmax = 999999

    def test_clear(self):
        self.map.put(1, 2)

        self.assertEqual(1, self.map.size())
        self.assertFalse(self.map.is_empty())

        self.map.clear()

        self.assertEqual(0, self.map.size())
        self.assertTrue(self.map.is_empty())
        self.assertFalse(self.map.contains(1))
        self.assertIsNone(self.map.get(1))

    def test_size_is_empty(self):
        self.assertTrue(self.map.is_empty())
        self.assertEqual(0, self.map.size())

        self.map.put(1, 2)

        self.assertEqual(1, self.map.size())
        self.assertFalse(self.map.is_empty())

    def test_contains(self):
        self.assertFalse(self.map.contains(1))
        self.map.put(1, 1)
        self.assertTrue(self.map.contains(1))

    def test_get_nonexistent(self):
        self.assertIsNone(self.map.get(1))

    def test_put_size(self):
        for i in range(10):
            self.map.put(random.randrange(self.randmax),
                         random.randrange(self.randmax))
            self.assertEqual(i + 1, self.map.size())

    def test_get(self):
        keys = [0] * 10
        values = [0] * len(keys)

        for i in range(len(keys)):
            keys[i] = random.randrange(self.randmax)
            values[i] = random.randrange(self.randmax)
            self.map.put(keys[i], values[i])

        for i in range(len(keys)):
            self.assertEqual(values[i], self.map.get(keys[i]))

    def test_put_duplicate_overwriteE(self):
        key = random.randrange(self.randmax)
        value = random.randrange(self.randmax)
        self.map.put(key, value)

        for i in range(10):
            self.map.put(random.randrange(self.randmax),
                         random.randrange(self.randmax))

        self.assertEqual(value, self.map.get(key))

        value = random.randrange(self.randmax)
        self.map.put(key, value)
        self.assertEqual(value, self.map.get(key))

    def test_delete(self):
        keys = [0] * 10
        for i in range(len(keys)):
            keys[i] = random.randrange(self.randmax)
            self.map.put(keys[i], random.randrange(self.randmax))

        index = random.randrange(len(keys))
        key = keys[index]
        self.map.delete(key)

        self.assertFalse(self.map.contains(key))
        self.assertIsNone(self.map.get(key))

    def test_iterator(self):
        entries = [HashMap.Entry(0, 0)] * 10
        for i in range(len(entries)):
            key = random.randrange(self.randmax)
            value = random.randrange(self.randmax)
            entries[i] = HashMap.Entry(key, value)
            self.map.put(key, value)

        for entry in self.map:
            self.assertIn(entry, entries)

    def test_resize_limits(self):
        capacity = len(self.map.table)
        for i in range(capacity * 8 - 1):
            self.map.put(i, i)

        self.assertEqual(capacity, len(self.map.table))
        self.map.put(-1, -1)
        self.assertEqual(capacity * 2, len(self.map.table))

        capacity = len(self.map.table)
        for key in self.map.keys():
            if (self.map.size() - 1) / capacity <= 2:
                break

            self.map.delete(key)

        self.assertEqual(capacity, len(self.map.table))
        self.map.delete(self.map.keys().front())
        self.assertEqual(capacity / 2, len(self.map.table))

    def test_resize_double_on_new_element_only(self):
        capacity = len(self.map.table)
        for i in range(capacity * 8 + 1):
            self.map.put(1, 1)

        self.assertEqual(capacity, len(self.map.table))

    def test_items_searchable_after_resize(self):
        capacity = len(self.map.table)
        for i in range(capacity * 8 + 1):
            self.map.put(i, i)

        self.assertEqual(capacity * 2, len(self.map.table))

        for i in range(self.map.size()):
            self.assertEqual(i, self.map.get(i))


if __name__ == '__main__':
    unittest.main()
