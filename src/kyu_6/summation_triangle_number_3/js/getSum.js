function getSum(n) {
    let p = n >> 1n;
    let q = n % 2n;
    return -(p + 2n * q - 1n) * (p + q + 1n) * (p + q + 1n);
}
module.exports = getSum;