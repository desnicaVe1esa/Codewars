const snail = (arr) => {
    let finalArray = [];
    while (arr.length) {
        finalArray.push(...arr.shift());
        arr.map(row => finalArray.push(row.pop()))
        arr.reverse().map(row => row.reverse());
    }
    return finalArray
}
module.exports = snail;