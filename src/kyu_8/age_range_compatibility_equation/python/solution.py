def dating_range(age):
    return f"{int(age - 0.1 * age)}-{int(age + 0.1 * age)}" if age <= 14 else f"{age // 2 + 7}-{(age - 7) * 2}";