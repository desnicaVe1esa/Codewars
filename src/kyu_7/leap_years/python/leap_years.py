def is_leap_year(year):
    return (year % 100 and not year % 4) or not year % 400

isLeapYear = is_leap_year