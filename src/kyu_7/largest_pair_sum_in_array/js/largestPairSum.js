function largestPairSum(numbers) {
    numbers.sort(function (a, b) {
        return a - b;
    });
    numbers.reverse();
    return numbers[0] + numbers[1];
}

module.exports = largestPairSum;