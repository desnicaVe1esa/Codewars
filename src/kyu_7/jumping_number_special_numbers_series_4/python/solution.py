def jumping_number(number):
    number = list(str(number))
    for i in range(0, len(number)-1):
        if abs(int(number[i+1])-int(number[i])) != 1:
            return 'Not!!'
    return 'Jumping!!'