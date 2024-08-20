def spoonerize(words):
    strings = words.split()
    s1 = strings[1][0] + strings[0][1:]
    s2 = strings[0][0] + strings[1][1:]
    return s1 + " " + s2