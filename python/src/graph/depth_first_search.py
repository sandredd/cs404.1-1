class DepthFirstSearch:

    def __init__(self, graph, source_vertex):
        self.graph = graph
        self.source_vertex = source_vertex
        self.marked = [False] * graph.num_vertices()
        self.num_connected_vertices = 0

        graph.validate_vertex(source_vertex)
        self.dfs(source_vertex)

    def has_path_to(self, v):
        self.graph.validate_vertex(v)
        return self.marked[v]

    def source(self):
        return self.source_vertex

    def connected_vertices(self):
        return self.num_connected_vertices

    def dfs(self, v):
        # TODO: complete this function
        pass
