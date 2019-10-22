from python.src.util.linkedlist import LinkedList


class Graph:

    def __init__(self, vertices):
        self.vertices = vertices
        self.edges = 0
        self.adjacency_list = [LinkedList()] * vertices

        for i in range(len(self.adjacency_list)):
            self.adjacency_list[i] = LinkedList()

    def num_edges(self):
        return self.edges

    def num_vertices(self):
        return self.vertices

    def validate_vertex(self, v):
        if v < 0 or v >= self.vertices:
            raise Exception("vertex %d is not between 0 and %d" %
                            (v, self.vertices - 1))

    def add_edge(self, v, w):
        self.validate_vertex(v)
        self.validate_vertex(w)

        self.edges += 1
        self.adjacency_list[v].insert_end(w)
        self.adjacency_list[w].insert_end(v)

    def adjacent_vertices(self, v):
        self.validate_vertex(v)
        return self.adjacency_list[v]

    def degree(self, v):
        self.validate_vertex(v)
        return self.adjacency_list[v].size()
