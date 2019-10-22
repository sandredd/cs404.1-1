from python.src.util.map import Map
from python.src.util.splaylist import SplayList


class HashMap(Map):

    def __init__(self):
        self.table = [SplayList()] * 32
        self.num_elements = 0

        for i in range(len(self.table)):
            self.table[i] = SplayList()

    class Entry:

        def __init__(self, key, value):
            self.key = key
            self.value = value

        def __eq__(self, other):
            return self.key == other.key

    def hash(self, key):
        return abs(hash(key) % len(self.table))

    def resize(self, capacity):
        old_table = self.table
        self.table = [SplayList()] * capacity

        for i in range(len(self.table)):
            self.table[i] = SplayList()

        for entries in old_table:
            for entry in entries:
                index = self.hash(entry.key)
                self.table[index].insert_end(entry)

    def clear(self):
        self.num_elements = 0
        self.table = [SplayList()] * len(self.table)

        for i in range(len(self.table)):
            self.table[i] = SplayList()

    def is_empty(self):
        return self.size() == 0

    def size(self):
        return self.num_elements

    class HashMapIterator:

        def __init__(self, table):
            self.index = 0
            self.table = table
            self.current = iter(self.table[self.index])

        def __iter__(self):
            return self

        def __next__(self):
            if self.index >= len(self.table):
                raise StopIteration

            entry = next(self.current, None)
            if entry is not None:
                return entry

            while True:
                self.index += 1
                if self.index >= len(self.table):
                    raise StopIteration

                self.current = iter(self.table[self.index])
                entry = next(self.current, None)
                if entry is not None:
                    return entry

    def __iter__(self):
        return self.HashMapIterator(self.table)

    def keys(self):
        elements = SplayList()

        for element in iter(self):
            elements.insert_end(element.key)

        return elements

    def get(self, key):
        # TODO: complete this function
        return None

    def put(self, key, value):
        # TODO: complete this function
        pass

    def contains(self, key):
        # TODO: complete this function
        return False

    def delete(self, key):
        # TODO: complete this function
        pass
