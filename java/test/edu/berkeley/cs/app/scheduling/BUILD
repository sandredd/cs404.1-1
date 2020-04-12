package(default_visibility = ["//visibility:public"])

java_test(
    name = "fifo",
    srcs = ["FiFoScheduler_T.java"],
    test_class = "edu.berkeley.cs.app.scheduling.FiFoScheduler_T",
    size = "small",
    deps = [
        "//java/src/edu/berkeley/cs/app/scheduling",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "job",
    srcs = ["Job_T.java"],
    test_class = "edu.berkeley.cs.app.scheduling.Job_T",
    size = "small",
    deps = [
        "//java/src/edu/berkeley/cs/app/scheduling",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "rr",
    srcs = ["RoundRobinScheduler_T.java"],
    test_class = "edu.berkeley.cs.app.scheduling.RoundRobinScheduler_T",
    size = "small",
    deps = [
        "//java/src/edu/berkeley/cs/app/scheduling",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "sjf",
    srcs = ["ShortestJobFirstScheduler_T.java"],
    test_class = "edu.berkeley.cs.app.scheduling.ShortestJobFirstScheduler_T",
    size = "small",
    deps = [
        "//java/src/edu/berkeley/cs/app/scheduling",
        "//thirdparty:junit4",
    ],
)
