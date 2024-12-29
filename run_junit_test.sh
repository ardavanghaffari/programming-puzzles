#!/bin/bash -e

mkdir -p target
javac -d target -cp ${PROJECT_ROOT}/lib/junit-platform-console-standalone-1.11.0.jar ${1}.java ${1}Test.java
java -jar ${PROJECT_ROOT}/lib/junit-platform-console-standalone-1.11.0.jar execute \
    --class-path target \
    --select-class ${1}Test
