function jumpingNumber(n){

    let str = String(n);

    for (let i = 0; i < str.length - 1 && str.length > 1; i++) {
        if (Math.abs(str[i] - str[i + 1]) !== 1) {
            return "Not!!";
        }
    }

    return "Jumping!!";
}

module.exports = jumpingNumber;