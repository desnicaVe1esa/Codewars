function getCount(str) {
    let m = str.match(/[aeiou]/gi);
    return m === null ? 0 : m.length;
}

module.exports = getCount;