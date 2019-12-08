import unittest

from python.src.util.union_find import UnionFind


class UnionFindTest(unittest.TestCase):

    def setUp(self):
        self.initial_count = 10
        self.uf = UnionFind(self.initial_count)

    def test_transitivity(self):
        self.uf.union(0, 1)
        self.uf.union(2, 1)

        self.assertTrue(self.uf.connected(0, 2))
        self.assertEqual(self.uf.find(0), self.uf.find(2))

        for i in range(3, self.initial_count):
            self.assertFalse(self.uf.connected(0, i))

    def test_component_count(self):
        for i in range(1, self.initial_count):
            self.uf.union(i - 1, i)
            self.assertEqual(self.initial_count - i, self.uf.get_count())

        for i in range(self.initial_count):
            for j in range(i, self.initial_count):
                self.assertTrue(self.uf.connected(i, j))


if __name__ == '__main__':
    unittest.main()
