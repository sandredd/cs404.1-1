package(default_visibility = ["//visibility:public"])

py_test(
    name = "calculator",
    srcs = ["calculator.py"],
    deps = ["//python/src/app"],
)

py_test(
    name = "spellchecker",
    srcs = ["spellchecker.py"],
    deps = ["//python/src/app"],
)

py_test(
    name = "plagiarism",
    srcs = ["plagiarism_detector.py"],
    main = "plagiarism_detector.py",
    deps = ["//python/src/app"],
)
