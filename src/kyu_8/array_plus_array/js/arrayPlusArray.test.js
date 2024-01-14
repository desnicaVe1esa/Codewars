const chai = require("chai");
const arrayPlusArray = require("./arrayPlusArray");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(arrayPlusArray([1, 2, 3], [4, 5, 6]), 21);
        assert.strictEqual(arrayPlusArray([-1, -2, -3], [-4, -5, -6]), -21);
        assert.strictEqual(arrayPlusArray([0, 0, 0], [4, 5, 6]), 15);
        assert.strictEqual(arrayPlusArray([100, 200, 300], [400, 500, 600]), 2100);
    })
})