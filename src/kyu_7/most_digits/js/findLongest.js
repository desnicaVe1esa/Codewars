function findLongest(array){
    let max = countDigits(array[0]);
    let index = 0;
    for (let i = 1; i < array.length; i++) {
        let current = countDigits(array[i]);
        if (current > max) {
            max = current;
            index = i;
        }
    }
    return array[index];
}

function countDigits(number) {
    if (number < 0 ) {
        return String(number).length - 1;
    }
    return String(number).length;
}

module.exports = findLongest;
