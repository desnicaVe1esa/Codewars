const Test = require('@codewars/test-compat');
const chai = require("chai");
const noBoringZeros = require("./noBoringZeros");
const assert = chai.assert;
chai.config.truncateThreshold = 0;

describe("Basic tests", function () {
    it("noBoringZeros", function () {
        assert.strictEqual(noBoringZeros(1450), 145)
        assert.strictEqual(noBoringZeros(960000), 96)
        assert.strictEqual(noBoringZeros(1050), 105)
        assert.strictEqual(noBoringZeros(-1050), -105)
        assert.strictEqual(noBoringZeros(-105), -105)
    })
})
