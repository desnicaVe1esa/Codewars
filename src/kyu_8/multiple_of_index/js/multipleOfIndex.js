function multipleOfIndex(array) {
        let result = [];
        result.fill(-999999999);
        for (let i = 1; i < array.length; i++) {
        if (array[0] === 0) {
            result[0] = 0;
    }
    if (array[i] % i === 0) {
        result[i] = array[i];
    }
}
    return result.filter(f => f !== -999999999);
}
module.exports = multipleOfIndex;