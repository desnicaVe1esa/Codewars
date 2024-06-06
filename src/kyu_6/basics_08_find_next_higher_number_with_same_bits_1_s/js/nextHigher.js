function nextHigher(n) {
    let o = n & -n;
    return n + o | ((n ^ n + o) / o >> 2);
}

module.exports = nextHigher;