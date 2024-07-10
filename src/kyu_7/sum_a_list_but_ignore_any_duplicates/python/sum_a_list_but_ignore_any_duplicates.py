def sum_no_duplicates(l):
    prepared = {}
    result = 0
    for num in l:
        if num in prepared:
            prepared[num] += 1
        else:
            prepared[num] = 1
    for num in prepared:
        if prepared[num] == 1:
            result += num
    return result