var number = function (array) {
    let count = 1;
    let result = [];
    for (let line in array) {
        result.push(count + ": " + array[line]);
        count++;
    }
    return result;
}

module.exports = number;