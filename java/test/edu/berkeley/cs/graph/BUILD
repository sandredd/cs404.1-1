package(default_visibility = ["//visibility:public"])

java_test(
    name = "graph",
    size = "small",
    srcs = ["Graph_T.java"],
    test_class = "edu.berkeley.cs.graph.Graph_T",
    deps = [
        "//java/src/edu/berkeley/cs/graph",
        "//java/src/edu/berkeley/cs/graph:edge",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "directedgraph",
    size = "small",
    srcs = ["DirectedGraph_T.java"],
    test_class = "edu.berkeley.cs.graph.DirectedGraph_T",
    deps = [
        "//java/src/edu/berkeley/cs/graph:directedgraph",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "depthfirstsearch",
    size = "small",
    srcs = ["DepthFirstSearch_T.java"],
    test_class = "edu.berkeley.cs.graph.DepthFirstSearch_T",
    deps = [
        "//java/src/edu/berkeley/cs/graph",
        "//java/src/edu/berkeley/cs/graph:depthfirstsearch",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "breadthfirstsearch",
    size = "small",
    srcs = ["BreadthFirstSearch_T.java"],
    test_class = "edu.berkeley.cs.graph.BreadthFirstSearch_T",
    deps = [
        "//java/src/edu/berkeley/cs/graph",
        "//java/src/edu/berkeley/cs/graph:breadthfirstsearch",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "cycle",
    size = "small",
    srcs = ["Cycle_T.java"],
    test_class = "edu.berkeley.cs.graph.Cycle_T",
    deps = [
        "//java/src/edu/berkeley/cs/graph:cycle",
        "//java/src/edu/berkeley/cs/graph:directedgraph",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "depthfirstorder",
    size = "small",
    srcs = ["DepthFirstOrder_T.java"],
    test_class = "edu.berkeley.cs.graph.DepthFirstOrder_T",
    deps = [
        "//java/src/edu/berkeley/cs/graph:depthfirstorder",
        "//java/src/edu/berkeley/cs/graph:directedgraph",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "topologicalsort",
    size = "small",
    srcs = ["TopologicalSort_T.java"],
    test_class = "edu.berkeley.cs.graph.TopologicalSort_T",
    deps = [
        "//java/src/edu/berkeley/cs/graph:depthfirstorder",
        "//java/src/edu/berkeley/cs/graph:directedgraph",
        "//java/src/edu/berkeley/cs/graph:topologicalsort",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "stronglyconnectedcomponents",
    size = "small",
    srcs = ["StronglyConnectedComponents_T.java"],
    test_class = "edu.berkeley.cs.graph.StronglyConnectedComponents_T",
    deps = [
        "//java/src/edu/berkeley/cs/graph:directedgraph",
        "//java/src/edu/berkeley/cs/graph:stronglyconnectedcomponents",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "minimumspanningtree",
    size = "small",
    srcs = ["MinimumSpanningTree_T.java"],
    test_class = "edu.berkeley.cs.graph.MinimumSpanningTree_T",
    deps = [
        "//java/src/edu/berkeley/cs/graph:edge",
        "//java/src/edu/berkeley/cs/graph:minimumspanningtree",
        "//java/src/edu/berkeley/cs/util:hashset",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "shortestpath",
    size = "small",
    srcs = ["ShortestPath_T.java"],
    test_class = "edu.berkeley.cs.graph.ShortestPath_T",
    deps = [
        "//java/src/edu/berkeley/cs/graph:directedgraph",
        "//java/src/edu/berkeley/cs/graph:shortestpath",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "multiplesourceshortestpath",
    size = "small",
    srcs = ["MultipleSourceShortestPath_T.java"],
    test_class = "edu.berkeley.cs.graph.MultipleSourceShortestPath_T",
    deps = [
        "//java/src/edu/berkeley/cs/graph:directedgraph",
        "//java/src/edu/berkeley/cs/graph:multiplesourceshortestpath",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)
