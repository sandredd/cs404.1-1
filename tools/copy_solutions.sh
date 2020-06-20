#!/usr/bin/env bash

# This script is meant to copy solutions into the appropriate directories for each program. This
# script is not intended to be run by students but only the instructor. If you are a student, please
# ignore this script.

function log_error() {
    echo "error: $1"
    exit
}

function usage() {
    echo "$(basename $0) copies solutions into the appropriate directories for each program.

This script is meant to be used by the instructor. If you are a student, you may ignore this script
entirely.

    Required arguments:
        -p|--program          The program number to copy solutions for

    Optional arguments:
        -h|--help             Show this help
"
}

function main() {
    positional=()
    while [[ $# -gt 0 ]]; do
        key="$1"
        case $key in
            -p|--program)
                program="$2"
                shift; shift
                ;;
            -h|--help)
                usage
                exit
                ;;
            *)
                positional+=("$1")
                shift
                ;;
        esac
    done

    repo_path=$(dirname $(dirname $0))
    if [[ -z "$program" ]]; then
        log_error "no program number provided"
    fi

    files=()
    if [[ $program == "program1" ]]; then
        files+=("java/src/edu/berkeley/cs/app/Calculator.java")
        files+=("java/src/edu/berkeley/cs/util/LinkedList.java")
        files+=("java/src/edu/berkeley/cs/util/Queue.java")
        files+=("java/src/edu/berkeley/cs/util/SplayList.java")
        files+=("java/src/edu/berkeley/cs/util/Stack.java")
    elif [[ $program == "program2" ]]; then
        files+=("java/src/edu/berkeley/cs/sort/Insertion.java")
        files+=("java/src/edu/berkeley/cs/sort/Merge.java")
        files+=("java/src/edu/berkeley/cs/sort/Quick.java")
        files+=("java/src/edu/berkeley/cs/sort/Selection.java")
        files+=("java/src/edu/berkeley/cs/sort/Shell.java")
    elif [[ $program == "program3" ]]; then
        files+=("java/src/edu/berkeley/cs/app/SummableTree.java")
        files+=("java/src/edu/berkeley/cs/app/scheduling/FiFoScheduler.java")
        files+=("java/src/edu/berkeley/cs/app/scheduling/RoundRobinScheduler.java")
        files+=("java/src/edu/berkeley/cs/app/scheduling/ShortestJobFirstScheduler.java")
        files+=("java/src/edu/berkeley/cs/util/MinHeap.java")
        files+=("java/src/edu/berkeley/cs/util/TreeMap.java")
    elif [[ $program == "program4" ]]; then
        files+=("java/src/edu/berkeley/cs/app/SpellChecker.java")
        files+=("java/src/edu/berkeley/cs/graph/BreadthFirstSearch.java")
        files+=("java/src/edu/berkeley/cs/graph/DepthFirstOrder.java")
        files+=("java/src/edu/berkeley/cs/graph/DepthFirstSearch.java")
        files+=("java/src/edu/berkeley/cs/graph/Graph.java")
        files+=("java/src/edu/berkeley/cs/util/HashMap.java")
        files+=("java/src/edu/berkeley/cs/util/HashSet.java")
    elif [[ $program == "program5" ]]; then
        files+=("java/src/edu/berkeley/cs/graph/Cycle.java")
        files+=("java/src/edu/berkeley/cs/graph/DirectedGraph.java")
        files+=("java/src/edu/berkeley/cs/graph/StronglyConnectedComponents.java")
        files+=("java/src/edu/berkeley/cs/graph/TopologicalSort.java")
    elif [[ $program == "program6" ]]; then
        files+=("java/src/edu/berkeley/cs/graph/MinimumSpanningTree.java")
        files+=("java/src/edu/berkeley/cs/graph/MultipleSourceShortestPath.java")
        files+=("java/src/edu/berkeley/cs/graph/ShortestPath.java")
        files+=("java/src/edu/berkeley/cs/util/UnionFind.java")
    elif [[ $program == "program7" ]]; then
        files+=("java/src/edu/berkeley/cs/app/PlagiarismDetector.java")
        files+=("java/src/edu/berkeley/cs/util/RadixTrieMap.java")
    elif [[ $program == "final" ]]; then
        files+=("java/src/edu/berkeley/cs/app/finalproject/DuplicateUsernames.java")
        files+=("java/src/edu/berkeley/cs/app/finalproject/FuzzySearch.java")
        files+=("java/src/edu/berkeley/cs/app/finalproject/HotKeyGenerator.java")
        files+=("java/src/edu/berkeley/cs/app/finalproject/SortChecker.java")
    else
        log_error "invalid program number"
    fi

    for file in "${files[@]}"; do
        directory=solutions/$program
        mkdir -p $directory
        cp $repo_path/$file $directory
    done
}

main "$@"
