#!/bin/bash
# Don't use the -e option so we get to check the exit status of the last executed test
# and exit with a proper message.

cd $(dirname $0)
export PROJECT_ROOT=$(pwd)

readarray -d '' tests < <(find . -type f -name 'test.sh' -print0)

for test in "${tests[@]}"; do
    "$test"

    if [ $? -ne 0 ]; then
        echo "'$test' failed"
        exit 1
    fi
done

echo Success
