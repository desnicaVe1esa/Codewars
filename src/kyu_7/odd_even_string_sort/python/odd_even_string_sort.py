def sort_my_string(s):
    even_characters = ''
    odd_characters = ''
    for i in range(len(s)):
        if i % 2 == 0:
            even_characters += s[i]
        else:
            odd_characters += s[i]
    return even_characters + ' ' + odd_characters