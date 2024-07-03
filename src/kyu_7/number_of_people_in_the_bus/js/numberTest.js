const chai = require("chai");
const number = require("./number");
const assert = chai.assert;
chai.config.truncateThreshold = 0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(number([[10, 0], [3, 5], [5, 8]]), 5);
        assert.strictEqual(number([[3, 0], [9, 1], [4, 10], [12, 2], [6, 1], [7, 10]]), 17);
        assert.strictEqual(number([[3, 0], [9, 1], [4, 8], [12, 2], [6, 1], [7, 8]]), 21);
        assert.strictEqual(number([[0, 0]]), 0);
    });
});
