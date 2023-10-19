function highAndLow(numbers){
    const arr = numbers.split(' ').map(Number);
    const max = Math.max(...arr);
    const min = Math.min(...arr);
    return max + ' ' + min;
}

module.exports = highAndLow;