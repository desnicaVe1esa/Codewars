function findMultiples(integer, limit) {
    let res = [];
    for (let i = 1; i <= limit; i++) {
        if (i * integer <= limit) {
            res.push(i * integer)
        }
    }
    return res;
}

module.exports = findMultiples;