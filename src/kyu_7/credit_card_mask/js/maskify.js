function maskify(cc) {
    return cc.slice(-4).padStart(cc.length, '#');
}

module.exports = maskify;