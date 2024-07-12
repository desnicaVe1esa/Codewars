def remove(st, n):
    for i in range(n):
        st = st.replace("!", '', 1)
    return st