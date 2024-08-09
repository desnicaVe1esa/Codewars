def parse_int(string):

    value = 0

    string = string.lower().replace(' and', '') # normalize

    millions, thousands, ones =  parse_periods(string)

    if millions:
        value += 1_000_000 * to_integer(millions)

    if thousands:
        value += 1000 * to_integer(thousands)

    if ones:
        value += to_integer(ones)

    return value

def parse_periods(text):
    """Break text into millions, thousands, and ones periods"""

    millions = ''
    thousands = ''
    ones = ''
    head = text

    if 'million' in head:
        millions, sep, head = head.partition('million')

    if 'thousand' in head:
        thousands, sep, head = head.partition('thousand')

    if head:
        ones = head

    return (millions.strip(), thousands.strip(), ones.strip())

def to_integer(text):
    """Convert text less than 'one thousand' to integer"""

    to_num = {
        'zero' : 0,
        'one' : 1,
        'two' : 2,
        'three' : 3,
        'four' : 4,
        'five' : 5,
        'six' : 6,
        'seven' : 7,
        'eight' : 8,
        'nine' : 9,
        'ten' : 10,
        'eleven' : 11,
        'twelve' : 12,
        'thirteen' : 13,
        'fourteen' : 14,
        'fifteen' : 15,
        'sixteen' : 16,
        'seventeen' : 17,
        'eighteen' : 18,
        'nineteen' : 19,
        'twenty' : 20,
        'thirty' : 30,
        'forty' : 40,
        'fifty' : 50,
        'sixty' : 60,
        'seventy' : 70,
        'eighty' : 80,
        'ninety' : 90
    }

    if not text:
        raise ValueError

    head = text
    result = 0

    if 'hundred' in head:
        hundreds, sep, head = head.partition('hundred')
        result += 100 * to_num[hundreds.strip()]

    if '-' in head:
        tens, sep, head = head.partition('-')
        result += to_num[tens.strip()]

    if head.strip():
        result += to_num[head.strip()]

    return result
