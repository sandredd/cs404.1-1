import unittest

from python.src.graph.depth_first_order import DepthFirstOrder
from python.src.graph.topological_sort import TopologicalSort
from python.test.util.utilities import Utilities


class TopologicalSortTest(unittest.TestCase):
    def test_cyclic_graph_no_topological_order(self):
        graph = Utilities.small_cyclic_graph()
        topological = TopologicalSort(graph)
        self.assertFalse(topological.has_order())
        self.assertIsNone(topological.order())

    def test_acyclic_graph(self):
        graph = Utilities.small_acyclic_graph()
        topological = TopologicalSort(graph)
        self.assertTrue(topological.has_order())

        expected = [8, 7, 2, 3, 0, 5, 1, 6, 9, 11, 10, 12, 4]
        actual = [0] * len(expected)

        i = 0
        for v in topological.order():
            actual[i] = v
            i += 1

        self.assertEqual(expected, actual)

    def test_topological_order_reverse_postorder(self):
        graph = Utilities.small_acyclic_graph()

        a = [0] * graph.num_vertices()
        b = [0] * graph.num_vertices()

        topological = TopologicalSort(graph)
        i = 0
        for v in topological.order():
            a[i] = v
            i += 1

        dfs = DepthFirstOrder(graph)
        i = 0
        for v in dfs.reverse_postorder():
            b[i] = v
            i += 1

        self.assertEqual(a, b)


if __name__ == '__main__':
    unittest.main()
