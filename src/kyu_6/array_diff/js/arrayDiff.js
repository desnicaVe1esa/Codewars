function arrayDiff(a, b) {
    if (a.length === 0 || b.length === 0) return a;
    return a.filter(item => !b.includes(item));
}

module.exports = arrayDiff;