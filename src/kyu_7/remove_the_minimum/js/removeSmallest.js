function removeSmallest(numbers) {
    if (!numbers || numbers.length === 0) {
        return [];
    }
    let minIndex = 0;
    for (let i = 1; i < numbers.length; i++) {
        if (numbers[i] < numbers[minIndex]) {
            minIndex = i;
        }
    }
    const result = new Array(numbers.length - 1);
    let copyIndex = 0;
    for (let i = 0; i < numbers.length; i++) {
        if (i !== minIndex) {
            result[copyIndex++] = numbers[i];
        }
    }

    return result;
}
module.exports = removeSmallest;