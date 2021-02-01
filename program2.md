Program 2
---------
In this assignment, you will implement some basic data structures and algorithms relating to stacks,
queues, and searching.

Stack and Queue
---------------
A completed stack and queue implementation is available in the following files:

- `java/src/edu/berkeley/cs/util/Stack.java`
- `java/src/edu/berkeley/cs/util/Queue.java`

The stack and queue implementations are simply wrappers around the linked list implementation that
you wrote in the previous section of this assignment. Reusing the doubly linked list class in this
way allowed us to create a whole new set of data structures, simply by restricting certain access
patterns on the doubly linked list. Read and understand the implementation. Then read and understand
the unit tests that ensure the stack and queue work properly.

- `java/test/edu/berkeley/cs/util/Stack_T.java`
- `java/test/edu/berkeley/cs/util/Queue_T.java`

Calculator
----------
Dijkstra's two stack algorithm, as presented in class, is a simpler version of Dijkstra's real
algorithm. As presented, it has a serious limitation. It relies on the use of parenthesis to know
when to execute an operation and store a result on the stack. However, we cannot always rely on
input expressions to include parenthesis. For example, our algorithm should be able to compute the
expression `2 + 4 * 2 = 10`, knowing that the `*` operator has higher precedence than the `+`
operator, without the requirement of parenthesis as a guide.

Below is a slightly more advanced version of the algorithm with order of operations support built
in.

- Declare two stacks: values and operators
- Split input (by spaces) into tokens
- Process each token one by one
  - If value, push onto value stack
  - If operator
    - If operator stack is empty, push input operator onto operator stack
    - If input operator precedence is greater than precedence of top of operator stack, push input
      operator onto operator stack
    - If input operator precedence is less than or equal to precedence of top of operator stack
      - Repeat until operator stack is empty or token at top of operator stack has lower precedence
        than input operator
        - Pop two value tokens from value stack
        - Pop operator token from operator stack
        - Apply operator to value tokens
        - Push result onto value stack
      - Push input operator
- Upon reaching end of input, process operators remaining on operator stack until the operator stack
  is empty
- Result is single element remaining on top of value stack
  - If there is more than one element in the value stack, there was a missing operator and your code
    should throw a `RuntimeException`

Implement the above algorithm. Your implementation should support the following operations:

- Addition
- Subtraction
- Multiplication
- Division
- Exponents (`^`)

Some starter code is already available in order to make this task easier for you. The files you will
need for this exercise are:

- `java/src/edu/berkeley/cs/app/Calculator.java`

### Extra Credit
The above algorithm doesn't support parenthesis and therefore cannot support expressions where the
user intends to override the order of operations. For example, users cannot evaluate expressions
like `(4 - 2) * 3`. Extend the above algorithm with the instructions below.

- If left parentheses token, push token onto operator stack
- If right parenthesis token
  - Repeat until top of operator stack is left parenthesis
    - Pop two value tokens from value stack
    - Pop operator token from operator stack
    - Apply operator to value tokens
    - Push result onto value stack
  - Pop left parenthesis token from top of operator stack
    - If the top of the operator stack is not a left parenthesis, throw a `RuntimeException` to
      indicate that parenthesis are imbalanced
  - Discard right parenthesis token

### Further Reading
[The Shunting-Yard Algorithm](https://en.wikipedia.org/wiki/Shunting-yard_algorithm) is Dijkstra's
full two stack algorithm. The arithmetic expression evaluation algorithm summaries presented in this
assignment are only simplified versions of this algorithm. The full algorithm supports many more
mathematical operations (e.g. unary operators, variables, composite functions, functions with
multiple arguments, etc).

Binary Heap
-----------
Parts of an array backed binary minimum heap have been implemented for you. Complete the
implementation by implementing the following functions:

- `sink(...)`
- `swim(...)`
- `insert(...)`
- `removeMinimum(...)`

Note that this binary heap implementation uses a 1-based array indexing system similar to the type
presented in class. When implementing your binary heap, you can make use of the `resize(...)`
function to grow or shrink the array backing the binary heap to a given capacity. Remember that when
growing the array, we want to double in size. However, when shrinking the array, we only want to do
so when the array is 1/4 used, rather than 1/2 used. This avoids avoid a possible worst case of
repeatedly growing and shrinking as discussed in class.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/util/MinHeap.java`

Priority Queues
---------------
Your company builds and operates the world's fastest supercomputer and sells access to top research
firms and universities for them to conduct various experiments (jobs). The company charges a flat
rate per job run. In exchange, the research firms demand full, dedicated access to the entire
supercomputer's resources during the time in which they run their jobs. Although each experiment
takes a different amount of time to complete, it is known roughly how long a job will take to
complete before launching it.

To better understand the problem, we assign some vocabulary to some concepts:

- Job processing time: the time it will take a given job to complete when run on the supercomputer
- Job waiting time: the time a job waits for other jobs to complete before it can run
- Job turnaround time: job processing time + job waiting time
- Total turnaround time: the sum of the turnaround time of all jobs

Regardless of what order the jobs run in, the sum of their processing time will be the same. There
isn't much we can do about that. However, your company can provide a better experience by reducing a
job's waiting time as much as possible, thereby reducing its total turnaround time and getting
results back to the client as fast as possible. The company tasks you with finding the best ordering
of jobs such that job waiting time, and thereby total turnaround time, is kept as small as possible.
You decide to experiment with the following scheduling algorithms to find the best one.

For this task, we can assume that research firms only care that they get their results back at some
point in the future and have no hard deadlines of when their jobs must be completed by. Furthermore,
we can assume that no job depends on another job to be run before it in order to run successfully.

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

Implement each scheduling algorithm in its respective file. The first in first out scheduler can be
implemented with a linked list or a queue. The shortest job first scheduler should be implemented
with a priority queue, and the round robin scheduler should be implemented with a queue. Some of
this data structure selection has been done for you already. The directory you will be working in
 for this exercise is:

- `java/src/edu/berkeley/cs/app/scheduling`

Testing your code
-----------------
Tests have already been written to help you ensure that your code works. The following commands will
be used to test and grade your code:

    $ bazel test java:program2
