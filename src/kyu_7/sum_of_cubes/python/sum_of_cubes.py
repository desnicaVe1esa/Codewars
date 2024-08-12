def sum_cubes(n):
    result = 0;
    for i in range(n + 1):
        result += i * i * i
    return result