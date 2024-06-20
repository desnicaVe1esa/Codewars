function factorial(n) {
    if (n < 0 || n > 12) {
        throw new RangeError();
    }
    let res = 1;
    for (let i = 1; i < n + 1; i++) {
        res *= i;
    }
    return res;
}

module.exports = factorial;