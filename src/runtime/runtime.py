"""
Code for Runtime Environment
"""
codeList = []
intList = []
scope = []
global d
d = {}
start = 0
iterator = 0

def main():
    fileName = open("intermediate_code.txt", "r")
    codeList  = fileName.read().split("\n")
    print(codeList)
    global iterator
    while(iterator < len(codeList)):
        execute(iterator,d,codeList)
        iterator = iterator + 1

def set_iterator(i):
    global iterator
    iterator = i


def execute(iterator,d,codeList):
    global start
    ac = 0
    code = codeList[iterator]
    s = code.split(" ")
    if s[0] == 'START':
        start = 1

    if start == 1:
        if s[0] == 'DECL':
            if d.get(s[2]):
                print("Already Declared")
            else:
                d[s[2]]=0

        if s[0] == 'ASGN':
            if s[1] in d.keys():
                try:
                    d[s[1]]=int(s[2])
                except:
                    d[s[1]]=d[s[2]]
            elif s[2] in d.keys():
                try:
                    d[s[1]]=int(s[2])
                except:
                    d[s[1]]=d[s[2]]
            else:
                print("Undeclared variable")

        if s[0] == 'ADD':
            
            if check(s[1],d) and check(s[2],d) and check(s[3],d):
                d[s[3]]=d[s[1]]+d[s[2]]
            else:
                print("Undeclared variable")

        if s[0] == 'SUB':
            if check(s[1],d) and check(s[2],d) and check(s[3],d):
                d[s[3]]=d[s[1]]-d[s[2]]
                print(d[s[3]])
            else:
                print("Undeclared variable")

        if s[0] == 'MUL':
            if check(s[1],d) and check(s[2],d) and check(s[3],d):
                d[s[3]]=d[s[1]]*d[s[2]]
                print(d[s[3]])
            else:
                print("Undeclared variable")

        if s[0] == 'DIV':
            if check(s[1],d) and check(s[2],d) and check(s[3],d):
                d[s[3]]=d[s[1]]/d[s[2]]
                print(d[s[3]])
            else:
                print("Undeclared variable")

        if s[0] == 'MOD':
            if check(s[1],d) and check(s[2],d) and check(s[3],d):
                d[s[3]]=d[s[1]]%d[s[2]]
            else:
                print("Undeclared variable")

        if s[0] == 'PRINT':
            if s[1].startswith("\""):
                print(s[1])
            else:
                print(d[s[1]])

def check(ch, dict):
    if ch in dict.keys():
        return True
    elif int(ch):
        try:
            d[ch]=int(ch)
            return True
        except:
            pass
    else:
        return False

main()