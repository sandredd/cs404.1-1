package(default_visibility = ["//visibility:public"])

java_test(
    name = "fifo",
    srcs = ["FiFoScheduler_T.java"],
    test_class = "edu.berkeley.cs.scheduling.FiFoScheduler_T",
    deps = [
        "//java/src/edu/berkeley/cs/scheduling",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "job",
    srcs = ["Job_T.java"],
    test_class = "edu.berkeley.cs.scheduling.Job_T",
    deps = [
        "//java/src/edu/berkeley/cs/scheduling",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "rr",
    srcs = ["RoundRobinScheduler_T.java"],
    test_class = "edu.berkeley.cs.scheduling.RoundRobinScheduler_T",
    deps = [
        "//java/src/edu/berkeley/cs/scheduling",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "sjf",
    srcs = ["ShortestJobFirstScheduler_T.java"],
    test_class = "edu.berkeley.cs.scheduling.ShortestJobFirstScheduler_T",
    deps = [
        "//java/src/edu/berkeley/cs/scheduling",
        "//thirdparty:junit4",
    ],
)
