function diamond(n) {
    if ((n % 2) === 0 || n <= 0) return null;
    let result = '';
    for (let i = 1; i < n; i += 2) {
        result += ' '.repeat(Math.max(0, (n - i) / 2)) + '*'.repeat(Math.max(0, i)) + '\n';
    }
    for (let i = n; i > 0; i -= 2) {
        result += ' '.repeat(Math.max(0, (n - i) / 2)) + '*'.repeat(i) + '\n';
    }
    return result;
}

module.exports = diamond;