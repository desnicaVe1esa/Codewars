function powersOfTwo(n) {
    let result = new Array(n + 1);
    for (let i = 0; i < result.length; i++) {
        result[i] = Math.pow(2, i);
    }
    return result;
}

module.exports = powersOfTwo;