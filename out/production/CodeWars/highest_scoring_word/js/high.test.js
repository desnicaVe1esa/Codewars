const chai = require("chai");
const high = require("./high");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(high('man i need a taxi up to ubud'), 'taxi');
        assert.strictEqual(high('what time are we climbing up the volcano'), 'volcano');
        assert.strictEqual(high('take me to semynak'), 'semynak');
        assert.strictEqual(high('aa b'), 'aa');
        assert.strictEqual(high('b aa'), 'b');
        assert.strictEqual(high('bb d'), 'bb');
        assert.strictEqual(high('d bb'), 'd');
        assert.strictEqual(high('aaa b'), 'aaa');
    })
});