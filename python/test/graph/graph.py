import unittest

from python.test.util.utilities import Utilities


class HashMapTest(unittest.TestCase):

    def setUp(self):
        self.graph = Utilities.small_graph()

    def test_graph_properties(self):
        self.assertEqual(11, self.graph.num_edges())
        self.assertEqual(12, self.graph.num_vertices())

    def test_degree(self):
        self.assertEqual(4, self.graph.degree(0))
        self.assertEqual(1, self.graph.degree(1))
        self.assertEqual(1, self.graph.degree(2))
        self.assertEqual(2, self.graph.degree(3))
        self.assertEqual(3, self.graph.degree(4))
        self.assertEqual(3, self.graph.degree(5))
        self.assertEqual(2, self.graph.degree(6))
        self.assertEqual(1, self.graph.degree(7))
        self.assertEqual(1, self.graph.degree(8))
        self.assertEqual(2, self.graph.degree(9))
        self.assertEqual(1, self.graph.degree(10))
        self.assertEqual(1, self.graph.degree(11))

    def has_edge_to(self, edges, vertex, weight):
        for edge in edges:
            if edge.dest() == vertex and edge.weight() == weight:
                return True

        return False

    def test_adjacent_vertices(self):
        self.assertTrue(self.has_edge_to(self.graph.adjacent_vertices(0), 6, 20))
        self.assertTrue(self.has_edge_to(self.graph.adjacent_vertices(0), 2, 12))
        self.assertTrue(self.has_edge_to(self.graph.adjacent_vertices(0), 1, 14))
        self.assertTrue(self.has_edge_to(self.graph.adjacent_vertices(0), 5, 8))
        self.assertTrue(self.has_edge_to(self.graph.adjacent_vertices(3), 5, 2))
        self.assertTrue(self.has_edge_to(self.graph.adjacent_vertices(3), 4, 4))
        self.assertTrue(self.has_edge_to(self.graph.adjacent_vertices(4), 5, 7))
        self.assertTrue(self.has_edge_to(self.graph.adjacent_vertices(4), 6, 13))
        self.assertTrue(self.has_edge_to(self.graph.adjacent_vertices(7), 8, 17))
        self.assertTrue(self.has_edge_to(self.graph.adjacent_vertices(9), 10, 19))
        self.assertTrue(self.has_edge_to(self.graph.adjacent_vertices(9), 11, 11))


if __name__ == '__main__':
    unittest.main()
