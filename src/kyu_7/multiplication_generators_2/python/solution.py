def generator(a):
    x = 1
    while True:
        yield f'{a} x {x} = {a*x}'
        x += 1