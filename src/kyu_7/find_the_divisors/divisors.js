function divisors(integer) {
    let i = 2;
    let result = [];
    while (i < integer) {
        if (integer % i === 0) {
            result.push(i);
        }
        i++;
    }
    if (result.length === 0) { return integer + ' is prime'; }
    return result;
}

module.exports = divisors;