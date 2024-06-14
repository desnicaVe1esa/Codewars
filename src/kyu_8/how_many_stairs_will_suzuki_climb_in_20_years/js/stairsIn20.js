function stairsIn20(s) {
    return [].concat(...s).reduce((a, b) => a + b) * 20;
}

module.exports = stairsIn20;