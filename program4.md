Program 4
---------
In this assignment, you will implement more searching algorithms as well as work on some graph
algorithms.

Before beginning on this assignment, make sure to read the `Graph` class:

- `java/src/edu/berkeley/cs/graph/Graph.java`

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

The files you will need (depending on the language you are working in) for this exercise are:

- `java/src/edu/berkeley/cs/util/HashMap.java`

Hash Set
--------
A hash map can easily decompose into a hash set if the values stored are simply a boolean true. Such
a hash set has been implemented for you. Read and understand its implementation.

The files you will need (depending on the language you are working in) for this exercise are:

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

The files you will need (depending on the language you are working in) for this exercise are:

- `java/src/edu/berkeley/cs/app/SpellChecker.java`

### Further Reading
Real spell checkers are not built using hash tables and heuristic rules to reach correctly spelled
words. To learn more about the real algorithms behind spell checkers, read about the [Levenshtein
distance](https://en.wikipedia.org/wiki/Levenshtein_distance) algorithm.

Depth First Search (DFS)
------------------------
Implement depth first search. You must implement the following methods:

- `dfs(...)`

The files you will need (depending on the language you are working in) for this exercise are:

- `java/src/edu/berkeley/cs/graph/DepthFirstSearch.java`

Breadth First Search (BFS)
--------------------------
Implement breadth first search. You must implement the following methods:

- `bfs(...)`

The files you will need (depending on the language you are working in) for this exercise are:

- `java/src/edu/berkeley/cs/graph/BreadthFirstSearch.java`

Depth First Order
-----------------
Now that you have practiced writing depth first search, use DFS to implement functionality to
determine the various orderings (e.g. preorder, postorder, reverse postorder) in a graph.

The files you will need (depending on the language you are working in) for this exercise are:

- `java/src/edu/berkeley/cs/graph/DepthFirstOrderjava`

Grading
-------
Tests have already been written to help you ensure that your code works. The following commands will
be used to test and grade your code:

    $ bazel test java/test/edu/berkeley/cs/util:{hashset,hashmap}
    $ bazel test java/test/edu/berkeley/cs/graph:{graph,bfs,dfs,dfsorder}
    $ bazel test java/test/edu/berkeley/cs/app:spellchecker
