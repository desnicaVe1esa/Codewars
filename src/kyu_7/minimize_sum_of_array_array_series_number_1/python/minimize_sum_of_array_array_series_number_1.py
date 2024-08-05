def min_sum(arr):
    arr = sorted(arr)
    return sum(arr[i] * arr[-i - 1] for i in range(len(arr) // 2))
