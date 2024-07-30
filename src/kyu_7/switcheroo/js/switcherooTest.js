const chai = require("chai");
const switcheroo = require("./switcheroo");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Switcheroo", () => {
    it("Fixed tests", () => {
        assert.strictEqual(switcheroo('abc'), 'bac');
        assert.strictEqual(switcheroo('aaabcccbaaa'), 'bbbacccabbb');
        assert.strictEqual(switcheroo('ccccc'), 'ccccc');
    })
});