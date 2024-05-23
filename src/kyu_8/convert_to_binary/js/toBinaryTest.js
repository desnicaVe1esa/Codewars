const chai = require("chai");
const toBinary = require("./toBinary");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(toBinary(1), 1);
        assert.strictEqual(toBinary(2), 10);
        assert.strictEqual(toBinary(3), 11);
        assert.strictEqual(toBinary(5), 101);
    });
})
