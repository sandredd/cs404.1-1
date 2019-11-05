package(default_visibility = ["//visibility:public"])

py_test(
    name = "fifo",
    srcs = ["fifo_scheduler.py"],
    main = "fifo_scheduler.py",
    deps = [
        "//python/src/app/scheduling",
        "//python/src/util",
    ],
)

py_test(
    name = "job",
    srcs = ["job.py"],
    deps = [
        "//python/src/app/scheduling",
    ],
)

py_test(
    name = "rr",
    srcs = ["round_robin_scheduler.py"],
    main = "round_robin_scheduler.py",
    deps = [
        "//python/src/app/scheduling",
        "//python/src/util",
    ],
)

py_test(
    name = "sjf",
    srcs = ["shortest_job_first_scheduler.py"],
    main = "shortest_job_first_scheduler.py",
    deps = [
        "//python/src/app/scheduling",
        "//python/src/util",
    ],
)
