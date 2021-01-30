Duplicate Usernames
-------------------
You work in the fraud department at a rapidly growing startup that is planning on raising another
round of funding. Recently, your company has seen an uptick of duplicate user registrations; users
have been registering multiple accounts for themselves. In order to present accurate usage numbers
to your investors, you need to determine how many total users your company actually has. Since users
have been registering duplicate accounts, simply counting the number of registered accounts isn't
going to cut it. Through some analysis, you find various sets of user accounts that belong to the
same individual. Take, for example, the list of usernames below.

- Person 1
    - poescanger
    - loundssabbage
    - fumbcawn
- Person 2
    - poescanger
    - stointyfiff
    - sleaselhumbing
- Person 3
    - sleaselhumbing
    - dondwarkened
    - trallfoft
- Person 4
    - spintedhiny
    - cringlingchingy
    - soastdrilk
- Person 5
    - crokecrawn
    - brustygewing
    - bainedmobal
- Person 6
    - brustygewing
    - flandsmancers
    - snizzardsmoy

By looking at this data, we know that person 1, person 2, and person 3 are all the same person:
person 1 and person 2 share the `poescanger` username and person 2 and person 3 share the
`sleaselhumbing` username. Person 5 and person 6 are also the same person as well: person 5 and
person 6 share the `brustygewing` username. Person 4 shares no usernames with anyone else. Through
this, we find that the total number of actual registered users is 3 instead of 6.

Given a set of usernames that are known to belong to the same person, implement an algorithm to
determine the actual number of registered users.

If you choose to solve this problem, you'll find some starter code in the following file(s):

- `java/src/edu/berkeley/cs/app/finalproject/DuplicateUsernames.java`

The following command will be used to test and grade your solution:

    $ bazel test java/test/edu/berkeley/cs/app/finalproject:duplicateusernames

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
