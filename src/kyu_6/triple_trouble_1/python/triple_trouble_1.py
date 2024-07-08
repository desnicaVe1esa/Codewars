def triple_double(num1, num2):
    n1str = str(num1)
    n2str = str(num2)
    for i in range(10):
        n = str(i)
        if n1str.count(n  *  3) > 0 and n2str.count(n  *  2) > 0:
            return 1
    return 0