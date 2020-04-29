#!/bin/sh

java -jar MADS.jar "$1"
echo "OUTPUT"
python3 runtime.py "$1"
