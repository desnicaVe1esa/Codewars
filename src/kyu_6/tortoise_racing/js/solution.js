function race(v1, v2, g) {
    if (v1 > v2) {
        return null;
    }
    let closingTime =  (g * 3600) / (v2 - v1);
    return [
        Math.trunc(closingTime / 3600),
        Math.trunc((closingTime % 3600) / 60),
        Math.trunc(closingTime % 60)
    ];
}

module.exports = race;