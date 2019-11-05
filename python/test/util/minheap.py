import random
import unittest

from python.src.util.minheap import MinHeap


class MinHeapTest(unittest.TestCase):

    def setUp(self):
        self.heap = MinHeap()
        self.randmax = 999999

    def test_size_is_empty(self):
        self.assertTrue(self.heap.is_empty())
        self.assertEqual(0, self.heap.size())

        for i in range(self.heap.initial_size):
            self.heap.insert(i)

        self.assertEqual(self.heap.initial_size, self.heap.size())
        self.assertFalse(self.heap.is_empty())

    def test_remove_minimum_empty_heap(self):
        with self.assertRaises(Exception):
            self.heap.remove_minimum()

        with self.assertRaises(Exception):
            self.heap.min()

    def test_sorted_removal(self):
        n = 100
        expected = [0] * n

        for i in range(n):
            r = random.randrange(self.randmax)
            self.heap.insert(r)
            self.assertTrue(self.heap.is_min_heap())
            expected[i] = r

        actual = [0] * n
        for i in range(n):
            actual[i] = self.heap.remove_minimum()
            self.assertTrue(self.heap.is_min_heap())

        expected.sort()
        self.assertEqual(expected, actual)

    def test_iterator(self):
        expected = [0] * self.heap.initial_size

        for i in range(self.heap.initial_size):
            r = random.randrange(self.randmax)
            self.heap.insert(r)
            expected[i] = r

        expected.sort()

        for element in self.heap:
            self.assertTrue(element in expected)

    def test_resize(self):
        for i in range(self.heap.initial_size - 1):
            self.heap.insert(random.randrange(self.randmax))

        self.assertEqual(self.heap.initial_size, self.heap.capacity())
        self.heap.insert(random.randrange(self.randmax))
        self.assertEqual(2 * self.heap.initial_size, self.heap.capacity())

        for i in range(int(self.heap.initial_size / 2)):
            self.heap.remove_minimum()

        self.assertEqual(2 * self.heap.initial_size, self.heap.capacity())
        self.heap.remove_minimum()
        self.assertEqual(self.heap.initial_size, self.heap.capacity())


if __name__ == '__main__':
    unittest.main()
