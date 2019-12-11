import sys
import unittest

from python.src.graph.multiple_source_shortest_path import MultipleSourceShortestPath
from python.test.util.utilities import Utilities


class MinimumSpanningTreeTest(unittest.TestCase):

    def setUp(self):
        self.graph = Utilities.small_directed_graph()

    def check_graph(self, mssp, expected_has_path_to, expected_dist_to):
        actual_has_path_to = [False] * len(expected_has_path_to)
        for i in range(len(expected_has_path_to)):
            actual_has_path_to[i] = mssp.has_path_to(i)
        self.assertEqual(expected_has_path_to, actual_has_path_to)

        actual_dist_to = [False] * len(expected_dist_to)
        for i in range(len(expected_dist_to)):
            actual_dist_to[i] = mssp.distance_to(i)
        self.assertEqual(expected_dist_to, actual_dist_to)

    def test_source_01(self):
        mssp = MultipleSourceShortestPath(self.graph, [0, 1])

        has_path_to = [
            True, True, True, False, False, True, True, False, False, False,
            False, False
        ]
        dist_to = [
            0,
            0,
            12,
            sys.maxsize,
            sys.maxsize,
            8,
            20,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
        ]
        self.check_graph(mssp, has_path_to, dist_to)

    def test_source_02(self):
        mssp = MultipleSourceShortestPath(self.graph, [0, 2])

        has_path_to = [
            True, True, True, False, False, True, True, False, False, False,
            False, False
        ]
        dist_to = [
            0,
            14,
            0,
            sys.maxsize,
            sys.maxsize,
            8,
            20,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
        ]
        self.check_graph(mssp, has_path_to, dist_to)

    def test_source_03(self):
        mssp = MultipleSourceShortestPath(self.graph, [0, 3])

        has_path_to = [
            True, True, True, True, True, True, True, False, False, False,
            False, False
        ]
        dist_to = [
            0, 14, 12, 0, 4, 2, 17, sys.maxsize, sys.maxsize, sys.maxsize,
            sys.maxsize, sys.maxsize
        ]
        self.check_graph(mssp, has_path_to, dist_to)

    def test_source_04(self):
        mssp = MultipleSourceShortestPath(self.graph, [0, 4])

        has_path_to = [
            True, True, True, False, True, True, True, False, False, False,
            False, False
        ]
        dist_to = [
            0,
            14,
            12,
            sys.maxsize,
            0,
            7,
            13,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
        ]
        self.check_graph(mssp, has_path_to, dist_to)

    def test_source_05(self):
        mssp = MultipleSourceShortestPath(self.graph, [0, 5])

        has_path_to = [
            True, True, True, False, False, True, True, False, False, False,
            False, False
        ]
        dist_to = [
            0,
            14,
            12,
            sys.maxsize,
            sys.maxsize,
            0,
            20,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
        ]
        self.check_graph(mssp, has_path_to, dist_to)

    def test_source_06(self):
        mssp = MultipleSourceShortestPath(self.graph, [0, 6])

        has_path_to = [
            True, True, True, False, False, True, True, False, False, False,
            False, False
        ]
        dist_to = [
            0,
            14,
            12,
            sys.maxsize,
            sys.maxsize,
            8,
            0,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
        ]
        self.check_graph(mssp, has_path_to, dist_to)

    def test_source_07(self):
        mssp = MultipleSourceShortestPath(self.graph, [0, 7])

        has_path_to = [
            True, True, True, False, False, True, True, True, True, False,
            False, False
        ]
        dist_to = [
            0,
            14,
            12,
            sys.maxsize,
            sys.maxsize,
            8,
            20,
            0,
            17,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
        ]
        self.check_graph(mssp, has_path_to, dist_to)

    def test_source_08(self):
        mssp = MultipleSourceShortestPath(self.graph, [0, 8])

        has_path_to = [
            True, True, True, False, False, True, True, False, True, False,
            False, False
        ]
        dist_to = [
            0,
            14,
            12,
            sys.maxsize,
            sys.maxsize,
            8,
            20,
            sys.maxsize,
            0,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
        ]
        self.check_graph(mssp, has_path_to, dist_to)

    def test_source_09(self):
        mssp = MultipleSourceShortestPath(self.graph, [0, 9])

        has_path_to = [
            True, True, True, False, False, True, True, False, False, True,
            True, True
        ]
        dist_to = [
            0,
            14,
            12,
            sys.maxsize,
            sys.maxsize,
            8,
            20,
            sys.maxsize,
            sys.maxsize,
            0,
            19,
            11,
        ]
        self.check_graph(mssp, has_path_to, dist_to)

    def test_source_010(self):
        mssp = MultipleSourceShortestPath(self.graph, [0, 10])

        has_path_to = [
            True, True, True, False, False, True, True, False, False, False,
            True, False
        ]
        dist_to = [
            0,
            14,
            12,
            sys.maxsize,
            sys.maxsize,
            8,
            20,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
            0,
            sys.maxsize,
        ]
        self.check_graph(mssp, has_path_to, dist_to)

    def test_source_011(self):
        mssp = MultipleSourceShortestPath(self.graph, [0, 11])

        has_path_to = [
            True, True, True, False, False, True, True, False, False, False,
            False, True
        ]
        dist_to = [
            0,
            14,
            12,
            sys.maxsize,
            sys.maxsize,
            8,
            20,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
            sys.maxsize,
            0,
        ]
        self.check_graph(mssp, has_path_to, dist_to)


if __name__ == '__main__':
    unittest.main()
