import unittest

from python.test.util.utilities import Utilities


class DirectedGraphTest(unittest.TestCase):

    def setUp(self):
        self.graph = Utilities.small_directed_graph()

    def test_single_edge_direction(self):
        self.assertTrue(6 in self.graph.adjacent_vertices(0))
        self.assertTrue(2 in self.graph.adjacent_vertices(0))
        self.assertTrue(1 in self.graph.adjacent_vertices(0))
        self.assertTrue(5 in self.graph.adjacent_vertices(0))
        self.assertTrue(5 in self.graph.adjacent_vertices(3))
        self.assertTrue(4 in self.graph.adjacent_vertices(3))
        self.assertTrue(5 in self.graph.adjacent_vertices(4))
        self.assertTrue(6 in self.graph.adjacent_vertices(4))
        self.assertTrue(8 in self.graph.adjacent_vertices(7))
        self.assertTrue(10 in self.graph.adjacent_vertices(9))
        self.assertTrue(11 in self.graph.adjacent_vertices(9))

        self.assertFalse(0 in self.graph.adjacent_vertices(6))
        self.assertFalse(0 in self.graph.adjacent_vertices(2))
        self.assertFalse(0 in self.graph.adjacent_vertices(1))
        self.assertFalse(0 in self.graph.adjacent_vertices(5))
        self.assertFalse(3 in self.graph.adjacent_vertices(5))
        self.assertFalse(3 in self.graph.adjacent_vertices(4))
        self.assertFalse(4 in self.graph.adjacent_vertices(5))
        self.assertFalse(4 in self.graph.adjacent_vertices(6))
        self.assertFalse(7 in self.graph.adjacent_vertices(8))
        self.assertFalse(9 in self.graph.adjacent_vertices(10))
        self.assertFalse(9 in self.graph.adjacent_vertices(11))

    def test_outdegree(self):
        expected = [4, 0, 0, 2, 2, 0, 0, 1, 0, 2, 0, 0]
        actual = [0] * len(expected)

        for i in range(self.graph.num_vertices()):
            actual[i] = self.graph.outdegree(i)

        self.assertEqual(expected, actual)

    def test_indegree(self):
        expected = [0, 1, 1, 0, 1, 3, 2, 0, 1, 0, 1, 1]
        actual = [0] * len(expected)

        for i in range(self.graph.num_vertices()):
            actual[i] = self.graph.indegree(i)

        self.assertEqual(expected, actual)

    def test_reversal(self):
        reverse = self.graph.reverse()

        self.assertTrue(0 in reverse.adjacent_vertices(6))
        self.assertTrue(0 in reverse.adjacent_vertices(2))
        self.assertTrue(0 in reverse.adjacent_vertices(1))
        self.assertTrue(0 in reverse.adjacent_vertices(5))
        self.assertTrue(3 in reverse.adjacent_vertices(5))
        self.assertTrue(3 in reverse.adjacent_vertices(4))
        self.assertTrue(4 in reverse.adjacent_vertices(5))
        self.assertTrue(4 in reverse.adjacent_vertices(6))
        self.assertTrue(7 in reverse.adjacent_vertices(8))
        self.assertTrue(9 in reverse.adjacent_vertices(10))
        self.assertTrue(9 in reverse.adjacent_vertices(11))

        self.assertFalse(6 in reverse.adjacent_vertices(0))
        self.assertFalse(2 in reverse.adjacent_vertices(0))
        self.assertFalse(1 in reverse.adjacent_vertices(0))
        self.assertFalse(5 in reverse.adjacent_vertices(0))
        self.assertFalse(5 in reverse.adjacent_vertices(3))
        self.assertFalse(4 in reverse.adjacent_vertices(3))
        self.assertFalse(5 in reverse.adjacent_vertices(4))
        self.assertFalse(6 in reverse.adjacent_vertices(4))
        self.assertFalse(8 in reverse.adjacent_vertices(7))
        self.assertFalse(10 in reverse.adjacent_vertices(9))
        self.assertFalse(10 in reverse.adjacent_vertices(9))


if __name__ == '__main__':
    unittest.main()
