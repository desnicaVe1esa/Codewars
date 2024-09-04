function removeNb (n) {
    const result = [];
    const sum = n * (n + 1) / 2;
    for (let i = n; i > 0; i--) {
        const j = (sum - i) / (i + 1);
        if (j < n && Number.isInteger(j)) {
            result.push([j, i]);
        }
    }
    return result;
}

module.exports = removeNb;