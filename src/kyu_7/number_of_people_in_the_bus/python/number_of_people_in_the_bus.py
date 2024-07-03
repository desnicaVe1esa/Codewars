def number(bus_stops):
    result = 0
    for stops in bus_stops:
        result += stops[0] - stops[1]
    return result