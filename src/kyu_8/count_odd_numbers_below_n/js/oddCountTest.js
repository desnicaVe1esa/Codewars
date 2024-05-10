const chai = require("chai");
const oddCount = require("./oddCount");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(oddCount(15), 7, "Oops! Wrong.");
        assert.strictEqual(oddCount(15023), 7511, "Oops! Wrong.");
    });
});
