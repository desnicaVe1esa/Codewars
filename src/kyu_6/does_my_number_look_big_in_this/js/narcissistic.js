function narcissistic(value) {
    let length = value.toString().length;
    let forCalculation = value;
    let arr = [length];
    let result = 0;
    for (let i = 0; i < length; i++) {
        arr[i] = forCalculation % 10;
        forCalculation = Math.floor(forCalculation / 10);
    }
    for (let i = 0; i < arr.length; i++) {
        result += Math.pow(arr[i], length);
    }
    return result === value;
}

module.exports = narcissistic;