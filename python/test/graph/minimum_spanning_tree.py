import unittest

from python.src.graph.edge import Edge
from python.src.graph.minimum_spanning_tree import MinimumSpanningTree
from python.src.util.hashset import HashSet
from python.test.util.utilities import Utilities


class MinimumSpanningTreeTest(unittest.TestCase):
    def test_small_graph(self):
        mst = MinimumSpanningTree(Utilities.small_graph())
        self.assertEqual(100, mst.weight())

        edges = HashSet()
        for edge in mst.edges():
            edges.add(edge)

        self.assertTrue(Edge(0, 2, 12) in edges)
        self.assertTrue(Edge(1, 0, 14) in edges)
        self.assertTrue(Edge(10, 9, 19) in edges)
        self.assertTrue(Edge(4, 3, 4) in edges)
        self.assertTrue(Edge(5, 0, 8) in edges)
        self.assertTrue(Edge(5, 3, 2) in edges)
        self.assertTrue(Edge(6, 4, 13) in edges)
        self.assertTrue(Edge(8, 7, 17) in edges)
        self.assertTrue(Edge(9, 11, 11) in edges)

    def test_large_graph(self):
        mst = MinimumSpanningTree(Utilities.large_graph())
        self.assertEqual(2140, mst.weight())

        edges = HashSet()
        for edge in mst.edges():
            edges.add(edge)

        self.assertTrue(Edge(10, 13, 19) in edges)
        self.assertTrue(Edge(11, 43, 48) in edges)
        self.assertTrue(Edge(11, 45, 44) in edges)
        self.assertTrue(Edge(15, 12, 89) in edges)
        self.assertTrue(Edge(15, 13, 80) in edges)
        self.assertTrue(Edge(16, 27, 65) in edges)
        self.assertTrue(Edge(16, 4, 79) in edges)
        self.assertTrue(Edge(17, 23, 17) in edges)
        self.assertTrue(Edge(18, 23, 49) in edges)
        self.assertTrue(Edge(19, 20, 41) in edges)
        self.assertTrue(Edge(19, 21, 25) in edges)
        self.assertTrue(Edge(19, 25, 22) in edges)
        self.assertTrue(Edge(20, 13, 86) in edges)
        self.assertTrue(Edge(20, 14, 109) in edges)
        self.assertTrue(Edge(24, 25, 30) in edges)
        self.assertTrue(Edge(25, 26, 33) in edges)
        self.assertTrue(Edge(27, 42, 46) in edges)
        self.assertTrue(Edge(28, 17, 53) in edges)
        self.assertTrue(Edge(28, 22, 128) in edges)
        self.assertTrue(Edge(28, 27, 32) in edges)
        self.assertTrue(Edge(29, 23, 38) in edges)
        self.assertTrue(Edge(3, 21, 40) in edges)
        self.assertTrue(Edge(30, 36, 84) in edges)
        self.assertTrue(Edge(32, 18, 45) in edges)
        self.assertTrue(Edge(33, 49, 42) in edges)
        self.assertTrue(Edge(34, 42, 62) in edges)
        self.assertTrue(Edge(35, 34, 20) in edges)
        self.assertTrue(Edge(35, 40, 57) in edges)
        self.assertTrue(Edge(37, 39, 12) in edges)
        self.assertTrue(Edge(38, 26, 36) in edges)
        self.assertTrue(Edge(38, 31, 3) in edges)
        self.assertTrue(Edge(38, 37, 10) in edges)
        self.assertTrue(Edge(39, 36, 4) in edges)
        self.assertTrue(Edge(4, 1, 110) in edges)
        self.assertTrue(Edge(4, 5, 26) in edges)
        self.assertTrue(Edge(40, 39, 14) in edges)
        self.assertTrue(Edge(41, 40, 18) in edges)
        self.assertTrue(Edge(41, 43, 43) in edges)
        self.assertTrue(Edge(43, 47, 24) in edges)
        self.assertTrue(Edge(44, 47, 8) in edges)
        self.assertTrue(Edge(45, 46, 64) in edges)
        self.assertTrue(Edge(46, 48, 58) in edges)
        self.assertTrue(Edge(48, 49, 61) in edges)
        self.assertTrue(Edge(6, 1, 1) in edges)
        self.assertTrue(Edge(6, 9, 21) in edges)
        self.assertTrue(Edge(7, 4, 13) in edges)
        self.assertTrue(Edge(8, 3, 5) in edges)
        self.assertTrue(Edge(9, 0, 11) in edges)
        self.assertTrue(Edge(9, 2, 115) in edges)


if __name__ == '__main__':
    unittest.main()
