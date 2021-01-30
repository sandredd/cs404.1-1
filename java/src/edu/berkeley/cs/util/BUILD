package(default_visibility = ["//visibility:public"])

java_library(
    name = "hashmap",
    srcs = ["HashMap.java"],
    deps = [
        ":linkedlist",
        ":map",
        ":splaylist",
    ],
)

java_library(
    name = "hashset",
    srcs = ["HashSet.java"],
    deps = [
        ":hashmap",
        ":set",
    ],
)

java_library(
    name = "linkedlist",
    srcs = ["LinkedList.java"],
)

java_library(
    name = "map",
    srcs = ["Map.java"],
)

java_library(
    name = "minheap",
    srcs = ["MinHeap.java"],
)

java_library(
    name = "queue",
    srcs = ["Queue.java"],
    deps = [":linkedlist"],
)

java_library(
    name = "radixtriemap",
    srcs = ["RadixTrieMap.java"],
    deps = [
        ":linkedlist",
        ":map",
    ],
)

java_library(
    name = "set",
    srcs = ["Set.java"],
)

java_library(
    name = "splaylist",
    srcs = ["SplayList.java"],
    deps = [":linkedlist"],
)

java_library(
    name = "stack",
    srcs = ["Stack.java"],
    deps = [":linkedlist"],
)

java_library(
    name = "treemap",
    srcs = ["TreeMap.java"],
    deps = [
        ":map",
        ":queue",
    ],
)

java_library(
    name = "unionfind",
    srcs = ["UnionFind.java"],
)
