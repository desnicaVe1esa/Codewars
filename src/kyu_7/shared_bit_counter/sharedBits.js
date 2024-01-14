function sharedBits(a, b) {
    return (a & b).toString(2).replace(/0/g, '').length > 1;
}

module.exports = sharedBits;