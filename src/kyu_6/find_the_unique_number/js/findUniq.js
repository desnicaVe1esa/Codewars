function findUniq(arr) {
    return arr.sort()[0] === arr[1] ? arr[arr.length - 1] : arr[0];
}

module.exports = findUniq;