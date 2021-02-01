Program 1
---------
In this assignment, you will implement some basic programs to familiarize yourself with Java. As a
warmup, you will practice the syntax of the language, become familiar with the tools used within
this course, and to get started thinking algorithmically. Then, you'll begin implementing some basic
data structures and algorithms.

Warmup: Running Sum
-------------------
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

Warmup: Numbers Smaller Than Current Number
-------------------------------------------
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

Warmup: Simple Compression
--------------------------
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

Doubly Linked List
------------------
Fill in the empty method stubs in the linked list class  with the implementation for a doubly linked
list. Ensure that your implementation has `O(1)` runtime where it makes sense (e.g. `size()`).

Note: data structure operations are tricky to do in your head. For example, `remove(...)` has a lot
of corner cases and can be tricky to get right. Try drawing out the data structure on a piece of
paper, working through each individual step of the operations above, and then converting the steps
to code.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/util/LinkedList.java`

Move to Front
-------------
If the order that items in a list are stored is not important, you can frequently speed up searching
with a heuristic known as move to front. Whenever an item is accessed, move it to the front of the
list. This action usually results in an improvement because frequently accessed items tend to
migrate toward the front of the list, whereas less frequently accessed items tend to migrate toward
the end of the list. Consequently, the time complexity of `contains(...)` is often much less than
`O(n)` because the most frequently accessed items tend to require the least searching.

Extend the `LinkedList` class in to implement the move-to-front heuristic for linked lists.

Note: `front(...)` and `back(...)` should not implement the move-to-front heuristic.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/util/SplayList.java`

Testing your code
-----------------
Tests have already been written to help you ensure that your code works. The following commands will
be used to test and grade your code:

    $ bazel test java:program1
