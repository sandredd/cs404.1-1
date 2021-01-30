package(default_visibility = ["//visibility:public"])

# all previous assignments grouped so as to not provide any hints via build dependencies as to which
# data structure or algorithm to use for a particular assignment.
deps_sort = [
    "//java/src/edu/berkeley/cs/sort:insertion",
    "//java/src/edu/berkeley/cs/sort:merge",
    "//java/src/edu/berkeley/cs/sort:quick",
    "//java/src/edu/berkeley/cs/sort:selection",
    "//java/src/edu/berkeley/cs/sort:shell",
]

deps_graph = [
    "//java/src/edu/berkeley/cs/graph:breadthfirstsearch",
    "//java/src/edu/berkeley/cs/graph:cycle",
    "//java/src/edu/berkeley/cs/graph:depthfirstorder",
    "//java/src/edu/berkeley/cs/graph:depthfirstsearch",
    "//java/src/edu/berkeley/cs/graph:directedgraph",
    "//java/src/edu/berkeley/cs/graph:minimumspanningtree",
    "//java/src/edu/berkeley/cs/graph:multiplesourceshortestpath",
    "//java/src/edu/berkeley/cs/graph:shortestpath",
    "//java/src/edu/berkeley/cs/graph:stronglyconnectedcomponents",
    "//java/src/edu/berkeley/cs/graph:topologicalsort",
]

deps_util = [
    "//java/src/edu/berkeley/cs/util:hashmap",
    "//java/src/edu/berkeley/cs/util:hashset",
    "//java/src/edu/berkeley/cs/util:linkedlist",
    "//java/src/edu/berkeley/cs/util:map",
    "//java/src/edu/berkeley/cs/util:minheap",
    "//java/src/edu/berkeley/cs/util:queue",
    "//java/src/edu/berkeley/cs/util:radixtriemap",
    "//java/src/edu/berkeley/cs/util:set",
    "//java/src/edu/berkeley/cs/util:splaylist",
    "//java/src/edu/berkeley/cs/util:stack",
    "//java/src/edu/berkeley/cs/util:treemap",
    "//java/src/edu/berkeley/cs/util:unionfind",
]

all_deps = deps_sort + deps_graph + deps_util

java_library(
    name = "duplicateusernames",
    srcs = ["DuplicateUsernames.java"],
    deps = all_deps,
)

java_library(
    name = "fuzzysearch",
    srcs = ["FuzzySearch.java"],
    deps = all_deps,
)

java_library(
    name = "hotkeygenerator",
    srcs = ["HotKeyGenerator.java"],
    deps = all_deps,
)

java_library(
    name = "sortchecker",
    srcs = ["SortChecker.java"],
    deps = all_deps,
)
