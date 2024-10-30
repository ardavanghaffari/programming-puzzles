#!/usr/bin/env bash
shopt -s extglob
cd $(dirname $0)

for d in ./!(lib)/; do (cd "$d" && ./test.sh); done
