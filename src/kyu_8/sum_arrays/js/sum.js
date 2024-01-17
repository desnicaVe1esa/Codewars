function sum (numbers) {
    return numbers.length === 0 ? 0 : numbers.reduce((a, b) => a + b);
}

module.exports = sum;