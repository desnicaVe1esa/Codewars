const chai = require("chai");
const bonusTime = require("./bonusTime");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests",() =>{
    it("Testing for fixed tests", () => {
        assert.strictEqual(bonusTime(10000, true), '£100000');
        assert.strictEqual(bonusTime(25000, true), '£250000');
        assert.strictEqual(bonusTime(10000, false), '£10000');
        assert.strictEqual(bonusTime(60000, false), '£60000');
        assert.strictEqual(bonusTime(2, true), '£20');
        assert.strictEqual(bonusTime(78, false), '£78');
        assert.strictEqual(bonusTime(67890, true), '£678900');
    })
})