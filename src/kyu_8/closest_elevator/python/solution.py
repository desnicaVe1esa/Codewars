def elevator(left, right, call):
    distLeft = abs(call - left);
    distRight = abs(call - right);
    if distLeft >= distRight:
        return "right";
    if distLeft < distRight:
        return "left";