#!/bin/bash -e

cd $(dirname $0)
PYTHONPATH=../common python3 test_bst_construction.py
