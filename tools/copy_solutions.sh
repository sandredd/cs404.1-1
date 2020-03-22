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
        -r|--repo             The path to the git repository where solutions are available

    Optional arguments:
        -h|--help             Show this help
"
}

function main() {
    positional=()
    while [[ $# -gt 0 ]]; do
        key="$1"
        case $key in
            -r|--repo)
                repo_path="$2"
                shift; shift
                ;;
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

    if [[ -z "$repo_path" ]]; then
        log_error "no solutions path provided"
    elif [[ -z "$program" ]]; then
        log_error "no program number provided"
    fi

    files=()
    if [[ $program == 1 ]]; then
        files+=("shell/info.sh")
        files+=("shell/seq.sh")
        files+=("shell/stdio.sh")
        files+=("shell/sum.sh")
    elif [[ $program == 2 ]]; then
        files+=("java/src/edu/berkeley/cs/app/Calculator.java")
        files+=("java/src/edu/berkeley/cs/util/LinkedList.java")
        files+=("java/src/edu/berkeley/cs/util/Queue.java")
        files+=("java/src/edu/berkeley/cs/util/SplayList.java")
        files+=("java/src/edu/berkeley/cs/util/Stack.java")
    elif [[ $program == 3 ]]; then
        files+=("java/src/edu/berkeley/cs/sort/Insertion.java")
        files+=("java/src/edu/berkeley/cs/sort/Merge.java")
        files+=("java/src/edu/berkeley/cs/sort/Quick.java")
        files+=("java/src/edu/berkeley/cs/sort/Selection.java")
        files+=("java/src/edu/berkeley/cs/sort/Shell.java")
    elif [[ $program == 4 ]]; then
        files+=("java/src/edu/berkeley/cs/app/scheduling/FiFoScheduler.java")
        files+=("java/src/edu/berkeley/cs/app/scheduling/RoundRobinScheduler.java")
        files+=("java/src/edu/berkeley/cs/app/scheduling/ShortestJobFirstScheduler.java")
        files+=("java/src/edu/berkeley/cs/util/MinHeap.java")
        files+=("java/src/edu/berkeley/cs/util/TreeMap.java")
    elif [[ $program == 5 ]]; then
        files+=("java/src/edu/berkeley/cs/graph/BreadthFirstSearch.java")
        files+=("java/src/edu/berkeley/cs/graph/DepthFirstSearch.java")
        files+=("java/src/edu/berkeley/cs/graph/Graph.java")
        files+=("java/src/edu/berkeley/cs/util/HashMap.java")
        files+=("java/src/edu/berkeley/cs/util/HashSet.java")
    elif [[ $program == 6 ]]; then
        files+=("java/src/edu/berkeley/cs/graph/DirectedGraph.java")
        files+=("java/src/edu/berkeley/cs/graph/DirectedCycle.java")
        files+=("java/src/edu/berkeley/cs/graph/DepthFirstOrderjava")
        files+=("java/src/edu/berkeley/cs/graph/TopologicalSort.java")
        files+=("java/src/edu/berkeley/cs/graph/StronglyConnectedComponents.java")
        files+=("java/src/edu/berkeley/cs/util/UnionFind.java")
        files+=("java/src/edu/berkeley/cs/graph/MinimumSpanningTree.java")
        files+=("java/src/edu/berkeley/cs/graph/ShortestPath.java")
        files+=("java/src/edu/berkeley/cs/graph/MultipleSourceShortestPath.java")
    elif [[ $program == 7 ]]; then
        files+=("java/src/edu/berkeley/cs/graph/ShortestPath.java")
        files+=("java/src/edu/berkeley/cs/graph/MultipleSourceShortestPath.java")
        files+=("java/src/edu/berkeley/cs/util/RadixTrieMap.java")
        files+=("java/src/edu/berkeley/cs/app/PlagiarismDetector.java")
    else
        log_error "invalid program number"
    fi

    for file in "${files[@]}"; do
        directory=solutions/program$program
        mkdir -p $directory
        cp $repo_path/program$program/$file $directory
    done
}

main "$@"
