function dutyFree(normPrice, discount, hol){
    return Math.floor(hol / (normPrice / 100 * discount));
}
module.exports = dutyFree;