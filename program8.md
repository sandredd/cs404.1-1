Program 8
---------
In this assignment, you will implement various radix based algorithms to sort and search through
integers and strings in an efficient manner.

Faster Sorting
--------------
Least significant digit (LSD) radix sort is a non-comparison based sorting algorithm. This means
that the `Ω(n log n)` lower bound that comes with comparison based sorting doesn't apply to it. The
algorithm depends on applying [counting sort](https://en.wikipedia.org/wiki/Counting_sort)
(sometimes called key-indexed counting) on an increasing order of significant digits. In class, we
discussed using LSD radix sort to sort strings. However, the same technique can be applied to
sort integers.

Another way to implement radix sort is to use an R-way trie. Like binary search trees, tries have
various properties about the order of data within them that we can exploit to extract a sorted set
of elements. Implement an R-way radix trie that can be used to sort a set of strings
lexicographically. Then, implement the `sorted(...)` function within the `RadixTrieMap`
class. Assume that all input strings are lowercase.

Note: real radix tries also employ [path
compression](https://en.wikipedia.org/wiki/Trie#Compressing_tries). You do not need to implement
path compression for this assignment.

Note: if you are curious, this is the first part of
[burstsort](https://en.wikipedia.org/wiki/Burstsort), one of the fastest known algorithms to sort
large sets of strings. The rest of burstsort is beyond the scope of this class.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/util/RadixTrieMap.java`

Autocomplete
------------
One of the most useful features of advanced text editors like `vim`, `emacs`, Sublime Text, VS Code,
etc is their ability to autocomplete variable names. When a user activates the autocompletion
feature, the text editor reads the already typed text and completes the remaining portion of it,
based on what has already been typed in the file. Add the ability to run autocompletion to the
`RadixTrieMap` that you wrote in the prior step. Specifically, implement the `startsWith(...)`
function within the `RadixTrieMap` to return the strings within the `RadixTrieMap` that all have the
given prefix.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/util/RadixTrieMap.java`

Plagiarism Detector
-------------------
Plagiarism detection websites like [TurnItIn](https://www.turnitin.com) offer an interesting
product. Students and teachers upload papers to the site and TurnItIn tells them where the paper may
be using borrowed text. In order to handle the scale at which the company operates (TurnItIn claim
that they scan over 165 million documents), they must use a sophisticated algorithm. Brute force
just won't cut it.

Implement a simple plagiarism detector similar to TurnItIn. Your plagiarism detector will be seeded
with a series of strings (papers) and should be able to determine whether a given string appears
in a previously seeded string.

Use the radix trie that you implemented in the previous exercise to implement your plagiarism
checker. You'll need to think about how to insert documents into the radix trie so that you can
efficiently query it to determine whether a given sentence is a substring of a document. You may
also need to slightly modify the `RadixTrieMap` to support such a query.

Note: This is the first part of the
[Aho-Corasick](https://en.wikipedia.org/wiki/Aho-Corasick_algorithm) substring search algorithm. The
Aho-Corasick substring search algorithm matches all substrings simultaneously using suffix tries
that have additional links between various internal nodes. However, this algorithm is well beyond
the scope of this course.

The file(s) you will need for this exercise are:

- `java/src/edu/berkeley/cs/app/PlagiarismDetector.java`

Grading
-------
Tests have already been written to help you ensure that your code works. The following commands will
be used to test and grade your code:

    $ bazel test java:program8
