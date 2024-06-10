function rowWeights(array){
    let result = [0, 0];
    for (let i = 0; i < array.length; i++) {
        if (i % 2 === 0) {
            result[0] += array[i];
        } else {
            result[1] += array[i];
        }
    }
    return result;
}
module.exports = rowWeights;