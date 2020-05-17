Path Sum
--------
Given a binary search tree of integer keys and a target sum, we want to determine if there is a path
from the root of the tree to a leaf node such that the integers along the path, when summed
together, equal the target sum. For example, suppose we have the following binary search tree as
input.

              ┌───┐
              │ 4 │
              └─┬─┘
         ┌──────┴──────┐
       ┌─┴─┐         ┌─┴─┐
       │ 2 │         │ 6 │
       └─┬─┘         └─┬─┘
      ┌──┴───┐      ┌──┴───┐
    ┌─┴─┐  ┌─┴─┐  ┌─┴─┐  ┌─┴─┐
    │ 1 │  │ 3 │  │ 5 │  │ 7 │
    └───┘  └───┘  └───┘  └───┘

If the target sum were 15, we have a path (`[4, 6, 5]`) whose sum equals the target sum. However, if
the target sum were 16 instead, there is no path to a leaf node which equals the target sum.
Implement an algorithm that determines if there is such a path, as defined above, for a given binary
search tree and a target sum. You don't need to return the path itself.

If you choose to solve this problem, you'll find some starter code in the following file(s):

- `java/src/edu/berkeley/cs/app/SummableTree.java`

The following command will be used to test and grade your solution:

    $ bazel test java/test/edu/berkeley/cs/app:summable_tree

Analysis
--------
### Data Structure and Algorithm Description

### Time Complexity Analysis

### Space Complexity Analysis

### Future Work: How Would You Improve Your Solution?
