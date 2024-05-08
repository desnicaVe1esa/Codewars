var isSquare = function(n){
    if (n < 0) {
        return false;
    }
    let sqrtN = Math.sqrt(n);
    return parseInt(sqrtN) === sqrtN;
}
module.exports = isSquare;