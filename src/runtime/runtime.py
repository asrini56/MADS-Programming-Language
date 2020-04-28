codeList = []
intList = []
scope = []
value_map = {}
variable_map = {}
iterator = 0
expr_stack = []


def iterate_code(code_list, end_inst):
    global iterator
    while iterator < end_inst:
        code_line = code_list[iterator]
        token = code_line.split(" ")
        if token[0] == 'ENDWHILE':
            return
        execute(code_list)
        iterator += 1


def main():
    file_name = open("intermediate.imc", "r")
    code_list = file_name.read().split("\n")
    global iterator
    iterate_code(code_list, len(code_list))


def set_iterator(i):
    global iterator
    iterator = i


def default_value(data_type):
    if data_type == "INT":
        return 0
    elif data_type == "FLOAT":
        return 0.0
    elif data_type == "BOOL":
        return True
    elif data_type == "STRING":
        return ""


def check_data_type(data_type, value):
    if data_type == "INT":
        try:
            int(value)
            return True
        except:
            pass
    elif data_type == "FLOAT":
        try:
            float(value)
            return True
        except:
            pass
    elif data_type == "BOOL":
        try:
            bool(value.capitalize())
            return True
        except:
            pass
    elif data_type == "STRING" and value.startswith("\""):
        return True
    return False


def typecast(data_type, value):
    try:
        if data_type == "INT":
            return int(value)
        elif data_type == "FLOAT":
            return float(value)
        elif data_type == "BOOL":
            return bool(value.capitalize())
        elif data_type == "STRING":
            return value
    except:
        print(f"Unable to typecast {value} to {data_type} datatype")


def execute_declare(token):
    global variable_map
    if variable_map.get(token[2]):
        print(f"Already Declared variable {token[2]}")
    else:
        variable_map[token[2]] = token[1]
        value_map[token[2]] = default_value(token[1])


def execute_assign(token):
    global variable_map
    if token[1] in variable_map.keys():
        if token[2] in variable_map.keys():
            value = value_map[token[2]]
        else:
            value = token[2]
        if check_data_type(variable_map[token[1]], value):
            value = typecast(variable_map[token[1]], value)
            value_map[token[1]] = value
        else:
            print(f"Datatype of {token[1]} and {token[2]} does not match. Or {token[2]} not declared.")
    else:
        print(f"Undeclared variable {token[1]}")


def execute_print(token):
    if token[1].startswith("\""):
        print(token[1])
    elif token[1] in variable_map.keys():
        print(value_map[token[1]])
    else:
        print(f"Undeclared variable {token[1]}")


def execute_pull(token):
    if token[1] in variable_map.keys():
        expr_stack.append(value_map[token[1]])
    else:
        print(f"Undeclared variable {token[1]}")


def execute_store(token):
    if token[1] in variable_map.keys():
        value = expr_stack.pop()
        if check_data_type(variable_map[token[1]], value):
            value_map[token[1]] = value
        else:
            print(f"Datatype of {token[1]} and {token[2]} does not match")
    else:
        print(f"Undeclared variable {token[1]}")


def execute_expression(token):
    global expr_stack
    temp1 = expr_stack.pop()
    temp2 = expr_stack.pop()
    result = 0
    if token[0] == 'ADD':
        result = temp2 + temp1
    elif token[0] == 'SUB':
        result = temp2 - temp1
    elif token[0] == 'MUL':
        result = temp2 * temp1
    elif token[0] == 'DIV':
        result = temp2 / temp1
    elif token[0] == 'MOD':
        result = temp2 % temp1
    expr_stack.append(result)


def execute_condition(token):
    global expr_stack
    temp1 = expr_stack.pop()
    temp2 = True
    if token[0] != 'NOT':
        temp2 = expr_stack.pop()
    result = True
    if token[0] == 'NOT':
        result = (not temp1)
    elif token[0] == 'EQL':
        result = (temp2 == temp1)
    elif token[0] == 'NOTEQL':
        result = (temp2 != temp1)
    elif token[0] == 'SML':
        result = (temp2 < temp1)
    elif token[0] == 'SMLEQL':
        result = (temp2 <= temp1)
    elif token[0] == 'GTR':
        result = (temp2 > temp1)
    elif token[0] == 'GTREQL':
        result = (temp2 >= temp1)
    elif token[0] == 'AND':
        result = (temp2 and temp1)
    elif token[0] == 'OR':
        result = (temp2 or temp1)
    expr_stack.append(result)


def execute_ternary(code_list):
    # empty
    pass


def execute_if_loop(code_list):
    # empty
    pass


def execute_while_loop(code_list):
    global iterator
    cndt_line = iterator
    iterator += 2
    code_line = code_list[iterator]
    token = code_line.split(" ")
    while token[0] != 'CNDTEND':
        execute(code_list)
        iterator += 1
        code_line = code_list[iterator]
        token = code_line.split(" ")
    cndt = expr_stack.pop()
    iterator += 1
    # cndt true
    end_inst = len(code_list)
    if cndt:
        while True:
            code_line = code_list[iterator]
            token = code_line.split(" ")
            if token[0] != 'ENDWHILE':
                execute(code_list)
                iterator += 1
            elif token[0] == 'ENDWHILE':
                end_inst = iterator
                iterator = cndt_line
                break
    else:
        no_of_while = 0
        code_line = code_list[iterator]
        token = code_line.split(" ")
        while no_of_while == 0 and token[0] != 'ENDWHILE':
            iterator += 1
            code_line = code_list[iterator]
            token = code_line.split(" ")
            if token[0] == 'WHILE':
                no_of_while += 1
            elif token[0] == 'ENDWHILE' and no_of_while > 0:
                no_of_while -= 1

    iterate_code(code_list, end_inst)


def execute_for_loop(code_list):
    # empty
    pass


def execute(code_list):
    global value_map
    global variable_map
    global expr_stack
    global iterator
    code_line = code_list[iterator]
    token = code_line.split(" ")
    expr_token = ["ADD", "SUB", "MUL", "DIV", "MOD"]
    rltn_expr_token = ["EQL", "NOTEQL", "SML", "GTR", "SMLEQL", "GTREQL", "AND", "OR", "NOT"]
    if token[0] == 'START':
        # Start of IC
        pass

    elif token[0] == 'DECL':
        execute_declare(token)

    elif token[0] == 'ASGN':
        execute_assign(token)

    elif token[0] == 'PULL':
        execute_pull(token)

    elif token[0] == 'STORE':
        execute_store(token)

    elif token[0] == 'NUM':
        expr_stack.append(int(token[1]))

    elif token[0] == 'FLOAT':
        expr_stack.append(float(token[1]))

    elif token[0] == 'BOOL':
        expr_stack.append(bool(token[1].capitalize()))

    elif token[0] == 'PRINT':
        execute_print(token)

    elif token[0] in expr_token:
        execute_expression(token)

    elif token[0] in rltn_expr_token:
        execute_condition(token)

    elif token[0] == 'TRN':
        execute_ternary(code_list)

    elif token[0] == 'IFLOOP':
        execute_if_loop(code_list)

    elif token[0] == 'WHILE':
        execute_while_loop(code_list)
    #elif token[0] == 'ENDWHILE':


    elif token[0] == 'FORLOOP':
        execute_for_loop(code_list)

    elif token[0] == 'END':
        # empty
        pass


def check(ch, dict):
    if ch in dict.keys():
        return True
    elif int(ch):
        try:
            value_map[ch] = int(ch)
            return True
        except:
            pass
    else:
        return False


def get_scope():
    temp = scope.pop()
    scope.append(temp)
    return temp


main()
