const summation = require("./summation");
const assert = require('chai').assert;

describe('summation', function () {
    it('should return the correct total', function () {
        assert.strictEqual(summation(1),  1);
        assert.strictEqual(summation(2),  3);
        assert.strictEqual(summation(8), 36);
    })
})
