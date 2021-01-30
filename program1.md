Program 1
---------
In this assignment, you will implement some basic programs to familiarize yourself with Java. The
purpose of this assignment is to practice the syntax of the language, become familiar with the tools
used within this course, and to get started thinking algorithmically before we begin implementing
the data structures and algorithms we are going to learn. Don't worry too much about making your
solutions optimal or the most efficient just yet. We'll learn the tools to do that in the rest of
the course.

Running Sum
-----------
Given an array of integers, `values`, the running sum of index `i` is the sum from `values[0]` to
`values[i]`. For example, suppose we had `values = [1, 2, 3, 4]`. The running sum of each index
would be:

- Index 0: `1`
- Index 1: `1 + 2 = 3`
- Index 2: `1 + 2 + 3 = 6`
- Index 3: `1 + 2 + 3 + 4 = 10`

Implement a method that takes in an array of integers, `values`, and returns a new array with the
array's running sum at each index. For example, the output for the above example would be the array
`[1, 3, 6, 10]`.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/app/Warmup.java`

Numbers Smaller Than Current Number
-----------------------------------
Given an array of integers, `values`, compute, for each index, the number of values in the array
that are strictly smaller than the value at the current index. For example, suppose we had an input
array `values = [8, 1, 2, 2, 3]`. The number of values smaller than the value at each index are:

- Index 0: 4 (there exist four number smaller than 8: 1, 2, 2, and 3)
- Index 1: 0 (there are no numbers smaller than 1 in the input)
- Index 2: 1 (there exists only one number smaller than 2: 1)
- Index 3: 1 (there exists only one number smaller than 2: 1)
- Index 4: 3 (there exists three numbers smaller than 3: 1, 2, and 2)

Implement a method that takes in an array of integers, `values`, and returns a new array with the
number of values smaller than each input array element. For example, the output for the above
example would be the array `[4, 0, 1, 1, 3]`.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/app/Warmup.java`

Simple Compression
------------------
Given an input string like `aabbbcddeddf`, we want to compress it to look like `a2b3cd2ed2f`. That
is, if a letter repeatedly appears, we convert it to be the letter and the number of times it
appeared. For example, `aa` became `a2` and `bbb` became `b3`. However, `c` remained `c` instead of
becoming `c1` because it only appeared once.

The rules of this style of compression are:

- Letters that appear multiple times are converted to the letter and the number of times they appear
  - `aabbb` becomes `a2b3`
- In order to be considered for compression, letters must appear consecutively next to each other
  - `aba` will remain `aba` even though there are two `a`'s in the input
- Letters that appear only a single time are emitted as they are
  - `c` remains `c` in the output instead of becoming `c1`

In case you are curious, we will learn more sophisticated methods of data compression later on in
the course.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/app/Warmup.java`

Testing your code
-----------------
Tests have already been written to help you ensure that your code works. The following commands will
be used to test and grade your code:

    $ bazel test java:program1
