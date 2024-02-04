function digitalRoot(n) {
    return (n !== 0 && n % 9 === 0) ? 9 : n % 9;
}

module.exports = digitalRoot;