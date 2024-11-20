def adj_arr(arr):
    new_arr = []
    i = 0
    while i < len(arr):
        j = 0
        str_i = list(str(arr[i]))
        while j < len(str_i):
            if str_i[j] == '7':
                str_i[j] = '3'
            elif str_i[j] == '3':
                str_i[j] = '7'
            j += 1
        new_arr.append(int(''.join(str_i)))
        i += 1
    return new_arr


def sort_twisted37(arr):
    return adj_arr(sorted(adj_arr(arr)))