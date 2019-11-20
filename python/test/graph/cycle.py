import unittest

from python.src.graph.cycle import Cycle
from python.test.util.utilities import Utilities


class DirectedGraphTest(unittest.TestCase):
    def test_has_cycle(self):
        graph = Utilities.small_cyclic_graph()
        finder = Cycle(graph)
        self.assertTrue(finder.has_cycle())

    def test_has_no_cycle(self):
        graph = Utilities.small_acyclic_graph()
        finder = Cycle(graph)
        self.assertFalse(finder.has_cycle())

    def test_cycle_path(self):
        graph = Utilities.small_cyclic_graph()
        finder = Cycle(graph)

        cycle = [3, 2, 3]
        i = 0
        for v in finder.cycle():
            self.assertEqual(cycle[i], v)
            i += 1


if __name__ == '__main__':
    unittest.main()
