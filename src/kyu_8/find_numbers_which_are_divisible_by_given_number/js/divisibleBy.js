function divisibleBy(numbers, divisor){
    return numbers.filter(f => f % divisor === 0);
}

module.exports = divisibleBy;