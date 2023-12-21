const { assert } = require("chai")
const positiveSum = require("./positiveSum");

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(positiveSum([1,2,3,4,5]),15);
        assert.strictEqual(positiveSum([1,-2,3,4,5]),13);
        // assert.strictEqual(positiveSum([]),0);
        assert.strictEqual(positiveSum([-1,-2,-3,-4,-5]),0);
        assert.strictEqual(positiveSum([-1,2,3,4,-5]),9);
    });
});