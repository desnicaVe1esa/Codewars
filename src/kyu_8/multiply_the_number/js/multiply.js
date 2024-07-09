function multiply(number){
    return number * Math.pow(5, number < 0 ? number.toString().length - 1 : '' + number.toString().length);
}

module.exports = multiply;