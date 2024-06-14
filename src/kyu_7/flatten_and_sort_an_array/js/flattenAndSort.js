function flattenAndSort(array) {
    return [].concat(...array).sort(function (a, b) { return a - b });
}
module.exports = flattenAndSort;