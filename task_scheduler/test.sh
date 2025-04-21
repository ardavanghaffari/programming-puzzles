#!/bin/bash -e

cd $(dirname $0)
source ${PROJECT_ROOT:=..}/run_junit_test.sh TaskScheduler
