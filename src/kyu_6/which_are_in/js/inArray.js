function inArray(array1, array2) {
    return array1.filter(fil => array2.find(fin => fin.match(fil))).sort();
}

module.exports = inArray;