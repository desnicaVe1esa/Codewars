const chai = require("chai");
const firstNonConsecutive = require("./firstNonConsecutive");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Fixed tests", () => {
    it('a simple example', function() {
        const first = firstNonConsecutive([1,2,3,4,6,7,8])
        assert.strictEqual(first, 6)
    })

    it('all sequential', function() {
        const first = firstNonConsecutive([1,2,3,4])
        assert.strictEqual(first, null)
    })
})