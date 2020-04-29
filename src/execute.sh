#!/bin/sh

java -jar MADS.jar "$1"
python3 runtime/runtime.py "$1"
