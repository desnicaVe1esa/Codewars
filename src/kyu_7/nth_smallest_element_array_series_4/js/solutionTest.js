const { assert } = require('chai');
const nthSmallest = require("./solution");

describe("Basic tests",() =>{
    it('Basic tests', () => {
        assert.strictEqual(nthSmallest(                 [3,1,2], 2),  2);
        assert.strictEqual(nthSmallest(        [15,20,7,10,4,3], 3),  7);
        assert.strictEqual(nthSmallest(          [-5,-1,-6,-18], 4), -1);
        assert.strictEqual(nthSmallest([-102,-16,-1,-2,-367,-9], 5), -2);
        assert.strictEqual(nthSmallest(      [2,169,13,-5,0,-1], 4),  2);
        assert.strictEqual(nthSmallest(           [2,1,3,3,1,2], 3),  2);
    });
});