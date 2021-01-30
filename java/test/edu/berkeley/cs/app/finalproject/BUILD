package(default_visibility = ["//visibility:public"])

java_test(
    name = "fuzzysearch",
    size = "small",
    srcs = ["FuzzySearch_T.java"],
    test_class = "edu.berkeley.cs.app.finalproject.FuzzySearch_T",
    deps = [
        "//java/src/edu/berkeley/cs/app/finalproject:fuzzysearch",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "hotkeygenerator",
    size = "small",
    srcs = ["HotKeyGenerator_T.java"],
    test_class = "edu.berkeley.cs.app.finalproject.HotKeyGenerator_T",
    deps = [
        "//java/src/edu/berkeley/cs/app/finalproject:hotkeygenerator",
        "//java/src/edu/berkeley/cs/util:hashmap",
        "//java/src/edu/berkeley/cs/util:linkedlist",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "sortchecker",
    size = "small",
    srcs = ["SortChecker_T.java"],
    data = [
        "//resources:dictionary",
    ],
    test_class = "edu.berkeley.cs.app.finalproject.SortChecker_T",
    deps = [
        "//java/src/edu/berkeley/cs/app/finalproject:sortchecker",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "duplicateusernames",
    size = "small",
    srcs = ["DuplicateUsernames_T.java"],
    test_class = "edu.berkeley.cs.app.finalproject.DuplicateUsernames_T",
    deps = [
        "//java/src/edu/berkeley/cs/app/finalproject:duplicateusernames",
        "//java/src/edu/berkeley/cs/util:hashset",
        "//java/src/edu/berkeley/cs/util:linkedlist",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)
