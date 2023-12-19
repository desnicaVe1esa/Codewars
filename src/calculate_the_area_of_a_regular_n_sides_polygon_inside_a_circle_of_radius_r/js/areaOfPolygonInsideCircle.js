function areaOfPolygonInsideCircle(circleRadius, numberOfSides) {
    return Math.round(.5e3 * numberOfSides * Math.pow(circleRadius, 2) * Math.sin(6.2831853 / numberOfSides)) / 1.0e3;
}

module.exports = areaOfPolygonInsideCircle;