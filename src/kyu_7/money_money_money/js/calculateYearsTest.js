const chai = require("chai");
const calculateYears = require("./calculateYears");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("calculateYears", () => {
    it("Basic tests", () => {
        assert.strictEqual(calculateYears(1000, 0.05, 0.18, 1100), 3)
        assert.strictEqual(calculateYears(1000,0.01625,0.18,1200), 14)
        assert.strictEqual(calculateYears(1000,0.05,0.18,1000), 0)
    })
})
