function sumTwoSmallestNumbers(numbers) {
    let result = numbers.sort(function (a, b) {return a - b});
    return result[0] + result[1];
}

module.exports = sumTwoSmallestNumbers;