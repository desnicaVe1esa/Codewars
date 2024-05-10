function isNegativeZero(n) {
    return Object.is(n, -0);
}

module.exports = isNegativeZero;