const chai = require("chai");
const isDivisible = require("./isDivisible");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Fixed Tests", () => {
        assert.strictEqual(isDivisible(3,3,4),false);
        assert.strictEqual(isDivisible(12,3,4),true);
        assert.strictEqual(isDivisible(8,3,4),false);
        assert.strictEqual(isDivisible(48,3,4),true);
    });
});