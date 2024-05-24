function pillars(numPill, dist, width) {
    return numPill < 2 ? 0 : numPill === 2 ? dist * 100 : (dist * 100 * (numPill - 1)) + (width * (numPill - 2));
}
module.exports = pillars;