import random

from python.src.graph.directed_graph import DirectedGraph
from python.src.graph.graph import Graph


class Utilities:

    @staticmethod
    def generate_random_array(size):
        array = []

        for i in range(size):
            array.append(random.randrange(size**2))

        return array

    @staticmethod
    def is_sorted(input, low, high):
        for i in range(low + 1, high):
            if input[i - 1] > input[i]:
                return False

        return True

    @staticmethod
    def add_small_graph_edges(graph):
        graph.add_edge(0, 6, 20)
        graph.add_edge(0, 2, 12)
        graph.add_edge(0, 1, 14)
        graph.add_edge(0, 5, 8)
        graph.add_edge(3, 5, 2)
        graph.add_edge(3, 4, 4)
        graph.add_edge(4, 5, 7)
        graph.add_edge(4, 6, 13)
        graph.add_edge(7, 8, 17)
        graph.add_edge(9, 10, 19)
        graph.add_edge(9, 11, 11)

    @staticmethod
    def small_graph():
        graph = Graph(12)
        Utilities.add_small_graph_edges(graph)
        return graph

    @staticmethod
    def small_directed_graph():
        graph = DirectedGraph(12)
        Utilities.add_small_graph_edges(graph)
        return graph

    @staticmethod
    def small_cyclic_graph():
        graph = DirectedGraph(13)

        graph.add_edge(4, 2, 23)
        graph.add_edge(2, 3, 43)
        graph.add_edge(3, 2, 22)
        graph.add_edge(6, 0, 46)
        graph.add_edge(0, 1, 36)
        graph.add_edge(2, 0, 20)
        graph.add_edge(11, 12, 40)
        graph.add_edge(12, 9, 1)
        graph.add_edge(9, 10, 41)
        graph.add_edge(9, 11, 30)
        graph.add_edge(7, 9, 8)
        graph.add_edge(10, 12, 21)
        graph.add_edge(11, 4, 19)
        graph.add_edge(4, 3, 4)
        graph.add_edge(3, 5, 14)
        graph.add_edge(6, 8, 17)
        graph.add_edge(8, 6, 3)
        graph.add_edge(5, 4, 47)
        graph.add_edge(0, 5, 12)
        graph.add_edge(6, 4, 32)
        graph.add_edge(6, 9, 15)
        graph.add_edge(7, 6, 2)

        return graph

    @staticmethod
    def small_acyclic_graph():
        graph = DirectedGraph(13)

        graph.add_edge(2, 3, 39)
        graph.add_edge(0, 6, 30)
        graph.add_edge(0, 1, 43)
        graph.add_edge(2, 0, 7)
        graph.add_edge(11, 12, 25)
        graph.add_edge(9, 12, 28)
        graph.add_edge(9, 10, 18)
        graph.add_edge(9, 11, 46)
        graph.add_edge(3, 5, 12)
        graph.add_edge(8, 7, 31)
        graph.add_edge(5, 4, 38)
        graph.add_edge(0, 5, 29)
        graph.add_edge(6, 4, 11)
        graph.add_edge(6, 9, 37)
        graph.add_edge(7, 6, 5)

        return graph

    @staticmethod
    def small_component_graph():
        graph = DirectedGraph(13)

        graph.add_edge(4, 2, 9)
        graph.add_edge(2, 3, 42)
        graph.add_edge(3, 2, 41)
        graph.add_edge(6, 0, 35)
        graph.add_edge(0, 1, 6)
        graph.add_edge(2, 0, 24)
        graph.add_edge(11, 12, 14)
        graph.add_edge(12, 9, 20)
        graph.add_edge(9, 10, 14)
        graph.add_edge(9, 11, 20)
        graph.add_edge(7, 9, 43)
        graph.add_edge(10, 12, 31)
        graph.add_edge(11, 4, 5)
        graph.add_edge(4, 3, 27)
        graph.add_edge(3, 5, 4)
        graph.add_edge(6, 8, 36)
        graph.add_edge(8, 6, 19)
        graph.add_edge(5, 4, 37)
        graph.add_edge(0, 5, 3)
        graph.add_edge(6, 4, 40)
        graph.add_edge(6, 9, 17)
        graph.add_edge(7, 6, 11)

        return graph

    @staticmethod
    def add_large_graph_edges(graph):
        graph.add_edge(0, 1, 149)
        graph.add_edge(0, 2, 186)
        graph.add_edge(0, 6, 116)
        graph.add_edge(0, 9, 11)
        graph.add_edge(1, 4, 110)
        graph.add_edge(1, 5, 124)
        graph.add_edge(1, 6, 1)
        graph.add_edge(2, 9, 115)
        graph.add_edge(2, 3, 165)
        graph.add_edge(2, 12, 153)
        graph.add_edge(2, 10, 130)
        graph.add_edge(3, 9, 148)
        graph.add_edge(3, 12, 150)
        graph.add_edge(3, 14, 114)
        graph.add_edge(3, 21, 40)
        graph.add_edge(3, 8, 5)
        graph.add_edge(4, 5, 26)
        graph.add_edge(4, 7, 13)
        graph.add_edge(4, 16, 79)
        graph.add_edge(5, 6, 183)
        graph.add_edge(5, 8, 163)
        graph.add_edge(5, 7, 55)
        graph.add_edge(6, 8, 173)
        graph.add_edge(6, 9, 21)
        graph.add_edge(10, 12, 181)
        graph.add_edge(10, 13, 19)
        graph.add_edge(11, 47, 132)
        graph.add_edge(11, 43, 48)
        graph.add_edge(11, 45, 44)
        graph.add_edge(11, 48, 185)
        graph.add_edge(12, 14, 164)
        graph.add_edge(12, 15, 89)
        graph.add_edge(13, 15, 80)
        graph.add_edge(13, 20, 86)
        graph.add_edge(14, 15, 112)
        graph.add_edge(14, 20, 109)
        graph.add_edge(14, 19, 143)
        graph.add_edge(14, 21, 178)
        graph.add_edge(15, 20, 168)
        graph.add_edge(16, 17, 93)
        graph.add_edge(16, 22, 158)
        graph.add_edge(16, 27, 65)
        graph.add_edge(17, 32, 166)
        graph.add_edge(17, 23, 17)
        graph.add_edge(17, 28, 53)
        graph.add_edge(17, 22, 193)
        graph.add_edge(18, 32, 45)
        graph.add_edge(18, 21, 146)
        graph.add_edge(18, 24, 123)
        graph.add_edge(18, 29, 189)
        graph.add_edge(18, 23, 49)
        graph.add_edge(19, 20, 41)
        graph.add_edge(19, 26, 180)
        graph.add_edge(19, 25, 22)
        graph.add_edge(19, 24, 37)
        graph.add_edge(19, 21, 25)
        graph.add_edge(20, 26, 141)
        graph.add_edge(21, 24, 179)
        graph.add_edge(21, 32, 81)
        graph.add_edge(22, 28, 128)
        graph.add_edge(22, 27, 199)
        graph.add_edge(23, 32, 127)
        graph.add_edge(23, 29, 38)
        graph.add_edge(23, 28, 144)
        graph.add_edge(24, 25, 30)
        graph.add_edge(24, 29, 71)
        graph.add_edge(25, 26, 33)
        graph.add_edge(25, 31, 133)
        graph.add_edge(25, 37, 108)
        graph.add_edge(25, 30, 151)
        graph.add_edge(26, 31, 175)
        graph.add_edge(26, 38, 36)
        graph.add_edge(27, 28, 32)
        graph.add_edge(27, 34, 87)
        graph.add_edge(27, 42, 46)
        graph.add_edge(28, 29, 152)
        graph.add_edge(28, 34, 70)
        graph.add_edge(28, 35, 125)
        graph.add_edge(29, 30, 124)
        graph.add_edge(29, 36, 182)
        graph.add_edge(29, 35, 101)
        graph.add_edge(30, 37, 140)
        graph.add_edge(30, 36, 84)
        graph.add_edge(31, 38, 3)
        graph.add_edge(31, 37, 27)
        graph.add_edge(33, 37, 134)
        graph.add_edge(33, 38, 120)
        graph.add_edge(33, 49, 42)
        graph.add_edge(33, 46, 188)
        graph.add_edge(33, 39, 92)
        graph.add_edge(34, 35, 20)
        graph.add_edge(34, 41, 113)
        graph.add_edge(34, 43, 129)
        graph.add_edge(34, 42, 62)
        graph.add_edge(35, 36, 190)
        graph.add_edge(35, 40, 57)
        graph.add_edge(35, 41, 138)
        graph.add_edge(36, 37, 16)
        graph.add_edge(36, 39, 4)
        graph.add_edge(36, 40, 192)
        graph.add_edge(37, 38, 10)
        graph.add_edge(37, 39, 12)
        graph.add_edge(38, 49, 184)
        graph.add_edge(39, 46, 102)
        graph.add_edge(39, 40, 14)
        graph.add_edge(40, 46, 169)
        graph.add_edge(40, 45, 50)
        graph.add_edge(40, 41, 18)
        graph.add_edge(41, 45, 159)
        graph.add_edge(41, 43, 43)
        graph.add_edge(42, 43, 82)
        graph.add_edge(42, 44, 161)
        graph.add_edge(42, 47, 98)
        graph.add_edge(43, 45, 91)
        graph.add_edge(43, 47, 24)
        graph.add_edge(44, 47, 8)
        graph.add_edge(45, 46, 64)
        graph.add_edge(45, 48, 198)
        graph.add_edge(46, 49, 68)
        graph.add_edge(46, 48, 58)
        graph.add_edge(48, 49, 61)

    @staticmethod
    def large_graph():
        graph = Graph(50)
        Utilities.add_large_graph_edges(graph)
        return graph

    @staticmethod
    def large_directed_graph():
        graph = DirectedGraph(50)
        Utilities.add_large_graph_edges(graph)
        return graph

    @staticmethod
    def vertex_inverse(graph, vertices):
        inverse = [0] * (graph.num_vertices() - len(vertices))
        used = 0

        for i in range(graph.num_vertices()):
            if i in vertices:
                continue

            inverse[used] = i
            used += 1

        return inverse
