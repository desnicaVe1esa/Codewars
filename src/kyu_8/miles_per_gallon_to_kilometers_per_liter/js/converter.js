function converter (mpg) {
    return parseFloat((mpg / 4.54609188 * 1.609344).toFixed(2));
}
module.exports = converter;