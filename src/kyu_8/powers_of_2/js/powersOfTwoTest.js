const chai = require("chai");
const powersOfTwo = require("./powersOfTwo");
const assert = chai.assert;
chai.config.truncateThreshold = 0;

describe("Basic Tests", function () {
    it("Testing for fixed tests", () => {
        // assert.deepEqual(powersOfTwo(0), [1])
        assert.deepEqual(powersOfTwo(1), [1, 2])
        assert.deepEqual(powersOfTwo(4), [1, 2, 4, 8, 16])
    })
});