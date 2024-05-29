function partsSums(ls) {
    let sum = ls.reduce((a, b) => a + b, 0);
    let result = [sum];
    for (let i = 0; i < ls.length; i++) {
        result.push(sum -= ls[i]);
    }
    return result;
}
module.exports = partsSums;