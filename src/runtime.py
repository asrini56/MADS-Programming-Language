import sys

codeList = []
intList = []
scope = []
value_map = {}
variable_map = {}
iterator = 0
expr_stack = []


def iterate_code(code_list, end_inst):
    global iterator
    global value_map
    terminal_token = ["ENDWHILE", "ENDFORLOOP", "ENDFOR"]
    while iterator < end_inst:
        code_line = code_list[iterator]
        token = code_line.split(" ")
        if token[0] in terminal_token:
            return
        execute(code_list)
        iterator += 1


def main(argv):
    file1=argv.replace(".mads",".imc")
    file_name = open(file1, "r")
    code_list = file_name.read().split("\n")
    global iterator
    iterate_code(code_list, len(code_list))


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


def execute_print(code_list):
    token = code_list[iterator].split(" ")
    if token[1].startswith("\""):
        value = code_list[iterator]
        value = value[5:].replace('\"', '').replace('\\n', '\n')
        print(value)
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
            print(f"Datatype of {token[1]} and {value} does not match")
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
        result = temp2 // temp1
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
    global iterator
    iterator += 2
    code_line = code_list[iterator]
    token = code_line.split(" ")
    while token[0] != 'CNDTEND':
        execute(code_list)
        iterator += 1
        code_line = code_list[iterator]
        token = code_line.split(" ")
    cndt = expr_stack.pop()
    end_inst = len(code_list)
    
    if str(cndt) == 'True':
        checker = 0
        while True:
            code_line = code_list[iterator]
            token = code_line.split(" ")
            if token[0] == 'TRNSTMT':
                iterator += 1
            if token[0] != 'TRNSTMTEND':
                if checker == 0:
                    execute(code_list)
                    iterator += 1
                elif checker == 1:
                    iterator += 1
            if token[0] == 'TRNSTMTEND':
                checker = 1
                iterator += 1
            if token[0] == 'TRNEND':
                end_inst = iterator
                break
    else:
        checker = 0
        while True:
            code_line = code_list[iterator]
            token = code_line.split(" ")
            if token[0] != 'TRNSTMTEND':
                if checker == 0:
                    iterator +=1
                elif checker == 1:
                    execute(code_list)
                    iterator += 1
            if token[0] == 'TRNSTMTEND':
                checker = 1
                iterator += 1
            if token[0] == 'TRNEND':
                end_inst = iterator
                break
    iterate_code(code_list, end_inst)
    

def execute_if_loop(code_list):
    global iterator
    iterator += 2
    code_line = code_list[iterator]
    token = code_line.split(" ")
    while token[0] != 'CNDTEND':
        execute(code_list)
        iterator += 1
        code_line = code_list[iterator]
        token = code_line.split(" ")
    cndt = expr_stack.pop()
    checker = 0
    end_inst = len(code_list)
    
    if str(cndt) == "True":
        while True:
            code_line = code_list[iterator]
            token = code_line.split(" ")
            if token[0] == 'ENDIF':
                end_inst = iterator
                break
            if token[0] != 'ELSE':
                if checker == 0:
                    execute(code_list)
                    iterator += 1
                if checker == 1:
                    if token[0] !='ENDIF':
                        iterator+=1
                    elif token[0] == 'ENDIF':
                        end_inst = iterator
                        break
            elif token[0] == 'ELSE':
                checker = 1
                iterator +=1  
                
    else:
        checked = 0
        while True:
            code_line = code_list[iterator]
            token = code_line.split(" ")
            if token[0] == 'ENDIF':
                end_inst = iterator
                break
            if token[0] =='ELSE':
                checked = 1
                iterator += 1
            if token[0] !='ENDIF':
                if checked == 0:
                    iterator +=1
                elif checked == 1:
                    execute(code_list)
                    iterator += 1
            if token[0] == 'ENDIF':
                end_inst = iterator
                break
    
    iterate_code(code_list, end_inst)


def execute_while_loop(code_list):
    global iterator
    iterator += 1
    cndt_start = code_list.index("CNDT", iterator) + 1
    cndt_end = code_list.index("CNDTEND", iterator)
    iterate_code(code_list, cndt_end)
    iterate_code(code_list, cndt_end)
    cndt = expr_stack.pop()
    while_body_start = cndt_end + 1
    no_of_while = 1
    while_end = iterator
    code_line = code_list[iterator]
    token = code_line.split(" ")
    while not(no_of_while == 0 and token[0] == 'ENDWHILE'):
        while_end += 1
        token = code_list[while_end].split(" ")
        if token[0] == 'WHILE':
            no_of_while += 1
        elif token[0] == 'ENDWHILE' and no_of_while > 0:
            no_of_while -= 1
    while cndt:
        iterator = while_body_start
        iterate_code(code_list, while_end)
        iterator = cndt_start
        iterate_code(code_list, cndt_end)
        cndt = expr_stack.pop()
    iterator = while_end


