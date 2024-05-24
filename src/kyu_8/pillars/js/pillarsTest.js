const chai = require("chai");
const pillars = require("./pillars");
const assert = chai.assert;
chai.config.truncateThreshold = 0;

describe("Basic tests", function () {
    it("Testing for number of pillars: 1, distance: 10 m and width: 10 cm", function () {
        assert.strictEqual(pillars(1, 10, 10), 0);
    });
    it("Testing for number of pillars: 2, distance: 20 m and width: 25 cm", function () {
        assert.strictEqual(pillars(2, 20, 25), 2000);
    });
    it("Testing for number of pillars: 11, distance: 15 m and width: 30 cm", function () {
        assert.strictEqual(pillars(11, 15, 30), 15270);
    });
});