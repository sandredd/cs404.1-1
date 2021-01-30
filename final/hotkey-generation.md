Hotkey Generation
-----------------
Given a list of actions, we would like to assign unique hotkeys to them so that we can recall that
action again quickly. The way we select hotkeys has some restrictions:

- A hotkey must be a single character
- A hotkey must use some character from within the action that it is mapping to
  - For example, the action `down` has potential hotkeys `d`, `o`, `w`, `n`
- We prefer hotkeys to be earlier characters from the word
  - For example, hotkey `d` for the action `down` is better than `o`
- A hotkey cannot map to two or more actions
  - For example, the hotkey `d` cannot map to both `down` and `diagonal`
  - However, it is possible for `h` to map to `hi` and `i` to also map to `hi`

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

Notice that we chose to assign `r` to `flyr` instead of assigning it to `right`. In fact, `right`
received `i` as its hotkey. This is important because `f` was taken by `forward`, `l` was taken by
`left`, and `y` was taken by `fly`, so the only remaining hotkey for `flyr` is `r`. That means that
`r` cannot be given to `right` and we must use the next letter, `i`, as the hotkey for `right`.

A valid solution assigns all actions a unique hotkey. If it is not possible to assign a hotkey to
all given actions using the rules above, return an empty mapping.

If you choose to solve this problem, you'll find some starter code in the following file(s):

- `java/src/edu/berkeley/cs/app/finalproject/HotkeyGenerator.java`

The following command will be used to test and grade your solution:

    $ bazel test java/test/edu/berkeley/cs/app/finalproject:hotkeygenerator

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
