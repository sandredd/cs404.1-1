package(default_visibility = ["//visibility:public"])

java_test(
    name = "fuzzy_search",
    size = "small",
    srcs = ["FuzzySearch_T.java"],
    test_class = "edu.berkeley.cs.app.finalproject.FuzzySearch_T",
    deps = [
        "//java/src/edu/berkeley/cs/app/finalproject",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "hotkey",
    size = "small",
    srcs = ["HotKeyGenerator_T.java"],
    test_class = "edu.berkeley.cs.app.finalproject.HotKeyGenerator_T",
    deps = [
        "//java/src/edu/berkeley/cs/app/finalproject",
        "//java/src/edu/berkeley/cs/util",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "sort_checker",
    size = "small",
    srcs = ["SortChecker_T.java"],
    data = [
        "//resources:dictionary",
    ],
    test_class = "edu.berkeley.cs.app.finalproject.SortChecker_T",
    deps = [
        "//java/src/edu/berkeley/cs/app/finalproject",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//resources:words",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "duplicate_usernames",
    size = "small",
    srcs = ["DuplicateUsernames_T.java"],
    test_class = "edu.berkeley.cs.app.finalproject.DuplicateUsernames_T",
    deps = [
        "//java/src/edu/berkeley/cs/app/finalproject",
        "//java/src/edu/berkeley/cs/util",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)
