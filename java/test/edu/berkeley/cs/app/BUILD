package(default_visibility = ["//visibility:public"])

java_test(
    name = "calculator",
    size = "small",
    srcs = ["Calculator_T.java"],
    test_class = "edu.berkeley.cs.app.Calculator_T",
    deps = [
        "//java/src/edu/berkeley/cs/app",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "calculator_ec",
    size = "small",
    srcs = ["CalculatorExtraCredit_T.java"],
    test_class = "edu.berkeley.cs.app.CalculatorExtraCredit_T",
    deps = [
        "//java/src/edu/berkeley/cs/app",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "spellchecker",
    size = "small",
    srcs = ["SpellChecker_T.java"],
    test_class = "edu.berkeley.cs.app.SpellChecker_T",
    deps = [
        "//java/src/edu/berkeley/cs/app",
        "//java/src/edu/berkeley/cs/util",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "plagiarism",
    size = "small",
    srcs = ["PlagiarismDetector_T.java"],
    test_class = "edu.berkeley.cs.app.PlagiarismDetector_T",
    deps = [
        "//java/src/edu/berkeley/cs/app",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "summable_tree",
    size = "small",
    srcs = ["SummableTree_T.java"],
    test_class = "edu.berkeley.cs.app.SummableTree_T",
    deps = [
        "//java/src/edu/berkeley/cs/app",
        "//java/test/edu/berkeley/cs/util:utilities",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "warmup",
    size = "small",
    srcs = ["Warmup_T.java"],
    test_class = "edu.berkeley.cs.app.Warmup_T",
    deps = [
        "//java/src/edu/berkeley/cs/app",
        "//thirdparty:junit4",
    ],
)
