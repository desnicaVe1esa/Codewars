def compute_depth(n):
    target_digits = set('0123456789')
    seen_digits = set()

    i = 1
    while len(seen_digits) != 10:
        product = str(i * n)
        for digit in product:
            seen_digits.add(digit)

        if seen_digits == target_digits:
            return i

        i += 1
    return i