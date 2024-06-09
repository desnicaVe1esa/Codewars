function primeFactors(n){
    let result = "";
    for (let i = 2; i <= n; ++i) {
        let count;
        for (count = 0; n % i === 0; ++count) {
            n /= i;
        }
        if (count > 0) {
            result += "(" + i + (count > 1 ? "**" + count : "") + ")";
        }
    }
    return result;
}
module.exports = primeFactors;