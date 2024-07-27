def evaporator(content, evap_per_day, threshold):
    day = 0
    total = content
    while (content >= total * (1 / 100) * threshold):
        content -= content * (1 / 100) * evap_per_day
        day += 1
    return day