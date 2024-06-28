def promenade(choices):
    l, m = (1, 0)
    r, s = (0, 1)
    for choice in choices:
        if choice == 'L': l, m = l + r, m + s
        elif choice == 'R': r, s = l + r, m + s
    return l + r,m + s