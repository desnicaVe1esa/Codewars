const chai = require("chai");
const predictAge = require("./predictAge");
const assert = chai.assert;
chai.config.truncateThreshold = 0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(predictAge(65, 60, 75, 55, 60, 63, 64, 45), 86);
    });
})
