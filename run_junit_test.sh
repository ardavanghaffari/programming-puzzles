#!/bin/bash -e

mkdir -p target
javac -Xdiags:verbose -d target -cp "${PROJECT_ROOT}/lib/*" ${1}.java ${1}Test.java
java -cp "${PROJECT_ROOT}/lib/*" org.junit.platform.console.ConsoleLauncher execute --class-path target --select-class ${1}Test
