function countPositivesSumNegatives(input) {
    if (input == null || input.length === 0) {
        return [];
    }
    let result = [];
    result[0] = input.filter(f => f > 0).length;
    result[1] = input.filter(f => f < 0).reduce((a, b) => a + b, 0);
    return result;
}

module.exports = countPositivesSumNegatives;