function basicOp(operation, value1, value2){
    return operation === "+" ? value1 + value2 : operation === "-" ? value1 - value2 : operation === "*" ? value1 * value2 : value1 / value2;
}

module.exports = basicOp;