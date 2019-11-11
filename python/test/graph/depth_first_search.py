import unittest

from python.src.graph.depth_first_search import DepthFirstSearch
from python.test.util.utilities import Utilities


class DepthFirstSearchTest(unittest.TestCase):

    def setUp(self):
        self.graph = Utilities.small_graph()

    def check_path_to(self, dfs, path_to, no_path_to):
        for v in path_to:
            self.assertTrue(dfs.has_path_to(v),
                            "%d should be connected to %d" % (dfs.source(), v))

        for v in no_path_to:
            self.assertFalse(
                dfs.has_path_to(v),
                "%d should not be connected to %d" % (dfs.source(), v))

    def test_source(self):
        for i in range(self.graph.num_vertices()):
            dfs = DepthFirstSearch(self.graph, i)
            self.assertEqual(i, dfs.source)

    def test_source_0_1_2_3_4_5_6(self):
        for i in range(7):
            dfs = DepthFirstSearch(self.graph, i)
            self.assertEqual(7, dfs.connected_vertices())

            vertices = [0, 1, 2, 3, 4, 5, 6]
            self.check_path_to(dfs, vertices,
                               Utilities.vertex_inverse(self.graph, vertices))

    def test_source_7_8(self):
        for i in range(7, 9):
            dfs = DepthFirstSearch(self.graph, i)
            self.assertEqual(7, dfs.connected_vertices())

            vertices = [7, 8]
            self.check_path_to(dfs, vertices,
                               Utilities.vertex_inverse(self.graph, vertices))

    def test_source_9_10_11(self):
        for i in range(9, 12):
            dfs = DepthFirstSearch(self.graph, i)
            self.assertEqual(7, dfs.connected_vertices())

            vertices = [9, 10, 11]
            self.check_path_to(dfs, vertices,
                               Utilities.vertex_inverse(self.graph, vertices))
