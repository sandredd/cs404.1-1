import unittest

from python.src.graph.edge import Edge
from python.src.graph.minimum_spanning_tree import MinimumSpanningTree
from python.src.util.hashset import HashSet
from python.test.util.utilities import Utilities


class MinimumSpanningTreeTest(unittest.TestCase):

    def check_edge(self, edges, source, dest, weight):
        a = Edge(source, dest, weight)
        b = a.reverse()
        self.assertTrue(a in edges or b in edges,
                        "%d -- %d missing" % (source, dest))

    def test_small_graph(self):
        mst = MinimumSpanningTree(Utilities.small_graph())
        self.assertEqual(100, mst.weight())

        edges = HashSet()
        for edge in mst.edges():
            edges.add(edge)

        self.check_edge(edges, 0, 2, 12)
        self.check_edge(edges, 1, 0, 14)
        self.check_edge(edges, 10, 9, 19)
        self.check_edge(edges, 4, 3, 4)
        self.check_edge(edges, 5, 0, 8)
        self.check_edge(edges, 5, 3, 2)
        self.check_edge(edges, 6, 4, 13)
        self.check_edge(edges, 8, 7, 17)
        self.check_edge(edges, 9, 11, 11)

    def test_large_graph(self):
        mst = MinimumSpanningTree(Utilities.large_graph())
        self.assertEqual(2140, mst.weight())

        edges = HashSet()
        for edge in mst.edges():
            edges.add(edge)

        self.check_edge(edges, 10, 13, 19)
        self.check_edge(edges, 11, 43, 48)
        self.check_edge(edges, 11, 45, 44)
        self.check_edge(edges, 15, 12, 89)
        self.check_edge(edges, 15, 13, 80)
        self.check_edge(edges, 16, 27, 65)
        self.check_edge(edges, 16, 4, 79)
        self.check_edge(edges, 17, 23, 17)
        self.check_edge(edges, 18, 23, 49)
        self.check_edge(edges, 19, 20, 41)
        self.check_edge(edges, 19, 21, 25)
        self.check_edge(edges, 19, 25, 22)
        self.check_edge(edges, 20, 13, 86)
        self.check_edge(edges, 20, 14, 109)
        self.check_edge(edges, 24, 25, 30)
        self.check_edge(edges, 25, 26, 33)
        self.check_edge(edges, 27, 42, 46)
        self.check_edge(edges, 28, 17, 53)
        self.check_edge(edges, 28, 22, 128)
        self.check_edge(edges, 28, 27, 32)
        self.check_edge(edges, 29, 23, 38)
        self.check_edge(edges, 3, 21, 40)
        self.check_edge(edges, 30, 36, 84)
        self.check_edge(edges, 32, 18, 45)
        self.check_edge(edges, 33, 49, 42)
        self.check_edge(edges, 34, 42, 62)
        self.check_edge(edges, 35, 34, 20)
        self.check_edge(edges, 35, 40, 57)
        self.check_edge(edges, 37, 39, 12)
        self.check_edge(edges, 38, 26, 36)
        self.check_edge(edges, 38, 31, 3)
        self.check_edge(edges, 38, 37, 10)
        self.check_edge(edges, 39, 36, 4)
        self.check_edge(edges, 4, 1, 110)
        self.check_edge(edges, 4, 5, 26)
        self.check_edge(edges, 40, 39, 14)
        self.check_edge(edges, 41, 40, 18)
        self.check_edge(edges, 41, 43, 43)
        self.check_edge(edges, 43, 47, 24)
        self.check_edge(edges, 44, 47, 8)
        self.check_edge(edges, 45, 46, 64)
        self.check_edge(edges, 46, 48, 58)
        self.check_edge(edges, 48, 49, 61)
        self.check_edge(edges, 6, 1, 1)
        self.check_edge(edges, 6, 9, 21)
        self.check_edge(edges, 7, 4, 13)
        self.check_edge(edges, 8, 3, 5)
        self.check_edge(edges, 9, 0, 11)
        self.check_edge(edges, 9, 2, 115)


if __name__ == '__main__':
    unittest.main()
