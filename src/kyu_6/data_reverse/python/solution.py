def data_reverse(data):
    rev=[]
    fin=[]
    for i in range(0,len(data),8):
        rev.append(data[i:i + 8])
    for i in reversed(rev):
        fin.extend(i)
    return fin