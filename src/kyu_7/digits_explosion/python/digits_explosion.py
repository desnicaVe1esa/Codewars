def explode(s):
    return ''.join(c * int(c) for c in s)