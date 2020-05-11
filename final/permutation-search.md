Permutation Search
------------------
Java's `indexOf(...)` searches for a given substring within a larger string and returns the index of
the first occurrence. We want to implement such a method, but also return the index of any
permutation of the search string, whichever comes first. See the following code snippet for an
example of how this would work.

    PermutationSearch.find("tractor", "actor"); // 2
    PermutationSearch.find("tractor", "rat");   // 0 because rat is a permutation of tra
    PermutationSearch.find("tractor", "cat");   // 2 because cat is a permutation of act

If you choose to solve this problem, you'll find some starter code in the following file(s):

- `java/src/edu/berkeley/cs/app/PermutationSearch.java`

The following command will be used to test and grade your solution:

    $ bazel test java/test/edu/berkeley/cs/app:permutation_search

Analysis
--------
### Data Structure and Algorithm Description

### Time Complexity Analysis

### Space Complexity Analysis

### Future Work: How Would You Improve Your Solution?
