function slope(points) {
    return points[2] - points[0] === 0 ? "undefined" :
        "" + (points[3] - points[1]) / (points[2] - points[0]);
}
module.exports = slope;