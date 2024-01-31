const chai = require("chai");
const arithmetic = require("./arithmetic");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(arithmetic(1, 2, "add"), 3, "'add' should return the two numbers added together!");
        assert.strictEqual(arithmetic(8, 2, "subtract"), 6, "'subtract' should return a minus b!");
        assert.strictEqual(arithmetic(5, 2, "multiply"), 10, "'multiply' should return a multiplied by b!");
        assert.strictEqual(arithmetic(8, 2, "divide"), 4, "'divide' should return a divided by b!");
    })
})