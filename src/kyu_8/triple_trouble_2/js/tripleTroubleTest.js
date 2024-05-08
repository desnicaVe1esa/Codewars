const chai = require("chai");
const tripleTrouble = require("./tripleTrouble");
const assert = chai.assert;
chai.config.truncateThreshold = 0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(tripleTrouble("aaa", "bbb", "ccc"), "abcabcabc");
        assert.strictEqual(tripleTrouble("aaaaaa", "bbbbbb", "cccccc"), "abcabcabcabcabcabc");
        assert.strictEqual(tripleTrouble("burn", "reds", "roll"), "brrueordlnsl");
        assert.strictEqual(tripleTrouble("Sea", "urn", "pms"), "Supermans");
        assert.strictEqual(tripleTrouble("LLh", "euo", "xtr"), "LexLuthor");
    });
})