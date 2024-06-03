function rgb(r, g, b) {
    let red = r < 1 ? "00" : r > 255 ? "FF" : r.toString(16).toUpperCase();
    let green = g < 1 ? "00" : g > 255 ? "FF" : g.toString(16).toUpperCase();
    let blue = b < 1 ? "00" : b > 255 ? "FF" : b.toString(16).toUpperCase();
    return (red.length === 1 ? "0" + red : red) + (green.length === 1 ? "0" + green : green) + (blue.length === 1 ? "0" + blue : blue);
}
module.exports = rgb;