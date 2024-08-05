function minSum(arr) {
    let result = 0;
    arr.sort(function (a, b) {
        return a - b;
    });
    for (let i = 0, j = arr.length - 1; i < arr.length; i += 2, j -= 2) {
        result += arr[j] * arr[i];
    }
    return result;
}

module.exports = minSum;