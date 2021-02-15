CompSci 404.1
-------------
This repository houses the code and scaffolding that UC Berkeley Extension students taking CS 404.1
use when completing their assignments.

Student Setup
-------------
In order to set up your environment, follow the setup instructions in the [Student
Setup](https://github.com/ucbext/cs404.1/blob/master/student-setup.md) guide.

Supported Languages
-------------------
Quite a bit of work goes into preparing the course and the repository to use a particular language
(e.g. starter code, unit tests, solutions, etc). Currently, this course is offered in the following
languages. Other languages may be offered in the future.

- Java

Starter Code
------------
This repository contains various pieces of starter code that provide a skeleton and will help you
get started on your assignments. The starter code is my solutions to the problems with some parts
removed. However, the method that I use to solve the problem isn't necessarily the only method (or
even the best). When working with this starter code, you may modify it to your needs. The only
restriction is that you may not change or delete any code within the `java/test` directory.

Use of the Standard Library
---------------------------
This course focuses on data structures, algorithms, and their implementations. As such, in order for
you to learn about their internals, you must first implement them yourself. Therefore, in this
course, you may not use or import any standard library data structures or algorithms, unless
expressly permitted. If you need access to a particular data structure or algorithm, you must
implement it.

In order to ensure that you are not accidentally using a part of the standard library, run
`tools/nostdlib.sh` from the top level repository root. This script will scan your code and report
where invalid uses of the standard library are occurring. It's a good idea to run this script before
submitting your code for grading.

Code Style and Code Formatting
------------------------------
As a general rule, it is very important to keep source code in a consistent format. Most companies
have an established coding style for each language that they develop in. For this course, we will be
using Google's style guides for each language:

- Java: [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)

While it is useful to read the style guide and understand why the decisions were made as they were,
no one can expect to remember every detail every time. Therefore, we have tooling to help in
formatting the code in adherence to the style guide.

In order to format your code, run `tools/format.sh` from the top level repository root. This script
formats all supported languages within the repository.

Private Repositories
--------------------
In order to discourage any form of academic dishonesty, now or in the future, the repositories you
work in should use the private setting. A private repository has the same capabilities as a public
repository, except that only you and your instructor will be able to access it. This is important
while the course is progressing so that other students cannot find your work and use it as their
own. However, it continues to be important even after the course is over. As you complete
assignments, solutions will be committed to your repositories. Even after you have completed this
course, please don't make your repository or the solutions to the assignments public. Future
students may be solving similar assignments and they shouldn't be able to find solutions online.

For the most part, GitHub's platform will take care of repository access and privacy. However, I
write this here so that you can be cognizant of it as well, now and going forward.

Submitting Your Work
--------------------
Submit your work by committing your changes, pushing them upstream to GitHub, and marking the
submission on Gradescope before the due date. You may push as many commits and make as many
submissions as you like before the due date.

Grading
-------
Each program description will include a command that will be used to run tests for the code you
write in each assignment. The percentage of tests that pass will be your final grade for the
assignment.

Contributing
------------
If you find any issues within this repository while completing your assignments, please [open an
issue](https://github.com/ucbext/cs404.1/issues/new) in the issue tracker. Better yet, please open a
pull request against the repository and I will be happy to merge it in.
