def solve(s):
        it = reversed(s.replace(' ',''))
        return ''.join(c if c == ' ' else next(it) for c in s)