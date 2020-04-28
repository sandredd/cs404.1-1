Final Project
-------------
For the last few weeks, we have been studying some of the most popular data structures and
algorithms in use today. Some of them have been quite advanced, but all of them have had one thing
in common: the right data structure or algorithm can make all the difference between a fast program
and a slow program.

For our final project, we will be applying the concepts we've learned in this course to develop our
own algorithms and solutions to problems that you might face in your career. The following problem
statements are simplified versions of tasks that I've personally had to solve while on the job or
during interviews. Through these questions, I will be testing your ability to take a general problem
description and extract an appropriate data structure and algorithm to use to solve it. All of the
problems below are solvable with a data structure or algorithm that we have studied in detail in
this course. Some problems may require you to be a little creative with how you use the data
structures and algorithms you have learned.

In addition to designing an algorithm for your solution, you will write a short response about how
your algorithm works, any trade-offs you made, and an analysis of the time and space complexities of
your solution.

Instructions
------------
The following sections contain descriptions of various problems that are available to be solved. You
must solve any three of the available problems.

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

Note: one method to solve this is to use regular expressions. The textbook covers regular
expressions in section 5.4. However, we didn't have time to cover this section in our course. If you
know how to implement the internals of regular expressions, you may use that strategy. Obviously,
you may not use regular expressions from Java's standard library. However, given what we have
studied in our course, you should now have enough of an algorithmic foundation to be able to
complete this problem without the use of regular expressions.

If you choose to solve this problem, you'll find some starter code in the following file(s):

- `java/src/edu/berkeley/cs/app/FuzzySearch.java`

Alien Sort Checking
-------------------
The English language has a very clear lexicographic order: A comes before B, which comes before C,
which comes before D, and so on in the English alphabet. Therefore, when we look at two words, we
can immediately tell whether they are in lexicographic sorted ordered: are they in dictionary order?
For example, given the words `[apple, apply, book, dinosaur, garage, saxophone]`, we can confirm
that the words are in sorted order.

Suppose that instead of English, we were working with some alien language that was made up of the
following characters: `!`, `@`, `#`, `$`, `%`, `^`, `&`, `*`, `/`, `-`, `+`, and `~`. Like English,
each of these characters may have a lexicographic priority. Given a list of words in this alien
language and a lexicographic priority for the language's letters, implement an algorithm to
determine whether or not the input words are in sorted order. See the following code snippet for an
example of how this would work.

    char[] englishOrder = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', ...};
    SortChecker english = new SortChecker(englishOrder);

    // would return true
    checker.isSorted(new String[] {"apple", "apply", "book", "dinosaur", "garage", "saxophone"});

    // would return false
    checker.isSorted(new String[] {"apple", "apply", "book", "saxophone", "garage", "dinosaur"});

    char[] alienOrder = new char[] {'*', '#', '!', '@', '%', '~', '&', '-', '^', '+', '$', '/'};
    SortChecker alien = new SortChecker(alienOrder);

    // would return true
    alien.isSorted(new String[] {"!@#/&+", "!-$+/"});

    // would return false
    alien.isSorted(new String[] {"*##~-/$", "**@!"});

If you choose to solve this problem, you'll find some starter code in the following file(s):

- `java/src/edu/berkeley/cs/app/SortChecker.java`

Hotkey Generation
-----------------
Given a list of actions, we would like to assign unique hotkeys to them so that we can recall that
action again quickly. The way we select hotkeys has some restrictions:

- A hotkey must be a single character
- A hotkey must use some character from within the action that it is mapping to
    - The action `down` has potential hotkeys `d`, `o`, `w`, `n`
- Each hotkey should be unique such that it maps to only a single action
    - The hotkey `d` cannot map to both `down` and `diagonal`

See the following code snippet for an example of how this would work.

    HotkeyGenerator.generate(new String[] {"up", "down"});
    {
        'u': "up",
        'd': "down",
    }

    HotkeyGenerator.generate(new String[] {"forward", "backward", "left", "right", "fly", "flyr"});
    {
        'f': "forward",
        'b': "backward",
        'l': "left",
        'i': "right",
        'y': "fly",
        'r': "flyr",
    }

Notice that we chose to assign 'r' to "flyr" instead of assigning it to "right". In fact, "right"
received 'i' as its hotkey. This is important because 'f' was taken by "forward", 'l' was taken by
"left", and 'y' was taken by "fly", so the only remaining hotkey for "flyr" is 'r'. That means that
'r' cannot be given to "right" and we must use the next letter, 'i', as the hotkey for "right". If
it is not possible to assign a hotkey to all given actions using the rules above, throw an
exception.

If you choose to solve this problem, you'll find some starter code in the following file(s):

- `java/src/edu/berkeley/cs/app/HotkeyGenerator.java`

Format
------
Your responses should be formatted in [markdown](md) format with a maximum line length of 100
columns. Text editors should automatically be able to format content based on line length. You may
need to search through your text editor's settings to figure out how to do this. If all else fails,
you can use the `fmt -w 100 filename` command instead.

[md]: https://guides.github.com/features/mastering-markdown
