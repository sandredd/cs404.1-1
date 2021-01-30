package(default_visibility = ["//visibility:public"])

java_library(
    name = "fifoscheduler",
    srcs = ["FiFoScheduler.java"],
    deps = [
        ":job",
        ":scheduler",
        "//java/src/edu/berkeley/cs/util:queue",
    ],
)

java_library(
    name = "job",
    srcs = ["Job.java"],
)

java_library(
    name = "roundrobinscheduler",
    srcs = ["RoundRobinScheduler.java"],
    deps = [
        ":job",
        ":scheduler",
        "//java/src/edu/berkeley/cs/util:queue",
    ],
)

java_library(
    name = "scheduler",
    srcs = ["Scheduler.java"],
)

java_library(
    name = "shortestjobfirstscheduler",
    srcs = ["ShortestJobFirstScheduler.java"],
    deps = [
        ":job",
        ":scheduler",
        "//java/src/edu/berkeley/cs/util:minheap",
    ],
)
