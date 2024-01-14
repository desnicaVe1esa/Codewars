function arrayPlusArray(arr1, arr2) {
    return arr1.reduce((n, m) => n + m) + arr2.reduce((n, m) => n + m);
}

module.exports = arrayPlusArray;