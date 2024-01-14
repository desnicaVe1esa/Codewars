function getAge(inputString){
    return Number(inputString.replaceAll(/\D+/g, ''));
}

module.exports = getAge;