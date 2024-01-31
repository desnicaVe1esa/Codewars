const chai = require("chai");
const updateLight = require("./updateLight");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(updateLight("green"), "yellow");
        assert.strictEqual(updateLight("yellow"), "red");
        assert.strictEqual(updateLight("red"), "green");
    });
});