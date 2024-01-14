function count(string) {
    let charCount = {};
    for (let char of string) {
        charCount[char] = (charCount[char] || 0) + 1;
    }
    return charCount;
}

module.exports = count;