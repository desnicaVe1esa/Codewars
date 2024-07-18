def add(num1, num2):
    result = ""
    while num1 + num2:
        num1, p = divmod(num1,10)
        num2, q = divmod(num2,10)
        result = str(p + q) + result
    return int(result or'0')