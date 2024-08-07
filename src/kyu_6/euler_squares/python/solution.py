def create_euler_square(n): ## Assume n is odd.
    return [[(i + j) % n + 1 for j in range(n)] for i in range(n)], \
        [[(2 * i + j) % n + 1 for j in range(n)] for i in range(n)]