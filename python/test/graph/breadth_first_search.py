import unittest

from python.src.graph.breadth_first_search import BreadthFirstSearch
from python.test.util.utilities import Utilities


class BreadthFirstSearchTest(unittest.TestCase):

    def setUp(self):
        self.graph = Utilities.small_graph()

    def check_path_to(self, bfs, path_to, no_path_to):
        for v in path_to:
            self.assertTrue(bfs.has_path_to(v),
                            "%d should be connected to %d" % (bfs.source(), v))

        for v in no_path_to:
            self.assertFalse(
                bfs.has_path_to(v),
                "%d should not be connected to %d" % (bfs.source(), v))

    def check_dist_to(self, bfs, vertices, dist_to):
        for i in range(len(vertices)):
            self.assertEqual(
                dist_to[i], bfs.distance_to(vertices[i]),
                "%d is %d hops away from %d, should be %d" %
                (bfs.source(), bfs.distance_to(
                    vertices[i]), vertices[i], dist_to[i]))

    def test_source(self):
        for i in range(self.graph.num_vertices()):
            bfs = BreadthFirstSearch(self.graph, i)
            self.assertEqual(i, bfs.source())

    def test_source0(self):
        bfs = BreadthFirstSearch(self.graph, 0)

        vertices = [0, 1, 2, 3, 4, 5, 6]
        self.check_path_to(bfs, vertices, Utilities.vertex_inverse(self.graph, vertices))
        self.check_dist_to(bfs, vertices, [0, 1, 1, 2, 2, 1, 1])

    def test_source1(self):
        bfs = BreadthFirstSearch(self.graph, 1)

        vertices = [0, 1, 2, 3, 4, 5, 6]
        self.check_path_to(bfs, vertices, Utilities.vertex_inverse(self.graph, vertices))
        self.check_dist_to(bfs, vertices, [1, 0, 2, 3, 3, 2, 2])

    def test_source2(self):
        bfs = BreadthFirstSearch(self.graph, 2)

        vertices = [0, 1, 2, 3, 4, 5, 6]
        self.check_path_to(bfs, vertices, Utilities.vertex_inverse(self.graph, vertices))
        self.check_dist_to(bfs, vertices, [1, 2, 0, 3, 3, 2, 2])

    def test_source3(self):
        bfs = BreadthFirstSearch(self.graph, 3)

        vertices = [0, 1, 2, 3, 4, 5, 6]
        self.check_path_to(bfs, vertices, Utilities.vertex_inverse(self.graph, vertices))
        self.check_dist_to(bfs, vertices, [2, 3, 3, 0, 1, 1, 2])

    def test_source4(self):
        bfs = BreadthFirstSearch(self.graph, 4)

        vertices = [0, 1, 2, 3, 4, 5, 6]
        self.check_path_to(bfs, vertices, Utilities.vertex_inverse(self.graph, vertices))
        self.check_dist_to(bfs, vertices, [2, 3, 3, 1, 0, 1, 1])

    def test_source5(self):
        bfs = BreadthFirstSearch(self.graph, 5)

        vertices = [0, 1, 2, 3, 4, 5, 6]
        self.check_path_to(bfs, vertices, Utilities.vertex_inverse(self.graph, vertices))
        self.check_dist_to(bfs, vertices, [1, 2, 2, 1, 1, 0, 2])

    def test_source6(self):
        bfs = BreadthFirstSearch(self.graph, 6)

        vertices = [0, 1, 2, 3, 4, 5, 6]
        self.check_path_to(bfs, vertices, Utilities.vertex_inverse(self.graph, vertices))
        self.check_dist_to(bfs, vertices, [1, 2, 2, 2, 1, 2, 0])

    def test_source7(self):
        bfs = BreadthFirstSearch(self.graph, 7)

        vertices = [7, 8]
        self.check_path_to(bfs, vertices, Utilities.vertex_inverse(self.graph, vertices))
        self.check_dist_to(bfs, vertices, [0, 1])

    def test_source8(self):
        bfs = BreadthFirstSearch(self.graph, 8)

        vertices = [7, 8]
        self.check_path_to(bfs, vertices, Utilities.vertex_inverse(self.graph, vertices))
        self.check_dist_to(bfs, vertices, [1, 0])

    def test_source9(self):
        bfs = BreadthFirstSearch(self.graph, 9)

        vertices = [9, 10, 11]
        self.check_path_to(bfs, vertices, Utilities.vertex_inverse(self.graph, vertices))
        self.check_dist_to(bfs, vertices, [0, 1, 1])

    def test_source10(self):
        bfs = BreadthFirstSearch(self.graph, 10)

        vertices = [9, 10, 11]
        self.check_path_to(bfs, vertices, Utilities.vertex_inverse(self.graph, vertices))
        self.check_dist_to(bfs, vertices, [1, 0, 2])

    def test_source11(self):
        bfs = BreadthFirstSearch(self.graph, 11)

        vertices = [9, 10, 11]
        self.check_path_to(bfs, vertices, Utilities.vertex_inverse(self.graph, vertices))
        self.check_dist_to(bfs, vertices, [1, 2, 0])


if __name__ == '__main__':
    unittest.main()
