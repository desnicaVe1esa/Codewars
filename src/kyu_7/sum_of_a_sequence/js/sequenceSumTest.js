const chai = require("chai");
const sequenceSum = require("./sequenceSum");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(sequenceSum(2, 6, 2), 12)
        assert.strictEqual(sequenceSum(1, 5, 1), 15)
        assert.strictEqual(sequenceSum(1, 5, 3), 5)
    })
})