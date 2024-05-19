multiplicationTable = function (size) {
    let result = [];
    for (let i = 1; i <= size; i++) {
        let x = [];
        for (let j = 1; j <= size; j++) {
            x.push(i * j);
        }
        result.push(x);
    }
    return result;
}
module.exports = multiplicationTable;