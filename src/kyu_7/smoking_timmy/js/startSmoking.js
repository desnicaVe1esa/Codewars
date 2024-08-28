function startSmoking(bars,boxes){
    return Math.trunc(225 * bars + 22.5 * boxes - .5);
}
module.exports = startSmoking;