def execute_for_loop(code_list):
    global iterator
    iterator += 1
    token = code_list[iterator].split(" ")
    var_name = token[2]
    cndt_start = code_list.index("CNDT", iterator) + 1
    cndt_end = code_list.index("CNDTEND", iterator)
    iterate_code(code_list, cndt_end)
    cndt = expr_stack.pop()
    inc_start = iterator + 2
    for_body_start = code_list.index("FORINCEND", iterator) + 1
    # find end for loop
    no_of_for = 1
    for_end = iterator
    code_line = code_list[iterator]
    token = code_line.split(" ")
    while not(no_of_for == 0 and token[0] == 'ENDFOR'):
        for_end += 1
        token = code_list[for_end].split(" ")
        if token[0] == 'FOR':
            no_of_for += 1
        elif token[0] == 'ENDFOR' and no_of_for > 0:
            no_of_for -= 1
    while cndt:
        iterator = for_body_start
        iterate_code(code_list, for_end)
        iterator = inc_start
        iterate_code(code_list, for_body_start)
        iterator = cndt_start
        iterate_code(code_list, cndt_end)
        cndt = expr_stack.pop()
    iterator = for_end
    variable_map.pop(var_name)
    value_map.pop(var_name)


def get_range_value(code_list):
    token = code_list[iterator].split(" ")
    if token[0] == 'PULL' and token[1] in variable_map.keys():
        return value_map[token[1]]
    elif token[0] == 'NUM':
        return int(token[1])
    else:
        print(f"Undeclared variable {token[1]}")
        return 0


def execute_for_range(code_list):
    global iterator
    iterator += 1
    code_line = code_list[iterator]
    token = code_line.split(" ")
    var_name = token[2]
    if token[2] not in variable_map.keys():
        execute_declare(token)
    iterator += 2
    temp1 = get_range_value(code_list)
    iterator += 3
    temp2 = get_range_value(code_list)
    value_map[var_name] = temp1
    iterator += 2
    cndt_line = iterator

    no_of_for = 0
    code_line = code_list[iterator]
    temp_iter = iterator
    token = code_line.split(" ")
    while not(no_of_for == 0 and token[0] == 'ENDFOR'):
        temp_iter += 1
        token = code_list[temp_iter].split(" ")
        if token[0] == 'FOR':
            no_of_for += 1
        elif token[0] == 'ENDFOR' and no_of_for > 0:
            no_of_for -= 1
    for i in range(temp1, temp2):
        iterator = cndt_line
        iterate_code(code_list, temp_iter)
        value_map[var_name] = i + 1


def execute_increment(token):
    global variable_map
    if token[1] in variable_map.keys():
        value_map[token[1]] += 1
    else:
        print(f"Undeclared variable {token[1]}")


def execute_decrement(token):
    global variable_map
    if token[1] in variable_map.keys():
        value_map[token[1]] -= 1
    else:
        print(f"Undeclared variable {token[1]}")


def execute(code_list):
    global value_map
    global variable_map
    global expr_stack
    global iterator
    code_line = code_list[iterator]
    token = code_line.split(" ")
    expr_token = ["ADD", "SUB", "MUL", "DIV", "MOD"]
    rltn_expr_token = ["EQL", "NOTEQL", "SML", "GTR", "SMLEQL", "GTREQL", "AND", "OR", "NOT"]
    terminal_token = ["CNDTEND", "ENDWHILE", "ENDFORLOOP", "TRNEND", "TRNSTMTEND", "ENDIF", "ENDFOR", "FORINCEND", "RANGEEND", "START", "END"]
    if token[0] in terminal_token:
        return value_map

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
        execute_print(code_list)

    elif token[0] == 'INC':
        execute_increment(token)

    elif token[0] == 'DEC':
        execute_decrement(token)

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

    elif token[0] == 'FORLOOP':
        if code_list[iterator+2].startswith("RANGE"):
            execute_for_range(code_list)
        else:
            execute_for_loop(code_list)


if __name__ == "__main__":
   main(sys.argv[1])
