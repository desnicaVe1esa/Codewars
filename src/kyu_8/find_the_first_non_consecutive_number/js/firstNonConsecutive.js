function firstNonConsecutive(arr) {
    for (let i = 0; i < arr.length; i++) {
        let a = arr[i] - arr[i - 1];
        if (a >= 2) {
            return arr[i];
        }
    }
    return null;
}

module.exports = firstNonConsecutive;