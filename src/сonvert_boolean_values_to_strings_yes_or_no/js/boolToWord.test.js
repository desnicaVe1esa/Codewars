const { assert } = require("chai")
const boolToWord = require("./boolToWord");

describe("Basic tests", () => {
    it("Testing for basic tests", () => {
        assert.strictEqual(boolToWord(true), 'Yes')
        assert.strictEqual(boolToWord(false), 'No')
    });
});