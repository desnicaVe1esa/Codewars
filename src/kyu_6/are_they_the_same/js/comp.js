function comp(array1, array2){
    if (array1 == null || array2 == null) {
        return false;
    }
    for (let i = 0; i < array1.length; i++) {
        array1[i] = Math.pow(array1[i], 2);
    }
    array1.sort(function(a, b) {
        return a - b;
    });
    array2.sort(function(a, b) {
        return a - b;
    });
    return JSON.stringify(array1) === JSON.stringify(array2);
}

module.exports = comp;