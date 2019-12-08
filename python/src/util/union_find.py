class UnionFind:

    def __init__(self, n):
        self.count = n
        self.parent = [0] * n
        self.size = [0] * n

        for i in range(n):
            self.parent[i] = i
            self.size[i] = i

    def get_count(self):
        return self.count

    def find(self, p):
        self.validate(p)
        while p != self.parent[p]:
            p = self.parent[p]

        return p

    def connected(self, p, q):
        return self.find(p) == self.find(q)

    def validate(self, p):
        n = len(self.parent)
        if p < 0 or p >= n:
            raise Exception("index %d is not between 0 and %d" % (p, n - 1))

    def union(self, p, q):
        root_p = self.find(p)
        root_q = self.find(q)

        if root_p == root_q:
            return

        if self.size[root_p] < self.size[root_q]:
            self.parent[root_p] = root_q
            self.size[root_q] += self.size[root_p]
        else:
            self.parent[root_q] = root_p
            self.size[root_p] += self.size[root_q]

        self.count -= 1
