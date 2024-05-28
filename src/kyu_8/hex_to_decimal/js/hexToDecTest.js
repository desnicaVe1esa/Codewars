const chai = require("chai");
const hexToDec = require("./hexToDec");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(hexToDec("1"), 1);
        assert.strictEqual(hexToDec("a"), 10);
        assert.strictEqual(hexToDec("10"), 16);
        assert.strictEqual(hexToDec("FF"), 255);
        assert.strictEqual(hexToDec("-C"), -12);
    })
})