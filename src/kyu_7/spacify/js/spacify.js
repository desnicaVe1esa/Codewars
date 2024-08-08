function spacify(str) {
    let result = '';
    for (let i = 0; i < str.length; i++) {
        result += str[i] + ' ';
    }
    return result.trim();
}

module.exports = spacify;