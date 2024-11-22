def gcd(a, b):
    if a == 0:
        return b
    return gcd(b % a, a)

def gcdi(a, b):
    a, b = abs(a), abs(b)
    return gcd(a, b)

def lcmu(a, b):
    a, b = abs(a), abs(b)
    return a * b / gcd(a, b)

def som(a, b):
    return a + b

def maxi(a, b):
    return max(a, b)

def mini(a, b):
    return min(a, b)

def oper_array(fct, arr, init):
    val = init
    result = []
    for i, ele in enumerate(arr):
        val = fct(val, ele)
        result.append(val)
    return result