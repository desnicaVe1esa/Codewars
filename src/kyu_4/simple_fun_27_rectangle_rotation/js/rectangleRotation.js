function rectangleRotation(a, b) {

    let h = a / Math.sqrt(2) | 0, v = b / Math.sqrt(2) | 0;
    return h * v + (h + 1) * (v + 1) - (h % 2 ^ v % 2);

}

module.exports = rectangleRotation;