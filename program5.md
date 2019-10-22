Program 5
---------
In this assignment, you will implement more searching algorithms as well as work on some graph
algorithms.

Before beginning on this assignment, make sure to read the `Graph` class:

- Java: `java/src/edu/berkeley/cs/graph/Graph.java`
- Python: `python/src/graph/graph.py`

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

- Java: `java/src/edu/berkeley/cs/util/HashMap.java`
- Python: `python/src/util/hashmap.py`

Hash Set
--------
A hash map can easily decompose into a hash set if the values stored are simply a boolean true. Such
a hash set has been implemented for you. Read and understand its implementation.

The files you will need (depending on the language you are working in) for this exercise are:

- Java: `java/src/edu/berkeley/cs/util/HashSet.java`
- Python: `python/src/util/hashset.py`

Spell Checker
-------------
One way to implement a very basic spell checker is to use a hash set, preloaded with a list of words
known to be spelled correctly. As new words are seen by the application, the spell checker can be
queried to see if it the word is spelled correctly or not (e.g. if the hash set contains the word or
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

- Java: `java/src/edu/berkeley/cs/app/SpellChecker.java`
- Python: `python/src/app/spell_checker.py`

### Further Reading
Real spell checkers are not built using hash tables and heuristic rules to reach correctly spelled
words. To learn more about the real algorithms behind spell checkers, read about the [Levenshtein
distance](https://en.wikipedia.org/wiki/Levenshtein_distance) algorithm.

Depth First Search (DFS)
------------------------
Implement depth first search. You must implement the following methods:

- `dfs(...)`

The files you will need (depending on the language you are working in) for this exercise are:

- Java: `java/src/edu/berkeley/cs/graph/DepthFirstSearch.java`
- Python: `python/src/graph/depth_first_search.py`

Breadth First Search (BFS)
--------------------------
Implement breadth first search. You must implement the following methods:

- `bfs(...)`

The files you will need (depending on the language you are working in) for this exercise are:

- Java: `java/src/edu/berkeley/cs/graph/BreadthFirstSearch.java`
- Python: `python/src/graph/breadth_first_search.py`

Grading
-------
Tests have already been written to help you ensure that your code works. The following commands will
be used to test and grade your code:

Java:

    $ bazel test java/test/edu/berkeley/cs/util:{hashset,hashmap}
    $ bazel test java/test/edu/berkeley/cs/graph:{graph,bfs,dfs}
    $ bazel test java/test/edu/berkeley/cs/app:spellchecker

Python:

    $ bazel test python/test/util:{hashset,hashmap}
    $ bazel test python/test/graph:{graph,bfs,dfs}
    $ bazel test python/test/app:spellchecker
