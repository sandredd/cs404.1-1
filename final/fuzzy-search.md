Fuzzy Search
------------
DNA is composed of four nucleotide bases: A, T, C, and G. A strand of DNA is simply some sequence of
these four nucleotides (e.g. `ACATG...ACCGA`). A DNA sequencer is a machine which reads a strand of
DNA in its organic form and converts it to a text string that a computer can then process. DNA
sequencers, while mostly accurate, can sometimes be unsure of which nucleotide was actually seen
(e.g. if reading low quality DNA). In this case, our DNA sequencer will place a period (`.`) in the
place of the actual nucleotide to mark that it wasn't sure. The period is a wildcard character and
can stand for any of the four nucleotide bases. In the example string above, the DNA sequencer was
unsure about three consecutive nucleotides. However, periods are not always consecutive.

We want to be able to search through the sequenced DNA for a given substring. However, we need to
allow for these wildcard characters while searching. Implement an algorithm that allows us to
perform a fuzzy search through a sequence of DNA that may or may not have wildcard characters. See
the following code snippet for an example of how this would work.

    FuzzySearch.indexOf("ACTGGTCA", "TGAT")); // -1 because TGAT doesn't exist in the string and
                                              // there are no wildcard characters to fuzz

    FuzzySearch.indexOf("ACATGGTC", "TGGT")); // 3 because TGGT itself exists in the string
    FuzzySearch.indexOf("A.AC.ATG", "ACT");   // 2 because ACT matches AC.
    FuzzySearch.indexOf("ACT.G.CA", "GGAC")); // 3 because GGAC matches .G.C

If you choose to solve this problem, you'll find some starter code in the following file(s):

- `java/src/edu/berkeley/cs/app/finalproject/FuzzySearch.java`

The following command will be used to test and grade your solution:

    $ bazel test java/test/edu/berkeley/cs/app/finalproject:fuzzysearch

Analysis
--------
### Data Structure and Algorithm Description

### Time Complexity Analysis

### Space Complexity Analysis

### Future Work: How Would You Improve Your Solution?

Grading
-------
### Scores
- Percentage of test cases passing:
- Selection of efficient data structure or algorithm:
- Solution description:

### Comments
