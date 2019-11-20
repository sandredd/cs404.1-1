import unittest

from python.src.graph.strongly_connected_components import StronglyConnectedComponents
from python.test.util.utilities import Utilities


class StronglyConnectedComponentsTest(unittest.TestCase):
    def setUp(self):
        self.graph = Utilities.small_component_graph()
        self.scc = StronglyConnectedComponents(self.graph)

    def test_num_components(self):
        self.assertEqual(5, self.scc.num_components())

    def test_connected_ids(self):
        ids = [1, 0, 1, 1, 1, 1, 3, 4, 3, 2, 2, 2, 2]
        for i in range(self.graph.num_vertices()):
            self.assertEqual(ids[i], self.scc.component_id(i))

    def check_strong_component(self, v, component):
        for i in range(len(component)):
            self.assertTrue(self.scc.strongly_connected(v, component[i]))

    def test_strongly_connected(self):
        scc0 = [0, 2, 3, 4, 5]
        scc1 = [1]
        scc2 = scc0
        scc3 = scc0
        scc4 = scc0
        scc5 = scc0
        scc6 = [6, 8]
        scc7 = [7]
        scc8 = scc6
        scc9 = [9, 10, 11, 12]
        scc10 = scc9
        scc11 = scc9
        scc12 = scc9

        self.check_strong_component(0, scc0)
        self.check_strong_component(1, scc1)
        self.check_strong_component(2, scc2)
        self.check_strong_component(3, scc3)
        self.check_strong_component(4, scc4)
        self.check_strong_component(5, scc5)
        self.check_strong_component(6, scc6)
        self.check_strong_component(7, scc7)
        self.check_strong_component(8, scc8)
        self.check_strong_component(9, scc9)
        self.check_strong_component(10, scc10)
        self.check_strong_component(11, scc11)
        self.check_strong_component(12, scc12)

if __name__ == '__main__':
    unittest.main()
