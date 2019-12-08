import sys

from python.src.util.stack import Stack


class ShortestPath:

    def __init__(self, graph, s):
        self.edge_to = [None] * graph.num_vertices()
        self.dist_to = [0.0] * graph.num_vertices()

        # TODO: complete this function

    def distance_to(self, v):
        return self.dist_to[v]

    def has_path_to(self, v):
        return self.dist_to[v] < sys.maxsize

    def get_path_to(self, v):
        if not self.has_path_to(v):
            return None

        stack = Stack()
        edge = self.edge_to[v]
        while edge is not None:
            stack.push(edge)
            edge = self.edge_to[edge.dest()]

        return stack
