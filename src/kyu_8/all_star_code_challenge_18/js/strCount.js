function strCount(str, letter){
    return str.split('').filter(f => f === letter).length;
}

module.exports = strCount;