function swapValues(arguments) {
    let temp = arguments[0];
    arguments[0] = arguments[1];
    arguments[1] = temp;
}

module.exports = swapValues;