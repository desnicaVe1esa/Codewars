function binToDec(bin) {
    let result = 0, p = 0;
    for (let i = bin.length - 1; i >= 0; i--) {
        if (bin[i] === '1') {
            result += Math.pow(2, p);
        }
        p++;
    }
    return result;
}
module.exports = binToDec;