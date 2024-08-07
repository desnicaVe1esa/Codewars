from gmpy2 import mpz

def sum_strings(x, y):
    return str(mpz(x or '0') + mpz(y or '0'))