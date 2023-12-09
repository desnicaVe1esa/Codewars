const chai = require("chai");
const getAge = require("./getAge");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests",() =>{
    it("Testing for fixed tests", () => {
        assert.strictEqual(getAge("4 years old"), 4);
    })
})