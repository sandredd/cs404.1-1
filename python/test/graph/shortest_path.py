import sys
import unittest

from python.src.graph.shortest_path import ShortestPath
from python.test.util.utilities import Utilities


class ShortestPathTest(unittest.TestCase):
    def setUp(self):
        self.graph = Utilities.small_directed_graph()

    def check_graph(self, sp, expected_has_path_to, expected_dist_to):
        actual_has_path_to = [False] * len(expected_has_path_to)
        for i in range(len(expected_has_path_to)):
            actual_has_path_to[i] = sp.has_path_to(i)
        self.assertEqual(expected_has_path_to, actual_has_path_to)

        actual_dist_to = [False] * len(expected_dist_to)
        for i in range(len(expected_dist_to)):
            actual_dist_to[i] = sp.distance_to(i)
        self.assertEqual(expected_dist_to, actual_dist_to)

    def test_source_0(self):
        sp = ShortestPath(self.graph, 0)
        has_path_to = [True, True, True, False, False, True, True, False, False, False, False, False]
        dist_to = [0, 14, 12, sys.maxsize, sys.maxsize, 8, 20, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize]
        self.check_graph(sp, has_path_to, dist_to)

    def test_source_1(self):
        sp = ShortestPath(self.graph, 1)
        has_path_to = [False, True, False, False, False, False, False, False, False, False, False, False]
        dist_to = [sys.maxsize, 0, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize,
                   sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize]
        self.check_graph(sp, has_path_to, dist_to)

    def test_source_2(self):
        sp = ShortestPath(self.graph, 2)
        has_path_to = [False, False, True, False, False, False, False, False, False, False, False, False]
        dist_to = [sys.maxsize, sys.maxsize, 0, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize,
                   sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize]
        self.check_graph(sp, has_path_to, dist_to)

    def test_source_3(self):
        sp = ShortestPath(self.graph, 3)
        has_path_to = [False, False, False, True, True, True, True, False, False, False, False, False]
        dist_to = [sys.maxsize, sys.maxsize, sys.maxsize, 0, 4, 2, 17, sys.maxsize, sys.maxsize, sys.maxsize,
                   sys.maxsize, sys.maxsize]
        self.check_graph(sp, has_path_to, dist_to)

    def test_source_4(self):
        sp = ShortestPath(self.graph, 4)
        has_path_to = [False, False, False, False, True, True, True, False, False, False, False, False]
        dist_to = [sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, 0, 7, 13, sys.maxsize, sys.maxsize, sys.maxsize,
                   sys.maxsize, sys.maxsize]
        self.check_graph(sp, has_path_to, dist_to)

    def test_source_5(self):
        sp = ShortestPath(self.graph, 5)
        has_path_to = [False, False, False, False, False, True, False, False, False, False, False, False]
        dist_to = [sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, 0, sys.maxsize, sys.maxsize,
                   sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize]
        self.check_graph(sp, has_path_to, dist_to)

    def test_source_6(self):
        sp = ShortestPath(self.graph, 6)
        has_path_to = [False, False, False, False, False, False, True, False, False, False, False, False]
        dist_to = [sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, 0, sys.maxsize,
                   sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize]
        self.check_graph(sp, has_path_to, dist_to)

    def test_source_7(self):
        sp = ShortestPath(self.graph, 7)
        has_path_to = [False, False, False, False, False, False, False, True, True, False, False, False]
        dist_to = [sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, 0, 17,
                   sys.maxsize, sys.maxsize, sys.maxsize]
        self.check_graph(sp, has_path_to, dist_to)

    def test_source_8(self):
        sp = ShortestPath(self.graph, 8)
        has_path_to = [False, False, False, False, False, False, False, False, True, False, False, False]
        dist_to = [sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize,
                   sys.maxsize, 0, sys.maxsize, sys.maxsize, sys.maxsize]
        self.check_graph(sp, has_path_to, dist_to)

    def test_source_9(self):
        sp = ShortestPath(self.graph, 9)
        has_path_to = [False, False, False, False, False, False, False, False, False, True, True, True]
        dist_to = [sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize,
                   sys.maxsize, sys.maxsize, 0, 19, 11]
        self.check_graph(sp, has_path_to, dist_to)

    def test_source_10(self):
        sp = ShortestPath(self.graph, 10)
        has_path_to = [False, False, False, False, False, False, False, False, False, False, True, False]
        dist_to = [sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize,
                   sys.maxsize, sys.maxsize, sys.maxsize, 0, sys.maxsize]
        self.check_graph(sp, has_path_to, dist_to)

    def test_source_11(self):
        sp = ShortestPath(self.graph, 11)
        has_path_to = [False, False, False, False, False, False, False, False, False, False, False, True]
        dist_to = [sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize,
                   sys.maxsize, sys.maxsize, sys.maxsize, sys.maxsize, 0]
        self.check_graph(sp, has_path_to, dist_to)


if __name__ == '__main__':
    unittest.main()
