function adjacentElementsProduct(array) {
    let prepared = [];
    for (let i = 0; i < array.length; i++) {
        try {
            prepared.push(array[i] * array[i + 1]);
        } catch (Error) {
            break;
        }
    }
    return Math.max.apply(null, prepared.filter(f => !isNaN(f)));
}

module.exports = adjacentElementsProduct;