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
        -s|--solutions        The path to the git repository where solutions are available

    Optional arguments:
        -h|--help             Show this help
"
}

function main() {
    positional=()
    while [[ $# -gt 0 ]]; do
        key="$1"
        case $key in
            -s|--solutions)
                solutions_path="$2"
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

    if [[ -z "$solutions_path" ]]; then
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

        files+=("python/src/app/calculator.py")
        files+=("python/src/util/linkedlist.py")
        files+=("python/src/util/queue.py")
        files+=("python/src/util/splaylist.py")
        files+=("python/src/util/stack.py")
    elif [[ $program == 3 ]]; then
        files+=("java/src/edu/berkeley/cs/sort/Insertion.java")
        files+=("java/src/edu/berkeley/cs/sort/Merge.java")
        files+=("java/src/edu/berkeley/cs/sort/Quick.java")
        files+=("java/src/edu/berkeley/cs/sort/Selection.java")
        files+=("java/src/edu/berkeley/cs/sort/Shell.java")

        files+=("python/src/sort/insertion.py")
        files+=("python/src/sort/merge.py")
        files+=("python/src/sort/quick.py")
        files+=("python/src/sort/selection.py")
        files+=("python/src/sort/shell.py")
    elif [[ $program == 4 ]]; then
        files+=("java/src/edu/berkeley/cs/app/scheduling/FiFoScheduler.java")
        files+=("java/src/edu/berkeley/cs/app/scheduling/RoundRobinScheduler.java")
        files+=("java/src/edu/berkeley/cs/app/scheduling/ShortestJobFirstScheduler.java")
        files+=("java/src/edu/berkeley/cs/util/MinHeap.java")
        files+=("java/src/edu/berkeley/cs/util/TreeMap.java")

        files+=("python/src/app/scheduling/fifo_scheduler.py")
        files+=("python/src/app/scheduling/round_robin_scheduler.py")
        files+=("python/src/app/scheduling/shortest_job_first_scheduler.py")
        files+=("python/src/util/minheap.py")
        files+=("python/src/util/treemap.py")
    elif [[ $program == 5 ]]; then
        files+=("java/src/edu/berkeley/cs/graph/BreadthFirstSearch.java")
        files+=("java/src/edu/berkeley/cs/graph/DepthFirstSearch.java")
        files+=("java/src/edu/berkeley/cs/graph/Graph.java")
        files+=("java/src/edu/berkeley/cs/util/HashMap.java")
        files+=("java/src/edu/berkeley/cs/util/HashSet.java")

        files+=("python/src/graph/breadth_first_search.py")
        files+=("python/src/graph/depth_first_search.py")
        files+=("python/src/graph/graph.py")
        files+=("python/src/util/hashmap.py")
        files+=("python/src/util/hashset.py")
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

        files+=("python/src/graph/directed_graph.py")
        files+=("python/src/graph/directed_cycle.py")
        files+=("python/src/graph/depth_first_order.py")
        files+=("python/src/graph/topological_sort.py")
        files+=("python/src/graph/strongly_connected_components.py")
        files+=("python/src/graph/union_find.py")
        files+=("python/src/graph/minimum_spanning_tree.py")
        files+=("python/src/graph/shortest_path.py")
        files+=("python/src/graph/multiple_source_shortest_path.py")
    elif [[ $program == 7 ]]; then
        files+=("java/src/edu/berkeley/cs/graph/ShortestPath.java")
        files+=("java/src/edu/berkeley/cs/graph/MultipleSourceShortestPath.java")
        files+=("java/src/edu/berkeley/cs/util/RadixTrieMap.java")
        files+=("java/src/edu/berkeley/cs/app/PlagiarismDetector.java")

        files+=("python/src/graph/shortest_path.py")
        files+=("python/src/graph/multiple_source_shortest_path.py")
        files+=("python/src/util/radix_trie_map.py")
        files+=("python/src/app/plagiarism_detector.py")
    else
        log_error "invalid program number"
    fi

    for file in "${files[@]}"; do
        directory=solutions/program$program
        mkdir -p $directory
        cp $solutions_path/$file $directory
    done
}

main "$@"
