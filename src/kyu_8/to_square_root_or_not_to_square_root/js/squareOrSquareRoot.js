function squareOrSquareRoot(array) {
    return array.map(f => {
        if(Math.sqrt(f) % 1 === 0) {
            return Math.sqrt(f);
        } else {
            return Math.pow(f, 2);
        }
    });
}
module.exports = squareOrSquareRoot;