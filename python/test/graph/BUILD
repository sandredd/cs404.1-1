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
