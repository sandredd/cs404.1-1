package(default_visibility = ["//visibility:public"])

java_test(
    name = "calculator",
    srcs = ["Calculator_T.java"],
    test_class = "edu.berkeley.cs.app.Calculator_T",
    size = "small",
    deps = [
        "//java/src/edu/berkeley/cs/app",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "spellchecker",
    srcs = ["SpellChecker_T.java"],
    test_class = "edu.berkeley.cs.app.SpellChecker_T",
    size = "small",
    deps = [
        "//java/src/edu/berkeley/cs/app",
        "//java/src/edu/berkeley/cs/util",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "plagiarism",
    srcs = ["PlagiarismDetector_T.java"],
    test_class = "edu.berkeley.cs.app.PlagiarismDetector_T",
    size = "small",
    deps = [
        "//java/src/edu/berkeley/cs/app",
        "//thirdparty:junit4",
    ],
)
