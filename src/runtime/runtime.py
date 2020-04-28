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
    file_name = open("ifLoop.imc", "r")
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
