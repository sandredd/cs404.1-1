Student Setup
-------------
This set of instructions will guide you through setting up your local environment with all the tools
and accounts you will need for this course.

Part 1: Operating System Specific Setup
---------------------------------------
Use the following instructions to properly set up your local environment. The instructions are
slightly different for different operating systems.

### Mac OS X
Mac OS X doesn't come standard with a lot of the developer tools necessary for this course. To get
these developer tools, you will have to install XCode tools on your computer. To do so, follow the
instructions below:

- Install XCode Tools
  - In a terminal, run the command `xcode-select --install`
- Install Bazel (via [homebrew](https://brew.sh))
  - In a terminal window, run the following commands:
    ```
    /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
    brew tap bazelbuild/tap
    brew install bazelbuild/tap/bazel
    ```

### Windows
Windows doesn't come standard with a lot of the developer tools necessary for this course. To get
these developer tools, you will have to install a few different programs. To do so, follow the
instructions below:

- Download and install the Microsoft Visual C++ Redistributable
  - Navigate to the [Microsoft Downloads](https://visualstudio.microsoft.com/downloads/) page
  - At the bottom of the page, you'll find a section entitled "All Downloads" with a search bar
  - Search for "redistributable"
  - Download and run the appropriate package for your architecture (e.g. 32 bit or 64 bit Windows)
- [Download](https://git-scm.com/download/win) and install `git`
  - The default settings already selected during installation are fine to use
- [Download](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) and install Java
  JDK 11
- Install Bazel
  - In a new PowerShell window, execute the following commands:
    ```
    Set-ExecutionPolicy RemoteSigned -scope CurrentUser
    iwr -useb get.scoop.sh | iex
    scoop install sudo
    sudo scoop install bazel --global
    ```

Part 2: Bootstrap Your Repository
---------------------------------
Use the following instructions to create your repository.

- Ensure you have a GitHub account, have verified your email address, and are signed in
- Navigate to the [classroom page](https://classroom.github.com/a/_zbu1ZEg) on GitHub
- Accept the assignment to have GitHub create a repository for you to do your work in

Part 3: Cloning Your Repository
-------------------------------
Now that you have a repository with some starter code in it, you can clone your repository using
GitHub Desktop or whatever other method you prefer.

**Note**: some of the tools we use in this course don't work well with paths that contain spaces. If
you are using Windows, make sure to clone your repository to a location that doesn't have a space in
its path.

Part 4: Installing an IDE
-------------------------
An integrated development environment (IDE) is a tool that developers use to work on code. The IDE
includes all of the elements necessary to compile, run, and debug our programs. You aren't required
to use any specific set of tools for this class outside of `git` and `bazel`. You may use whatever
tools you prefer using and that includes your choice of IDE. It is up to you to determine whichever
development environment works best for your personal tastes. As such, detailed instructions on how
to set up your IDE or perform various environment related operations won't be provided. I assume
that by this stage of your software engineering career, you are familiar with your tools of choice.

Having said that, I offer you the following suggestions:

- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/other.html)
  - **WARNING**: use the latest version that starts with `2019`. Avoid version numbers starting with
    `2020`. The Bazel plugin doesn't work with some of the latter versions of IntelliJ.
  - **Note**: Some of these instructions are available in
    [video form](https://www.youtube.com/watch?v=5gUF57S0sbI).
  - Once installed, open IntelliJ IDEA and open the preferences pane
  - Search for and install the following extensions within IntelliJ IDEA
    - `Bazel` by Google
    - `google-java-format` by Google
  - Restart IntelliJ IDEA after installing your plugins
  - Open the preferences pane for IntelliJ IDEA
  - Open the `Other Settings` dropdown on the left side pane
  - Click on `Bazel Settings` to enter Bazel specific preferences
  - Enter the location of the `bazel` binary into the `Bazel binary location` text field. This
    instructs IntelliJ IDEA where Bazel lives on your system.
    - Windows: `C:\ProgramData\scoop\apps\bazel\current\bazel.exe`
    - Mac OS/Linux: `/usr/local/bin/bazel`
    - You may also place the Bazel binary on your `PATH` environment variable if you prefer
  - Load your assignment repository by importing a Bazel project in IntelliJ IDEA
    - Note: Select to load the top level directory of the entire repository
  - Click through until the repository is loaded (default settings are fine to use)
  - Open the `Project Settings` under the `File` menu in IntelliJ IDEA and set the JDK IntelliJ
    should use to JDK 11.

Part 5: Making Your First Commit
--------------------------------
Now that you have properly configured your system, let's start making some changes.

- Identify yourself within your repository
  - Open the `name.md` file in the top level root of the repository
  - Replace the contents with your name
  - Commit the addition and push the change to GitHub
  - This is how I know who the repository belongs to

Troubleshooting
---------------
For most students, the above instructions should work. However, on some systems, you may receive one
of the following errors. Follow the instructions below to fix them. If you receive an error that
isn't listed here, please reach out to me and we can look into it together.

**Error: Deriving targets from project directories failed**
- Open the project view file within IntelliJ: `Bazel | Project | Open Project View File`
- Replace the contents of the file with the following:

  ```
  derive_targets_from_directories: false
  directories:
    .
  targets:
    //...
  ```

- Sync the project once more by clicking the green heart button on the top right of IntelliJ IDEA

**Windows Specific Issues**
If you use Windows and are unable to sync properly, the
[Bazel website has a guide](https://docs.bazel.build/versions/master/windows.html)
specifically for fixing issues on Windows. Specifically, the following instructions have worked for
students in the past:

- Open the `.bazelrc` file from the top-level root of the repository
- Add the following contents to the file:

  ```
  startup --output_user_root=C:/tmp
  startup --windows_enable_symlinks
  build --enable_runfiles

  ```

- Sync the project once more by clicking the green heart button on the top right of IntelliJ IDEA
