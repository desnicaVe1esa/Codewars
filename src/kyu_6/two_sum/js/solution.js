function twoSum(numbers, target) {
    for (let i = 0; i < numbers.length; i++) {
        for (let j = 0; j < numbers.length; j++) {
            if (i !== j) {
                if (numbers[i] + numbers[j] === target) {
                    return [i, j];
                }
            }
        }
    }
    return [0, 1];
}

module.exports = twoSum;