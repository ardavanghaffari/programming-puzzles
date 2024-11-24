#!/bin/bash -e

# Use extended globs so we can exclude directories not containing tests, e.g. the lib dir
shopt -s extglob

cd $(dirname $0)
for d in ./!(lib)/; do (cd "$d" && ./test.sh); done

echo Success
