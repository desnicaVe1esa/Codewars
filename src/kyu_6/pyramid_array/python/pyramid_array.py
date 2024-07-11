def pyramid(n):
    result = []
    if n is None or n == 0:
        return result

    for n in range(1, n + 1):
        result.append([1] * n)

    return result