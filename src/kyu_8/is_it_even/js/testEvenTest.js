const chai = require("chai");
const testEven = require("./testEven");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Tests", () => {
    it("visible_tests", () => {
        assert.strictEqual(testEven(0), true, "testEven for 0");
        assert.strictEqual(testEven(0.5), false, "testEven for 0.5");
        assert.strictEqual(testEven(1), false, "testEven for 1");
        assert.strictEqual(testEven(2), true, "testEven for 2");
        assert.strictEqual(testEven(-4), true, "testEven for 2");
    });
});