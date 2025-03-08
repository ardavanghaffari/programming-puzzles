#!/bin/bash -e

cd $(dirname $0)
PYTHONPATH=../common python3 test_min_height_bst.py
