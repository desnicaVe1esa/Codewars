function take(arr, n) {
    return arr.filter((x, i) => i <= n - 1);
}

module.exports = take;