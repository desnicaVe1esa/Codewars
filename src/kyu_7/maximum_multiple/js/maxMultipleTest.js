const chai = require("chai");
const maxMultiple = require("./maxMultiple");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(maxMultiple(2,7),6);
        assert.strictEqual(maxMultiple(3,10),9);
        assert.strictEqual(maxMultiple(7,17),14);
        assert.strictEqual(maxMultiple(10,50),50);
        assert.strictEqual(maxMultiple(37,200),185);
        assert.strictEqual(maxMultiple(7,100),98);
    });
})
