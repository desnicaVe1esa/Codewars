function expressionMatter(a, b, c) {
    let result = 0;
    if (a + b + c > result) {
        result = a + b + c;
    }
    if ((a + b) * c > result) {
        result = (a + b) * c;
    }
    if (a * (b + c) > result) {
        result = a * (b + c);
    }
    if (a * b * c > result) {
        result = a * b * c;
    }
    return result;
}

module.exports = expressionMatter;