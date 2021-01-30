package(default_visibility = ["//visibility:public"])

java_library(
    name = "breadthfirstsearch",
    srcs = ["BreadthFirstSearch.java"],
    deps = [
        ":graph",
        "//java/src/edu/berkeley/cs/util:queue",
        "//java/src/edu/berkeley/cs/util:stack",
    ],
)

java_library(
    name = "cycle",
    srcs = ["Cycle.java"],
    deps = [
        ":graph",
        "//java/src/edu/berkeley/cs/util:stack",
    ],
)

java_library(
    name = "depthfirstorder",
    srcs = ["DepthFirstOrder.java"],
    deps = [
        ":graph",
        "//java/src/edu/berkeley/cs/util:queue",
        "//java/src/edu/berkeley/cs/util:stack",
    ],
)

java_library(
    name = "depthfirstsearch",
    srcs = ["DepthFirstSearch.java"],
    deps = [
        ":graph",
        "//java/src/edu/berkeley/cs/util:queue",
        "//java/src/edu/berkeley/cs/util:stack",
    ],
)

java_library(
    name = "directedgraph",
    srcs = ["DirectedGraph.java"],
    deps = [
        ":edge",
        ":graph",
    ],
)

java_library(
    name = "edge",
    srcs = ["Edge.java"],
)

java_library(
    name = "graph",
    srcs = ["Graph.java"],
    deps = [
        ":edge",
        "//java/src/edu/berkeley/cs/util:linkedlist",
    ],
)

java_library(
    name = "minimumspanningtree",
    srcs = ["MinimumSpanningTree.java"],
    deps = [
        ":edge",
        ":graph",
        "//java/src/edu/berkeley/cs/util:minheap",
        "//java/src/edu/berkeley/cs/util:queue",
        "//java/src/edu/berkeley/cs/util:unionfind",
    ],
)

java_library(
    name = "multiplesourceshortestpath",
    srcs = ["MultipleSourceShortestPath.java"],
    deps = [
        ":directedgraph",
        ":edge",
        ":shortestpath",
        "//java/src/edu/berkeley/cs/util:minheap",
        "//java/src/edu/berkeley/cs/util:queue",
    ],
)

java_library(
    name = "shortestpath",
    srcs = ["ShortestPath.java"],
    deps = [
        ":edge",
        ":graph",
        "//java/src/edu/berkeley/cs/util:minheap",
        "//java/src/edu/berkeley/cs/util:stack",
    ],
)

java_library(
    name = "stronglyconnectedcomponents",
    srcs = ["StronglyConnectedComponents.java"],
    deps = [
        ":depthfirstorder",
        ":directedgraph",
    ],
)

java_library(
    name = "topologicalsort",
    srcs = ["TopologicalSort.java"],
    deps = [
        ":cycle",
        ":depthfirstorder",
        ":directedgraph",
    ],
)
