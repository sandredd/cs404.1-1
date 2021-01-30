Alien Sort Checking
-------------------
The English language has a very clear lexicographic order: A comes before B, which comes before C,
which comes before D, and so on. Therefore, when we look at two words, we can immediately tell
whether they are in lexicographic sorted ordered: simply check if they are in dictionary order. For
example, given the words `[apple, application, apply, dinosaur, door]`, we can confirm that
the words are in sorted order.

Suppose that instead of English, we were working with some alien language that was made up of the
following characters: `!`, `@`, `#`, `$`, `%`, `^`, `&`, `*`, `/`, `-`, `+`, and `~`. Like English,
each of these characters may have a lexicographic priority. Given a list of words in this alien
language and a lexicographic priority for the language's letters, implement an algorithm to
determine whether or not the input words are in sorted order. See the following code snippet for an
example of how this would work.

    char[] englishOrder = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', ...};
    SortChecker english = new SortChecker(englishOrder);

    // would return true
    checker.isSorted(new String[] {"apple", "application", "apply", "dinosaur", "door"});

    // would return false
    checker.isSorted(new String[] {"apple", "apply", "application"});

    char[] alienOrder = new char[] {'*', '#', '!', '@', '%', '~', '&', '-', '^', '+', '$', '/'};
    SortChecker alien = new SortChecker(alienOrder);

    // would return true
    alien.isSorted(new String[] {"!@#/&+", "!-$+/"});

    // would return false
    alien.isSorted(new String[] {"*##~-/$", "**@!"});

Note: you may not use the Java standard library sorting methods to solve this problem.

If you choose to solve this problem, you'll find some starter code in the following file(s):

- `java/src/edu/berkeley/cs/app/finalproject/SortChecker.java`

The following command will be used to test and grade your solution:

    $ bazel test java/test/edu/berkeley/cs/app/finalproject:sortchecker

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
