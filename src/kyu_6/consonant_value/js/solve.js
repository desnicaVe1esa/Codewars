function solve(s) {
    let alphabet = "abcdefghijklmnopqrstuvwxyz";
    let result = 0;
    let compare = 0;
    let preparedResult = s.split(/[aeiou]/);
    for (let i = 0; i < preparedResult.length; i++) {
        for (let j = 0; j < preparedResult[i].length; j++) {
            compare += alphabet.indexOf(preparedResult[i].charAt(j)) + 1;
        }
        result = Math.max(compare, result);
        compare = 0;
    }
    return result;
}

module.exports = solve;