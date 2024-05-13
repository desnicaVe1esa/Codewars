function removeEveryOther(arr){
    for (let i = 0; i < arr.length; i++) {
        if (i % 2 !== 0) {
            arr[i] = null;
        }
    }
    return arr.filter(f => f !== null);
}
module.exports = removeEveryOther;