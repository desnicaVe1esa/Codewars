def isPP(n):
    for i in range(2, int(n**.5) + 1):
        number = n
        times = 0
        while number % i == 0:
            number /= i
            times += 1
            if number == 1:
                return [i, times]
    return None