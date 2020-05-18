#!/usr/bin/env bash

function join() {
    local IFS="$1"
    shift
    echo "$*"
}

function main() {
    java_blessed=(
        "java.util.Arrays"
        "java.util.Iterator"
        "java.util.NoSuchElementException"
        "java.util.Objects"
        "java.util.Random"
        "java.util.concurrent.Callable"
        "java.util.concurrent.ExecutionException"
        "java.util.concurrent.ExecutorService"
        "java.util.concurrent.Future"
        "java.util.concurrent.LinkedBlockingQueue"
        "java.util.concurrent.ThreadPoolExecutor"
        "java.util.concurrent.TimeUnit"
        "java.util.concurrent.TimeoutException"
    )

    error_message="The following imports are invalid (you may not use the standard library):"
    gitroot=$(git rev-parse --show-toplevel)
    cd $gitroot

    java_invalid="$(git grep 'import.*java.util.*' java | grep -Ev $(join '|' ${java_blessed[@]}))"
    if [[ $java_invalid != "" ]]; then
        echo "$error_message"
        echo "$java_invalid"
        exit 1
    fi
}

main "$@"
