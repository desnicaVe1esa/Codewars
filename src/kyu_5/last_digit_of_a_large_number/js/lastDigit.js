function lastDigit(n, m) {
    let base = n % 10n;
    let rem = m % 4n;
    let exp = (rem === 0n && m !== 0n) ? 4n : rem;
    return base ** exp % 10n;
}

module.exports = lastDigit;