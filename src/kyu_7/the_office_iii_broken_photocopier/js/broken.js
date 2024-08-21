function broken(x) {
    let result = '';
    for (let i = 0; i < x.length; i++) {
        result += x.charAt(i) === '0' ? "1" : "0";
    }
    return result;
}

module.exports = broken;