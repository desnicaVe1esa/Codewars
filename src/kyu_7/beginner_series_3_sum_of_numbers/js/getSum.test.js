const chai = require("chai");
const getSum = require("./getSum");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(getSum(0,-1), -1);
        assert.strictEqual(getSum(0, 1),  1);
        assert.strictEqual(getSum(2, 2),  2);
    })
});