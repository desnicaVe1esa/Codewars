const chai = require("chai");
const broken = require("./broken");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("The Office III - Broken Photocopier", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(broken("1"), "0");
        assert.strictEqual(broken("10000000101101111110011001000"), "01111111010010000001100110111");
        assert.strictEqual(broken("100010"), "011101");
    });
});