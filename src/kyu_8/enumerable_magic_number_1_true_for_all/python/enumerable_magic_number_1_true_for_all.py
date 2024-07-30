def _all(seq, fun):
    for num in seq:
        if not fun(num):
            return False
    return True