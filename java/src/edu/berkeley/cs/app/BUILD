package(default_visibility = ["//visibility:public"])

java_library(
    name = "calculator",
    srcs = ["Calculator.java"],
    deps = ["//java/src/edu/berkeley/cs/util:stack"],
)

java_library(
    name = "plagiarismdetector",
    srcs = ["PlagiarismDetector.java"],
    deps = [
        "//java/src/edu/berkeley/cs/util:linkedlist",
        "//java/src/edu/berkeley/cs/util:radixtriemap",
    ],
)

java_library(
    name = "spellchecker",
    srcs = ["SpellChecker.java"],
    deps = ["//java/src/edu/berkeley/cs/util:hashset"],
)

java_library(
    name = "summabletree",
    srcs = ["SummableTree.java"],
    deps = ["//java/src/edu/berkeley/cs/util:treemap"],
)

java_library(
    name = "warmup",
    srcs = ["Warmup.java"],
)
