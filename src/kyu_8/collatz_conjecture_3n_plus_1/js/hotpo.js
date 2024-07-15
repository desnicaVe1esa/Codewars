let hotpo = function(n){
    if (n === 1) {
        return 0;
    }
    let result = 0;
    while (n > 1) {
        if (n % 2 == 0) {
            n /= 2;
        } else {
            n = n * 3 + 1;
        }
        result++;
    }
    return result;
}
module.exports = hotpo;