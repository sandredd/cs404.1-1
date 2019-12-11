package(default_visibility = ["//visibility:public"])

py_test(
    name = "graph",
    srcs = ["graph.py"],
    deps = [
        "//python/src/graph",
        "//python/test/util:utilities",
    ],
)

py_test(
    name = "digraph",
    srcs = ["directed_graph.py"],
    main = "directed_graph.py",
    deps = [
        "//python/src/graph",
        "//python/test/util:utilities",
    ],
)

py_test(
    name = "dfs",
    srcs = ["depth_first_search.py"],
    main = "depth_first_search.py",
    deps = [
        "//python/src/graph",
        "//python/test/util:utilities",
    ],
)

py_test(
    name = "bfs",
    srcs = ["breadth_first_search.py"],
    main = "breadth_first_search.py",
    deps = [
        "//python/src/graph",
        "//python/test/util:utilities",
    ],
)

py_test(
    name = "cycle",
    srcs = ["cycle.py"],
    deps = [
        "//python/src/graph",
        "//python/test/util:utilities",
    ],
)

py_test(
    name = "dfsorder",
    srcs = ["depth_first_order.py"],
    main = "depth_first_order.py",
    deps = [
        "//python/src/graph",
        "//python/test/util:utilities",
    ],
)

py_test(
    name = "toposort",
    srcs = ["topological_sort.py"],
    main = "topological_sort.py",
    deps = [
        "//python/src/graph",
        "//python/test/util:utilities",
    ],
)

py_test(
    name = "scc",
    srcs = ["strongly_connected_components.py"],
    main = "strongly_connected_components.py",
    deps = [
        "//python/src/graph",
        "//python/test/util:utilities",
    ],
)

py_test(
    name = "mst",
    srcs = ["minimum_spanning_tree.py"],
    main = "minimum_spanning_tree.py",
    deps = [
        "//python/src/graph",
        "//python/test/util:utilities",
    ],
)

py_test(
    name = "sp",
    srcs = ["shortest_path.py"],
    main = "shortest_path.py",
    deps = [
        "//python/src/graph",
        "//python/test/util:utilities",
    ],
)

py_test(
    name = "mssp",
    srcs = ["multiple_source_shortest_path.py"],
    main = "multiple_source_shortest_path.py",
    deps = [
        "//python/src/graph",
        "//python/test/util:utilities",
    ],
)
