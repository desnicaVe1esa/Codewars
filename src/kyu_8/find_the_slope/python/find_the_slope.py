def find_slope(points):
    x1, y1, x2, y2 = points
    if x2 - x1 == 0:
        return "undefined"
    return str((y2 - y1) // (x2 - x1))