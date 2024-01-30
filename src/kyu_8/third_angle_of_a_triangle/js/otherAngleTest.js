const chai = require("chai");
const otherAngle = require("./otherAngle");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Tests", () => {
    it("test", () => {
        assert.strictEqual(otherAngle(30, 60), 90);
        assert.strictEqual(otherAngle(60, 60), 60);
        assert.strictEqual(otherAngle(43, 78), 59);
        assert.strictEqual(otherAngle(10, 20), 150);
    });
});