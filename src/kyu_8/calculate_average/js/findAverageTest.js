const chai = require("chai");
const findAverage = require("./findAverage");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(findAverage([1,1,1]), 1);
        assert.strictEqual(findAverage([1,2,3]), 2);
        assert.strictEqual(findAverage([1,2,3,4]), 2.5);
    });
}); 