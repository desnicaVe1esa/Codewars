const { assert } = require('chai');

describe("Sample tests",function(){
    it("comparePowers([2,10], [2,15])", () => assert.strictEqual(comparePowers([2, 10], [2, 15]), 1));
    it("comparePowers([1,10], [3,10])", () => assert.strictEqual(comparePowers([1, 10], [3, 10]), 1));
    it("comparePowers([2,10], [2,10])", () => assert.strictEqual(comparePowers([2, 10], [2, 10]), 0));
    it("comparePowers([3,9], [1,6])",   () => assert.strictEqual(comparePowers([3, 9], [1, 6]), -1));
    it("comparePowers([1,7], [1,8])",   () => assert.strictEqual(comparePowers([1, 7], [1, 8]), 0));
})