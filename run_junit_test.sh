#!/bin/bash -e

class_path="${PROJECT_ROOT}/lib/*"

mkdir -p target
javac -Xdiags:verbose -d target -cp "$class_path" ${1}.java ${1}Test.java
java -cp "$class_path" org.junit.platform.console.ConsoleLauncher execute \
    --class-path target \
    --select-class ${1}Test
