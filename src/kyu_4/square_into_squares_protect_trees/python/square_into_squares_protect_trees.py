def decompose(n, a=None):
    if a == None: a = n*n
    if a == 0: return []
    for m in range(min(n-1, int(a ** .5)), 0, -1):
        sub = decompose(m, a - m*m)
        if sub != None: return sub + [m]