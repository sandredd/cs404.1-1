Program 4
---------
In this assignment, you will implement and experiment with various searching algorithms.

Binary Heap
-----------
Parts of an array backed binary minimum heap have been implemented for you. Complete the
implementation by implementing the following functions:

- `sink(...)`
- `swim(...)`
- `removeMinimum(...)`

Note that this binary heap implementation uses a 1-based array indexing system similar to the type
presented in class. When implementing your binary heap, you can make use of the `resize(...)`
function to grow or shrink the array backing the binary heap to a given capacity. Remember that when
growing the array, we want to double in size. However, when shrinking the array, we only want to do
so when the array is 1/4 used, rather than 1/2 used. This avoids avoid a possible worst case of
repeatedly growing and shrinking as discussed in class.

The files you will need (depending on the language you are working in) for this exercise are:

- Java: `java/src/edu/berkeley/cs/util/MinHeap.java`
- Python: `python/src/util/minheap.py`

Priority Queues
---------------
Your company builds and operates the world's fastest supercomputer and sells access to top research
universities for them to conduct various experiments (jobs). The company charges a flat rate per job
run. In exchange, the research firms demand full (dedicated) access to the entire supercomputer's
resources during the time in which they run their jobs. Although each experiment takes a different
amount of time to complete, it is known roughly how long a job will take to complete before
launching it.

For this task, we can assume that research firms only care that they get their results back at some
point in the future and have no hard deadlines of when their jobs must be completed by. Furthermore,
we can assume that no job depends on another job to be run before it in order to run successfully.

In order to maximize its own profit, the company must run as many jobs as possible every day. The
company tasks you to find the best ordering of jobs such that they can maximize their profit. You
decide to experiment with the following scheduling algorithms to find the best one.

### First In First Out (FIFO)
Jobs are processed in the arriving order. The job at the front of the queue is served until it has
completed. That job is then removed from the queue. The next job at the front of the queue is served
until it has completed and then it is removed from the queue. This process is continued until the
queue is empty.

### Shortest Job First
The job with the shortest processing time is processed first until it has completed. That job is
then removed from the queue. The next job with the smallest processing time is then served until it
has completed and then it is removed from the queue. This process is continued until the queue is
empty.

### Round Robin (RR)
Jobs are processed using a fixed time slice. The jobs are initially kept in a queue based on the
order of arrival. The job at the front of the queue is removed and served similar to the FIFO
algorithm. However, unlike the FIFO algorithm, each job is served up to the predefined slice of
time. If the job can be completed within the allotted time, it is fully served and removed from the
queue. If the job cannot be completed in the allotted time, it is served for the allotted time and
then added to the end of the queue to be served later for the remaining time. This process is
continued until the queue is empty.

The total turnaround time is the total time a job spends in the system: processing time + waiting
time (time spent in the queue). For example, if the workload is 15 units of time, but the job spends
50 units of time in queue, waiting to be processed, then the total turnaround time is equal to 65
units.

Implement each scheduling algorithm in its respective file. You should use a linked list for the
first in first out scheduling algorithm, a queue for the round robin scheduling algorithm, and the
binary heap you implemented above for the shortest job first scheduling algorithm. The directory you
will be working in (depending on the language you are working in) for this exercise is:

- Java: `java/src/edu/berkeley/cs/app/scheduling`
- Python: `python/src/app/scheduling`

Tree Map
--------
One of the methods to implement a symbol table is to use a binary search tree. Parts of a `TreeMap`
backed by a binary search tree have been implemented for you. Complete the implementation by
implementing the following methods:

- `put(...)`
- `get(...)`
- `min(...)`
- `max(...)`
- `deleteMax(...)`
- `deleteMin(...)`

You may implement these functions either iteratively or recursively. An example recursive
implementation of Hibbard deletion is implemented in `delete(...)`. The same could have been done
iteratively.

The files you will need (depending on the language you are working in) for this exercise are:

- Java: `java/src/edu/berkeley/cs/util/TreeMapjava`
- Python: `python/src/util/treemap.py`

Grading
-------
Tests have already been written to help you ensure that your code works. The following commands will
be used to test and grade your code:

Java:

    $ bazel test java/test/edu/berkeley/cs/util:{treemap,minheap}
    $ bazel test java/test/edu/berkeley/cs/app/scheduling:all

Python:

    $ bazel test python/test/util:{treemap,minheap}
    $ bazel test python/test/app/scheduling:all
