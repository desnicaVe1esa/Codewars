def make_a_window(n):
    top     = '-' * (2*n+3)
    middle  = f"|{ '-'*n }+{ '-'*n }|"
    glasses = [f"|{ '.'*n }|{ '.'*n }|"] * n
    return '\n'.join([top, *glasses, middle, *glasses, top])