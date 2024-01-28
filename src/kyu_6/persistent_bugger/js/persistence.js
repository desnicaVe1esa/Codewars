function persistence(num) {
    let count = 0;
    while (num >= 10) {
        let product = 1;
        num.toString().split('').forEach(digit => {
            product *= parseInt(digit);
        });
        num = product;
        count++;
    }

    return count;
}

module.exports = persistence;