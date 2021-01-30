package(default_visibility = ["//visibility:public"])

java_test(
    name = "calculator",
    size = "small",
    srcs = ["Calculator_T.java"],
    test_class = "edu.berkeley.cs.app.Calculator_T",
    deps = [
        "//java/src/edu/berkeley/cs/app:calculator",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "calculatorextracredit",
    size = "small",
    srcs = ["CalculatorExtraCredit_T.java"],
    test_class = "edu.berkeley.cs.app.CalculatorExtraCredit_T",
    deps = [
        "//java/src/edu/berkeley/cs/app:calculator",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "spellchecker",
    size = "small",
    srcs = ["SpellChecker_T.java"],
    test_class = "edu.berkeley.cs.app.SpellChecker_T",
    deps = [
        "//java/src/edu/berkeley/cs/app:spellchecker",
        "//java/src/edu/berkeley/cs/util:hashset",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "plagiarismdetector",
    size = "small",
    srcs = ["PlagiarismDetector_T.java"],
    test_class = "edu.berkeley.cs.app.PlagiarismDetector_T",
    deps = [
        "//java/src/edu/berkeley/cs/app:plagiarismdetector",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "summabletree",
    size = "small",
    srcs = ["SummableTree_T.java"],
    test_class = "edu.berkeley.cs.app.SummableTree_T",
    deps = [
        "//java/src/edu/berkeley/cs/app:summabletree",
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
        "//java/src/edu/berkeley/cs/app:warmup",
        "//thirdparty:junit4",
    ],
)
