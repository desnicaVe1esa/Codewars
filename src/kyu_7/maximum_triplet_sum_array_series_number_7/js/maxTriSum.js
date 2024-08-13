function maxTriSum(numbers) {
    let result = [... new Set(numbers.sort((a, b) => b -a))]
    return result[0] + result[1] + result[2];
}

module.exports = maxTriSum;