function minValue(values) {
    let set = [...new Set(values.sort((a, b) => a - b))];
    let result = '';
    for (let digit of set) {
        result += digit;
    }
    return Number(result);
}

module.exports = minValue;