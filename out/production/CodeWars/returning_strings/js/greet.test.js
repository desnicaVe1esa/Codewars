const chai = require("chai");
const greet = require("./greet");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests",() =>{
    it("Testing for fixed tests", () => {
        assert.strictEqual(greet("Ryan"), "Hello, Ryan how are you doing today?");
        assert.strictEqual(greet("Shingles"), "Hello, Shingles how are you doing today?");
    })
})