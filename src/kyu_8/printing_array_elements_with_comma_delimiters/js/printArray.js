function printArray(array) {
    let result = "";
    for (let i = 0; i < array.length; i++) {
        result += array[i] + ",";
    }
    return result.substring(0, result.length - 1);
}

module.exports = printArray;