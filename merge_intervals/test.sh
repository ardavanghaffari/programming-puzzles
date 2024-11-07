#!/usr/bin/env bash
set -e
cd $(dirname $0)

mkdir -p target
javac -d target -cp ../lib/junit-platform-console-standalone-1.11.0.jar \
    MergeIntervals.java MergeIntervalsTest.java
java -jar ../lib/junit-platform-console-standalone-1.11.0.jar execute \
    --class-path target \
    --select-class MergeIntervalsTest