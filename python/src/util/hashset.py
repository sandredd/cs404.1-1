from python.src.util.hashmap import HashMap
from python.src.util.set import Set


class HashSet(Set):

    def __init__(self):
        self.map = HashMap()

    def add(self, key):
        self.map.put(key, True)

    def contains(self, key):
        return self.map.contains(key)

    def remove(self, key):
        self.map.delete(key)

    def clear(self):
        self.map.clear()

    def is_empty(self):
        return self.map.is_empty()

    def size(self):
        return self.map.size()

    def __iter__(self):
        return iter(self.map.keys())
