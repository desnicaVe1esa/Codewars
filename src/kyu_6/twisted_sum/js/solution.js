function twistedSum(n) {
    return [...Array(n + 1).keys()].reduce((a, b) => a + [..."" + b].reduce((x, y) => x + +y, 0), 0);
}

module.exports = twistedSum;