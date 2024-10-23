#!/usr/bin/env bash

for d in ./*/ ; do (cd "$d" && ./test.sh) ; done