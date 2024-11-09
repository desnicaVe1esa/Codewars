def up_array(a):
    if not a or any(not 0 <= x < 10 for x in a): return
    for i in range(1, len(a)+1):
        a[-i] = (a[-i] + 1) % 10
        if a[-i]: break
    else: a[:0] = [1]
    return a