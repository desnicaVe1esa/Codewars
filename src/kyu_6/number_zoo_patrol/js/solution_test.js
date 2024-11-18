const Test = require('@codewars/test-compat');

const {assert} = require("chai");

describe("Fixed tests", () => {
    it("Tests", () => {
        assert.equal(findNumber([1,3,4,5,6,7,8]), 2);
        assert.equal(findNumber([7,8,1,2,4,5,6]), 3);
        assert.equal(findNumber([1,2,3,5]), 4);
        assert.equal(findNumber([1,3]), 2);
        assert.equal(findNumber([2,3,4]), 1);
        assert.equal(findNumber([13,11,10,3,2,1,4,5,6,9,7,8]), 12);
        assert.equal(findNumber([1,2,3]), 4);
    });
});