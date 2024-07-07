def validate(n):
    digits = [int(x) for x in str(n)]
    even = [x*2 if x*2 <= 9 else x*2 - 9 for x in digits[-2::-2]]
    odd  = [x for x in digits[-1::-2]]
    return (sum(even + odd)%10) == 0