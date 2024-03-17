function spacey(array){
    let result = [];
    let str = '';
    for (let i = 0; i < array.length; i++) {
        str += array[i];
        result[i] = str;
    }
    return result;
}
module.exports = spacey;