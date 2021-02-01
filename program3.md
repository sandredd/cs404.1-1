Program 3
---------
In this assignment, you will implement and experiment with various searching algorithms.

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

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/util/TreeMapjava`

Summable Tree
-------------
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

If the target sum were 15, we have a path (4, 6, 5) whose sum equals the target sum. However, if the
target sum were 16 instead, there is no path to a leaf node which equals the target sum. Implement
an algorithm that determines if there is such a path, as defined above, for a given binary search
tree and a target sum. You don't need to return the path itself.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/app/SummableTree.java`

Hash Map (Separate Chaining)
----------------------------
A hash map is a symbol table backed by a hash table. In the previous assignment, you implemented a
tree map (a symbol table backed by a binary tree). Hash maps have various advantages and
disadvantages over tree maps and the correct choice depends on the application and problem you
are trying to solve. Parts of a hash map using separate chaining have been implemented for you.
Complete the implementation by implementing the following functions:

- `get(...)`
- `put(...)`
- `contains(...)`
- `delete(...)`

When implementing the above methods, remember to double the hash map when `n / m >= 8` where `n` is
the number of elements within the hash map and `m` is the size of the array of `SplayList`s (take
some time also to think about why we use a `SplayList` here). You should also halve the size of the
hash map when `n / m <= 2`. The `resize(...)` function has already been written for you.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/util/HashMap.java`

Hash Set
--------
A hash map can easily decompose into a hash set if the values stored are simply a boolean true. Such
a hash set has been implemented for you. Read and understand its implementation.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/util/HashSet.java`

Spell Checker
-------------
One way to implement a very basic spell checker is to use a hash set, preloaded with a list of words
known to be spelled correctly. As new words are seen by the application, the spell checker can be
queried to see if the word is spelled correctly or not (e.g. if the hash set contains the word or
not). The spell checker can also offer suggestions on the correct spelling of the word being
examined.

Implement a spell checker using the hash set you read about in the previous step. You must implement
the following methods:

- `isCorrectlySpelled(...)`
- `getSuggestions(...)`

For the `getSuggestions(...)` method, return any words in the dictionary that are obtainable by
applying any of the following rules:

- Add one (any) character to the beginning
- Add one (any) character to the end
- Remove one (any) character from the beginning
- Remove one (any) character from the end
- Exchange any two adjacent characters

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/app/SpellChecker.java`

### Further Reading
Real spell checkers are not built using hash tables and heuristic rules to reach correctly spelled
words. To learn more about the real algorithms behind spell checkers, read about the [Levenshtein
distance](https://en.wikipedia.org/wiki/Levenshtein_distance) algorithm.

Testing your code
-----------------
Tests have already been written to help you ensure that your code works. The following commands will
be used to test and grade your code:

    $ bazel test java:program3
