import sys

from python.src.util.queue import Queue
from python.src.util.stack import Stack


class BreadthFirstSearch:

    def __init__(self, graph, source):
        self.graph = graph
        self.source_ = source

        self.marked = [False] * graph.num_vertices()
        self.dist_to = [0] * graph.num_vertices()
        self.edge_to = [0] * graph.num_vertices()

        self.graph.validate_vertex(source)
        self.bfs(source)

    def source(self):
        return self.source_

    def has_path_to(self, v):
        self.graph.validate_vertex(v)
        return self.marked[v]

    def distance_to(self, v):
        self.graph.validate_vertex(v)
        return self.dist_to[v]

    def path_to(self, v):
        self.graph.validate_vertex(v)

        if not self.has_path_to(v):
            return None

        path = Stack()
        i = v
        while self.dist_to[i] != 0:
            path.push(i)
            i = self.edge_to[i]

        path.push(i)
        return path

    def bfs(self, s):
        # TODO: complete this function
        pass
