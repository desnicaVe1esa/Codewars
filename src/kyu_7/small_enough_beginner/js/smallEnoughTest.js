const chai = require("chai");
const smallEnough = require("./smallEnough");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(smallEnough([66, 101], 200), true);
        assert.strictEqual(smallEnough([78, 117, 110, 99, 104, 117, 107, 115], 100), false);
        assert.strictEqual(smallEnough([101, 45, 75, 105, 99, 107], 107), true);
        assert.strictEqual(smallEnough([80, 117, 115, 104, 45, 85, 112, 115], 120), true);
    })
})
