package(default_visibility = ["//visibility:public"])

java_test(
    name = "elementary",
    size = "small",
    srcs = ["Elementary_T.java"],
    test_class = "edu.berkeley.cs.sort.Elementary_T",
    deps = [
        "//java/src/edu/berkeley/cs/sort",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "merge",
    size = "small",
    srcs = ["Merge_T.java"],
    test_class = "edu.berkeley.cs.sort.Merge_T",
    deps = [
        "//java/src/edu/berkeley/cs/sort",
        "//java/src/edu/berkeley/cs/util",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "quick",
    size = "small",
    srcs = ["Quick_T.java"],
    test_class = "edu.berkeley.cs.sort.Quick_T",
    deps = [
        "//java/src/edu/berkeley/cs/sort",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)
