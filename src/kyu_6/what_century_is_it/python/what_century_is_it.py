from math import ceil

SUFFIX = {1: 'st', 2: 'nd', 3: 'rd'}

def what_century(year):
    century = int(ceil(int(year) / 100.0))
    quo, rem = divmod(century, 10)
    if quo == 1 and 1 <= rem <= 3:
        suffix = 'th'
    else:
        suffix = SUFFIX.get(rem, 'th')
    return '{}{}'.format(century, suffix)