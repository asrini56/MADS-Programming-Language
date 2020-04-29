# SER502-Spring2020-Team-12

### Team Members:
* Srinivasan Sundar
* Deepti Paul
* Ashwin Srinivasan
* Madhu Madhavan Sridhar


## Development Environment
Compiler and Runtime was built on Windows and MacOS platform
* Lexer and Parser - ANTLR 4.8
* Compiler - Java 8
* Runtime - Python 3

## Installation Instruction
1. Install Python 3
2. Install Java SE Runtime 1.8 
3. Git clone this repository - https://github.com/Srini2305/SER502-Spring2020-Team12.git

## Instruction to run .mads program file
### For MacOS/Unix
1. Go to SER502-Spring2020-Team12/src/ location and save your .mads file
2. Execute the following command in terminal - 
```shell script
sh ./execute.sh <program_name.mads>
```
execute.sh has following commands.
```shell script
# For compiling the program file and generate intermediate code
java -jar MADS.jar "$1"
# For running the intermediate code and display the result
python3 runtime.py "$1"
```
- Output will be displayed in the terminal

### For Window
1. Go to SER502-Spring2020-Team12/src/ location and save your .mads file
2. Execute the following command in command prompt - 
```shell script
java -jar MADS.jar <program_name.mads>
python runtime/runtime.py <program_name.mads>
```
- Output will be displayed in the command prompt.

## YouTube link
https://youtu.be/kQUIcc1T7X4

