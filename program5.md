Program 5
---------
In this assignment, you will implement more searching algorithms as well as work on some graph
algorithms.

Before beginning on this assignment, make sure to read the `Graph` class:

- `java/src/edu/berkeley/cs/graph/Graph.java`

Depth First Search (DFS)
------------------------
Implement depth first search. You must implement the following methods:

- `dfs(...)`

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/graph/DepthFirstSearch.java`

Breadth First Search (BFS)
--------------------------
Implement breadth first search. You must implement the following methods:

- `bfs(...)`

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/graph/BreadthFirstSearch.java`

Depth First Order
-----------------
Now that you have practiced writing depth first search, use DFS to implement functionality to
determine the various orderings (e.g. preorder, postorder, reverse postorder) in a graph. For
consistency, iterate through all nodes in the graph starting from node 0 as the source node.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/graph/DepthFirstOrder.java`

Union Find
----------
The [Union Find](https://en.wikipedia.org/wiki/Disjoint-set_data_structure) algorithm is a data
structure and algorithm that allows us to efficiently partition a set of elements and quickly
determine whether two elements are a part of the same partition. For future exercises, we will need
the functionality provided by Union Find. Implement one of the variations of union find (either
quick union or weighted quick union) as we discussed in lecture.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/util/UnionFind.java`

Grading
-------
Tests have already been written to help you ensure that your code works. The following commands will
be used to test and grade your code:

    $ bazel test java:program5
