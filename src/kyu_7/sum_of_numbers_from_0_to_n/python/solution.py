def show_sequence(n):
    if n == 0:
        return str(n) + '=' + str(0)
    elif n < 0:
        return str(n) + '<' + str(0)
    else:
        expression = ""
        result = 0
        for i in range(n + 1):
            expression += str(i) + "+"
            result += i
        return expression[:-1] + " = " + str(result)