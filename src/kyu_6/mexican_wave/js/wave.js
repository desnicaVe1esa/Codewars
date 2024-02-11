function wave(str){
    let result = [];
    for (let i = 0; i < str.length; i++) {
        if (str[i] !== ' ') {
            result.push(str.substring(0, i) + str[i].toUpperCase() + str.substring(i + 1))
        }
    }
    return result;
}

module.exports = wave;
