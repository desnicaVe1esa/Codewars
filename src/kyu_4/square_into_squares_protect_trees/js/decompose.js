function decompose(n, n2 = n * n, i = n, prev) {
    while (n2 > 0 && i-- > 1) {
        if (prev = decompose(n, n2 - i * i, i)) {
            return prev.concat([i]);
        }
    }
    return (n2 == 0) ? [] : null;
}

module.exports = decompose;