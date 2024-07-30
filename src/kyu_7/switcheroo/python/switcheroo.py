def switcheroo(s):
    result = ''
    for letter in s:
        if letter == 'b':
            result += 'a'
        elif letter == 'a':
            result += 'b'
        else:
            result += letter
    return result