Program 5
---------
In this program, you will be implementing and experimenting with various directed graph algorithms.

Before beginning on this assignment, make sure to read the `DirectedGraph` class:

- `java/src/edu/berkeley/cs/graph/DirectedGraph.java`

Task Execution Order
--------------------
One of the core features of build systems (e.g. bazel) is to build all dependencies of a component
before building that component within the project. A software build system is just one example where
such functionality might be necessary. For example, in program 4, we assumed that no job has a
dependency on another, allowing jobs to run in any order. In reality, such a situation would be
unlikely. There are many more such examples.

In more general terms, given a dependency graph, we need to compute the execution order such that
for a given component, all dependencies are built first. One of the most popular methods to do this
is using topological sort. Implement topological sort. Remember that only directed, acyclic graphs
(DAGs) have a topological order. Before implementing topological sort, it may be useful to first
implement functionality to determine whether a graph has a cycle or not (`Cycle`). You implemented
functionality to determine the various orderings in a graph in a previous assignment.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/graph/Cycle.java`
- `java/src/edu/berkeley/cs/graph/TopologicalSort.java`

Strongly Connected Components
-----------------------------
The algorithm to determine the connected components in an undirected graph is fairly simple: visit
each vertex in the graph and execute depth first search on it, assigning each newly discovered
vertex the id of the current component being discovered. However, this algorithm doesn't work when
we are trying to determine the strongly connected components in a directed graph. Remember, a
strongly connected component in a directed graph is a subgraph where there is a path in both
directions between every two vertices.

One of the algorithms to compute strongly connected components in a directed graph is the
[Kosaraju-Sharir Algorithm](https://en.wikipedia.org/wiki/Kosaraju%27s_algorithm) that we studied in
class. Implement the algorithm.

Note that the first step of the Kosaraju-Sharir algorithm is to determine the reverse post order of
the graph's reverse. To obtain the reverse of the graph, you will need to fill in the `reverse(...)`
function within the `DirectedGraph` class.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/graph/DirectedGraph.java`
- `java/src/edu/berkeley/cs/graph/StronglyConnectedComponents.java`

Union Find
----------
The [Union Find](https://en.wikipedia.org/wiki/Disjoint-set_data_structure) algorithm is a data
structure and algorithm that allows us to efficiently partition a set of elements and quickly
determine whether two elements are a part of the same partition. The data structure and algorithm
are both covered in detail in section 1.5 of the textbook. Unfortunately, we did not have time to
cover it in detail in lecture.

For the next exercise, we will need the functionality provided by Union Find. An implementation of
Weighted Quick Union has been provided for you in the files mentioned below. To understand how it
works, read section 1.5 of the textbook.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/util/UnionFind.java`

Minimum Spanning Trees
----------------------
You work for a regional water utility company which has been selected to provide water from its
water treatment plants to various municipalities around the state. The locations and distances
between adjacent municipalities and the water treatment plants are shown in the figure below. The
edges show the costs to dig and build out pipeline between the vertices within the graph.

![graph](resources/images/graph.png)

In order to save costs, your company wants to avoid building exclusive pipeline from water treatment
plants to each municipality individually. This means that some municipalities may be connected
directly to the water treatment plant and some municipalities may receive water through another
municipality.

Your company has tasked you to come up with the map of pipeline to build out. In order to minimize
the cost for the company, you decide to use a minimum spanning tree algorithm to connect every
municipality through the set of edges with minimum cost. Implement either Prim's or Kruskal's
algorithm for minimum spanning trees to determine the map of pipeline to build.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/graph/MinimumSpanningTree.java`

Grading
-------
Tests have already been written to help you ensure that your code works. The following commands will
be used to test and grade your code:

    $ bazel test java/test/edu/berkeley/cs/graph:{digraph,cycle,toposort,scc,mst}
    $ bazel test java/test/edu/berkeley/cs/util:unionfind
