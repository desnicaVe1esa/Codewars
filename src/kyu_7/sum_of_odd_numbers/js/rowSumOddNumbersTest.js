const chai = require("chai");
const rowSumOddNumbers = require("./rowSumOddNumbers");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(rowSumOddNumbers(1), 1);
        assert.strictEqual(rowSumOddNumbers(42), 74088);
    });
});
