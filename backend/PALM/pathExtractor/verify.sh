#!/bin/bash
# goto the directory of the script
pushd "$(dirname "$0")"
pushd ../extracted-paths/flattened
# run javac -d /tmp *.i.java for i=0...20 and expose compile errors
for i in {0..20}; do
    echo $i
    javac -d /tmp *.$i.java
done
popd
popd