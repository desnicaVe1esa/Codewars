function findDeletedNumber(arr, mixArr) {
    return arr.length === 0 && mixArr.length === 0 ? 0 : arr.reduce((a, b) => a + b) - mixArr.reduce((a, b) => a + b);
}
module.exports = findDeletedNumber;