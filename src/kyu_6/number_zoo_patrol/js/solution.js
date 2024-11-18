function findNumber(array) {
    if (array.length === 0) {
        return 1;
    }
    let arraySum = array.reduce((sum, val) => sum + val);
    return ((array.length + 1) * (array.length + 2) / 2) - arraySum;
}