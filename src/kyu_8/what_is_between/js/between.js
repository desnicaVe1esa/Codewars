function between(a, b) {
    let result = [];
    for (; a <= b; a++) {
        result.push(a);
    }
    return result;
}

module.exports = between;