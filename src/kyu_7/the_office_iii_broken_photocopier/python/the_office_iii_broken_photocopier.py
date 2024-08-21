def broken(inp):
    result = ''
    for char in inp:
        if char == '0':
            result += "1"
        else:
            result += "0"
    return result