const chai = require("chai");
const findShort = require("./findShort");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(findShort("bitcoin take over the world maybe who knows perhaps"), 3);
        assert.strictEqual(findShort("turns out random test cases are easier than writing out basic ones"), 3);
        assert.strictEqual(findShort("Let's travel abroad shall we"), 2);
    })
})