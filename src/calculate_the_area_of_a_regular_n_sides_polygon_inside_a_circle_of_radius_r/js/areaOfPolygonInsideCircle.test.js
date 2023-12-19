const chai = require("chai");
const areaOfPolygonInsideCircle = require("./areaOfPolygonInsideCircle");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Example Tests", function() {

    it("ex1", function() {
        assert.approximately(areaOfPolygonInsideCircle(3, 3), 11.691, 1e-3);
    });

    it("ex2", function() {
        assert.approximately(areaOfPolygonInsideCircle(2, 4), 8, 1e-3);
    });

    it("ex3", function() {
        assert.approximately(areaOfPolygonInsideCircle(2.5, 5), 14.86, 1e-3);
    });

});