class MinHeap:

    def __init__(self):
        self.initial_size = 10
        self.num_elements = 0
        self.array = [None] * self.initial_size

    def size(self):
        return self.num_elements

    def capacity(self):
        return len(self.array)

    def is_empty(self):
        return self.size() == 0

    def parent(self, index):
        return int(index / 2)

    def left(self, index):
        return 2 * index

    def right(self, index):
        return 2 * index + 1

    def swap(self, i, j):
        temp = self.array[i]
        self.array[i] = self.array[j]
        self.array[j] = temp

    def resize(self, capacity):
        temp = [None] * capacity
        for i in range(self.size() + 1):
            temp[i] = self.array[i]

        self.array = temp

    def min(self):
        if self.is_empty():
            raise Exception("Priority queue underflow")

        return self.array[1]

    def insert(self, value):
        if self.size() >= len(self.array) - 1:
            self.resize(2 * len(self.array))

        self.num_elements += 1
        self.array[self.size()] = value
        self.swim(self.size())

    def is_min_heap_ordered(self, k):
        if k > self.size():
            return True

        left = self.left(k)
        right = self.right(k)

        if left <= self.size() and self.array[left] < self.array[k]:
            return False

        if right <= self.size() and self.array[right] < self.array[k]:
            return False

        return self.is_min_heap_ordered(left) and self.is_min_heap_ordered(
            right)

    def is_min_heap(self):
        for i in range(1, self.size() + 1):
            if self.array[i] is None:
                return False

        for i in range(self.size() + 1, len(self.array)):
            if self.array[i] is not None:
                return False

        if self.array[0] is not None:
            return False

        return self.is_min_heap_ordered(1)

    class MinHeapIterator:

        def __init__(self, array):
            self.index = 1
            self.array = array

        def __iter__(self):
            return self

        def __next__(self):
            if self.index >= len(self.array):
                raise StopIteration

            if self.array[self.index] is None:
                raise StopIteration

            self.index += 1
            return self.array[self.index - 1]

    def __iter__(self):
        return self.MinHeapIterator(self.array)

    def remove_minimum(self):
        # TODO: complete this function
        return None

    def sink(self, index):
        # TODO: complete this function
        pass

    def swim(self, index):
        # TODO: complete this function
        pass
