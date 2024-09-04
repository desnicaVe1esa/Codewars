const chai = require("chai");
const overTheRoad = require("./overTheRoad");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Examples", function() {
    it("(1,3) --> 6", function() {
        assert.strictEqual(overTheRoad(1,3), 6);
    });
    it("(3,3) --> 4", function() {
        assert.strictEqual(overTheRoad(3,3), 4);
    });
    it("2,3) --> 5", function() {
        assert.strictEqual(overTheRoad(2,3), 5);
    });
    it("(3,5) --> 8", function() {
        assert.strictEqual(overTheRoad(3,5), 8);
    });
    it("(7,11) --> 16", function() {
        assert.strictEqual(overTheRoad(7,11), 16);
    });
    it("(23633656673,310027696726) --> 596421736780", function() {
        assert.strictEqual(overTheRoad(23633656673,310027696726), 596421736780);
    });
});
