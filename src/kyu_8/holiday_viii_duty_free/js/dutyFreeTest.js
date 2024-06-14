const chai = require("chai");
const dutyFree = require("./dutyFree");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(dutyFree(12, 50, 1000), 166);
        assert.strictEqual(dutyFree(17, 10, 500), 294);
        assert.strictEqual(dutyFree(24, 35, 3000), 357);
    });
})