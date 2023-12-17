const binaryArrayToNumber = arr => {
    let stringValue = '';
    for (let a in arr) {
        stringValue += arr[a];
    }
    return parseInt(stringValue, 2);
};

module.exports = binaryArrayToNumber;