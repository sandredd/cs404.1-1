from python.src.util.map import Map
from python.src.util.queue import Queue


class TreeMap(Map):

    class Node:

        def __init__(self, key, value):
            self.key = key
            self.value = value
            self.left = None
            self.right = None

    def __init__(self):
        self.root = None
        self.num_elements = 0

    def clear(self):
        self.root = None
        self.num_elements = 0

    def is_empty(self):
        return self.size() == 0

    def size(self):
        return self.num_elements

    def contains(self, key):
        if key is None:
            raise Exception("argument to contains() is None")

        return self.get(key) is not None

    def get(self, key):
        return self.__get(self.root, key)

    def __get(self, node, key):
        # TODO: complete this function
        return None

    def put(self, key, value):
        if key is None:
            raise Exception("calls put() with a None key")

        if value is None:
            self.delete(key)
            return

        self.root = self.__put(self.root, key, value)
        self.num_elements += 1

    def __put(self, node, key, value):
        # TODO: complete this function
        return None

    def delete_min(self):
        if self.is_empty():
            raise Exception("Symbol table underflow")

        self.root = self.__delete_min(self.root)
        self.num_elements -= 1

    def __delete_min(self, node):
        # TODO: complete this function
        return None

    def delete_max(self):
        if self.is_empty():
            raise Exception("Symbol table underflow")

        self.root = self.__delete_max(self.root)
        self.num_elements -= 1

    def __delete_max(self, node):
        # TODO: complete this function
        return None

    def delete(self, key):
        if key is None:
            raise Exception("calls delete() with a None key")

        self.root = self.__delete(self.root, key)
        self.num_elements -= 1

    def __delete(self, node, key):
        if node is None:
            return None

        if key < node.key:
            node.left = self.__delete(node.left, key)
        elif key > node.key:
            node.right = self.__delete(node.right, key)
        else:
            if node.right is None:
                return node.left

            if node.left is None:
                return node.right

            t = node
            node = self.__min(t.right)
            node.right = self.__delete_min(t.right)
            node.left = t.left

        return node

    def min(self):
        if self.is_empty():
            raise Exception("calls min() with empty symbol table")

        return self.__min(self.root).key

    def __min(self, node):
        # TODO: complete this function
        return None

    def max(self):
        if self.is_empty():
            raise Exception("calls max() with empty symbol table")

        return self.__max(self.root).key

    def __max(self, node):
        # TODO: complete this function
        return None

    def is_bst(self):
        return self.__is_bst(self.root, None, None)

    def __is_bst(self, node, minimum, maximum):
        if node is None:
            return True

        if minimum is not None and node.key <= minimum:
            return False

        if maximum is not None and node.key >= maximum:
            return False

        return self.__is_bst(node.left, minimum, node.key) and self.__is_bst(
            node.right, node.key, maximum)

    class TreeMapIterator:

        def __init__(self, root):
            keys = Queue()
            queue = Queue()
            queue.enqueue(root)

            while not queue.is_empty():
                node = queue.dequeue()
                if node is None:
                    continue

                queue.enqueue(node.left)
                keys.enqueue(node.key)
                queue.enqueue(node.right)

            self.iterator = iter(keys)

        def __iter__(self):
            return self.iterator

        def __next__(self):
            return next(self.iterator)

    def __iter__(self):
        return self.TreeMapIterator(self.root)
