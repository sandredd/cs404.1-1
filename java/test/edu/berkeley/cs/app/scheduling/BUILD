package(default_visibility = ["//visibility:public"])

java_test(
    name = "fifoscheduler",
    size = "small",
    srcs = ["FiFoScheduler_T.java"],
    test_class = "edu.berkeley.cs.app.scheduling.FiFoScheduler_T",
    deps = [
        "//java/src/edu/berkeley/cs/app/scheduling:fifoscheduler",
        "//java/src/edu/berkeley/cs/app/scheduling:job",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "job",
    size = "small",
    srcs = ["Job_T.java"],
    test_class = "edu.berkeley.cs.app.scheduling.Job_T",
    deps = [
        "//java/src/edu/berkeley/cs/app/scheduling:job",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "roundrobinscheduler",
    size = "small",
    srcs = ["RoundRobinScheduler_T.java"],
    test_class = "edu.berkeley.cs.app.scheduling.RoundRobinScheduler_T",
    deps = [
        "//java/src/edu/berkeley/cs/app/scheduling:job",
        "//java/src/edu/berkeley/cs/app/scheduling:roundrobinscheduler",
        "//thirdparty:junit4",
    ],
)

java_test(
    name = "shortestjobfirstscheduler",
    size = "small",
    srcs = ["ShortestJobFirstScheduler_T.java"],
    test_class = "edu.berkeley.cs.app.scheduling.ShortestJobFirstScheduler_T",
    deps = [
        "//java/src/edu/berkeley/cs/app/scheduling:job",
        "//java/src/edu/berkeley/cs/app/scheduling:shortestjobfirstscheduler",
        "//thirdparty:junit4",
    ],
)
