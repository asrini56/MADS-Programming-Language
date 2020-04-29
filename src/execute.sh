#!/bin/sh

java -jar MADS.jar "$1"
python3 runtime.py "$1"
