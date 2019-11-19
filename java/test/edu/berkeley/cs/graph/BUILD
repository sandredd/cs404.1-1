package(default_visibility = ["//visibility:public"])

java_test(
    name = "graph",
    srcs = ["Graph_T.java"],
    test_class = "edu.berkeley.cs.graph.Graph_T",
    deps = [
        "//java/src/edu/berkeley/cs/graph",
        "//java/src/edu/berkeley/cs/util",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "dfs",
    srcs = ["DepthFirstSearch_T.java"],
    test_class = "edu.berkeley.cs.graph.DepthFirstSearch_T",
    deps = [
        "//java/src/edu/berkeley/cs/graph",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "bfs",
    srcs = ["BreadthFirstSearch_T.java"],
    test_class = "edu.berkeley.cs.graph.BreadthFirstSearch_T",
    deps = [
        "//java/src/edu/berkeley/cs/graph",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)
