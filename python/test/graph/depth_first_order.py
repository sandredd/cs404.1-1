import unittest

from python.src.graph.depth_first_order import DepthFirstOrder
from python.test.util.utilities import Utilities


class DepthFirstSearchTest(unittest.TestCase):

    def setUp(self):
        graph = Utilities.small_directed_graph()
        self.dfs = DepthFirstOrder(graph)

    def test_preorder(self):
        expected = [0, 6, 2, 1, 5, 3, 4, 7, 8, 9, 10, 11]
        actual = [0] * len(expected)

        i = 0
        for v in self.dfs.preorder():
            actual[i] = v
            i += 1

        self.assertEqual(expected, actual)

    def test_postorder(self):
        expected = [6, 2, 1, 5, 0, 4, 3, 8, 7, 10, 11, 9]
        actual = [0] * len(expected)

        i = 0
        for v in self.dfs.postorder():
            actual[i] = v
            i += 1

        self.assertEqual(expected, actual)

    def test_reverse_postorder(self):
        expected = [9, 11, 10, 7, 8, 3, 4, 0, 5, 1, 2, 6]
        actual = [0] * len(expected)

        i = 0
        for v in self.dfs.reverse_postorder():
            actual[i] = v
            i += 1

        self.assertEqual(expected, actual)


if __name__ == '__main__':
    unittest.main()
