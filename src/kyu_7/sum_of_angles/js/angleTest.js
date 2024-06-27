const chai = require("chai");
const angle = require("./angle");
const assert = chai.assert;
chai.config.truncateThreshold = 0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(angle(3), 180);
        assert.strictEqual(angle(4), 360);
    });
})
