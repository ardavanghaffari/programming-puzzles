#!/bin/bash -e

cd $(dirname $0)
python3 test_balanced_brackets.py
source ../run_junit_test.sh BalancedBrackets
