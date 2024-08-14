def solve(arr):
    return [sum(idx == ord(val.lower()) - 96 for idx, val in enumerate(word, 1)) for word in arr]