function breakChocolate(n, m) {
    return n * m !== 0 ? Math.ceil(n * m - 1) : 0;
}

module.exports = breakChocolate;