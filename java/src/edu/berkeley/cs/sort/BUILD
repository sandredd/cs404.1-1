package(default_visibility = ["//visibility:public"])

java_library(
    name = "insertion",
    srcs = ["Insertion.java"],
    deps = [":sort"],
)

java_library(
    name = "merge",
    srcs = ["Merge.java"],
    deps = [
        ":insertion",
        ":sort",
        "//java/src/edu/berkeley/cs/util:linkedlist",
    ],
)

java_library(
    name = "quick",
    srcs = ["Quick.java"],
    deps = [
        ":insertion",
        ":sort",
    ],
)

java_library(
    name = "selection",
    srcs = ["Selection.java"],
    deps = [":sort"],
)

java_library(
    name = "shell",
    srcs = ["Shell.java"],
    deps = [":sort"],
)

java_library(
    name = "sort",
    srcs = ["Sort.java"],
)
