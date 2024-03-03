const chai = require("chai");
const digitize = require("./digitize");
const assert = chai.assert;
chai.config.truncateThreshold = 0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.deepEqual(digitize(35231), [1, 3, 2, 5, 3]);
        assert.deepEqual(digitize(0), [0]);
    });
});
