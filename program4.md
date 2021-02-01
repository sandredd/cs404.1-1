Program 4
---------
In this assignment, you will implement and make improvements to various sorting algorithms. Before
beginning on this assignment, make sure to read the abstract `Sort` class:

- `java/src/edu/berkeley/cs/sort/Sort.java`

Within this file, there are some already implemented methods you can use while completing your
implementations:

- `less(...)`: determine if a value is less than another in a generic way
- `swap(...)`: swap the position of two values

When completing your implementations, you must make sure to use the above methods instead of
implementing them on your own within your code. The above methods keep track of the calls made to
them which the unit tests use when grading your work. If you forget to use the above methods, you
might see tests fail unnecessarily. Please make sure to use them.

Shellsort and quicksort have already been implemented for you:

- `java/src/edu/berkeley/cs/sort/Shell.java`
- `java/src/edu/berkeley/cs/sort/Quick.java`

Selection Sort
--------------
Implement selection sort.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/sort/Selection.java`

Insertion Sort
--------------
When sorting an array, we normally want to sort it in its entirety. However, it is also useful to be
able to sort just a portion of the array. For example, when cutting off to insertion sort for small
subarrays in mergesort or quicksort, we want to be able to sort just the subarray. Implement
insertion sort to support sorting just the subarray starting from the index `low` and ending at the
index `high`.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/sort/Insertion.java`

Quicksort
----------
Quicksort has already been implemented for you in this exercise. However, there are various
improvements that can still be made to this implementation to make it faster in practice. Make the
following changes to the quicksort implementation.

### Use insertion sort for small subarrays
Quicksort is slower than insertion sort for tiny subarrays. For subarrays of size less than or equal
to 5, cut off to insertion sort.

### Pivot selection
Choosing the right pivot can make all the difference for the execution of quicksort. Ideally, we
would select the [median](https://en.wikipedia.org/wiki/Median) value of all the elements in each
subarray. However, finding the median efficiently is a tricky problem. Instead, use the median value
of first, middle, and last element of the subarray to be sorted.

**Note**: for this step, you may find that `partition(...)` needs to be slightly modified for the
sort to continue working.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/sort/Quick.java`

Merge Sort
----------
Implement top-down mergesort. While implementing mergesort, if you need to make a copy of a generic
array (e.g. for the auxiliary array), you can use `Arrays.copyOf(input, input.length);`. Once you
have a working implementation, make the following improvements to your implementation:

### Use insertion sort for small subarrays
For subarrays of size less than or equal to 5, cut off to insertion sort.

### Test whether the array is already in order
Skip the call to `merge(...)` if `input[mid]` is less than or equal to `input[mid+1]`. This
effectively converts mergesort's time complexity to `O(n)` when sorting an array that is already in
sorted order.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/sort/Merge.java`

Mergesort Linked Lists
----------------------
Up until now, all of our sorting algorithms have dealt with sorting arrays. However, we must also be
able to sort other data structures that hold ordered data (e.g. linked lists). In fact, mergesort is
the method of choice for sorting linked lists because it uses no extra space and is guaranteed to be
linearithmic. Unfortunately, our current implementation of mergesort will not work on linked lists.

Fill in the linked list specific `merge(...)` and `sort(...)` methods within your mergesort
implementation. For your specific implementation, you don't need to worry about optimizing to avoid
allocating extra space.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/sort/Merge.java`


Grading
-------
Tests have already been written to help you ensure that your code works. The following commands will
be used to test and grade your code:

    $ bazel test java:program4
