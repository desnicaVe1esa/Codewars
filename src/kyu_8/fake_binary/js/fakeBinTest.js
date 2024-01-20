const chai = require("chai");
const fakeBin = require("./fakeBin");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests",() =>{
    it("Testing for fixed tests", () => {
        assert.strictEqual(fakeBin('45385593107843568'), '01011110001100111');
        assert.strictEqual(fakeBin('509321967506747'), '101000111101101');
        assert.strictEqual(fakeBin('366058562030849490134388085'), '011011110000101010000011011');
    })
});