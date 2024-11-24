#!/bin/bash -e

mkdir -p target
javac -d target -cp ../lib/junit-platform-console-standalone-1.11.0.jar ${1}.java ${1}Test.java
java -jar ../lib/junit-platform-console-standalone-1.11.0.jar execute \
    --class-path target \
    --select-class ${1}Test
