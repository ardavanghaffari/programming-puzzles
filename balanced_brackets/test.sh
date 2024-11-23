#!/bin/bash -e
cd $(dirname $0)

python3 test_balanced_brackets.py

mkdir -p target
javac -d target -cp ../lib/junit-platform-console-standalone-1.11.0.jar \
    BalancedBrackets.java BalancedBracketsTest.java
java -jar ../lib/junit-platform-console-standalone-1.11.0.jar execute \
    --class-path target \
    --select-class BalancedBracketsTest
