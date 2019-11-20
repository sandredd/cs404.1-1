from python.src.graph.graph import Graph


class DirectedGraph(Graph):
    def __init__(self, vertices):
        super().__init__(vertices)

    def add_edge(self, source, dest, weight=0):
        # TODO: complete this function
        pass

    def outdegree(self, v):
        # TODO: complete this function
        return 0

    def indegree(self, v):
        # TODO: complete this function
        return 0

    def reverse(self):
        # TODO: complete this function
        return None
