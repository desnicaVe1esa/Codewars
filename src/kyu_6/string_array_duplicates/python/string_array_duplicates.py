from itertools import groupby

def dup(arry):
    return ["".join(c for c, grouper in groupby(i)) for i in arry]