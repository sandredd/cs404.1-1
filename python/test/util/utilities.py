import random

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
    def small_graph():
        graph = Graph(12)

        graph.add_edge(0, 6)
        graph.add_edge(0, 2)
        graph.add_edge(0, 1)
        graph.add_edge(0, 5)
        graph.add_edge(3, 5)
        graph.add_edge(3, 4)
        graph.add_edge(4, 5)
        graph.add_edge(4, 6)
        graph.add_edge(7, 8)
        graph.add_edge(9, 10)
        graph.add_edge(9, 11)

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
