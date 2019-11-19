class Edge:
    def __init__(self, source, dest, weight=0):
        if source < 0 or dest < 0:
            raise Exception("Vertex names must be nonnegative integers")

        self.source_ = source
        self.dest_ = dest
        self.weight_ = weight

    def __eq__(self, other):
        if self.source() != other.source():
            return False

        if self.dest() != other.dest():
            return False

        if self.weight() != other.weight():
            return False

        return True

    def source(self):
        return self.source_

    def dest(self):
        return self.dest_

    def weight(self):
        return self.weight_

    def reverse(self):
        return Edge(self.dest_, self.source_, self.weight_)
