const chai = require("chai");
const getLengthOfMissingArray = require("./getLengthOfMissingArray");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("KataTests", function(){
    it("Basic Tests", function(){
        assert.strictEqual(getLengthOfMissingArray([ [ 1, 2 ], [ 4, 5, 1, 1 ], [ 1 ], [ 5, 6, 7, 8, 9 ]] ), 3);
        assert.strictEqual(getLengthOfMissingArray([ [ 5, 2, 9 ], [ 4, 5, 1, 1 ], [ 1 ], [ 5, 6, 7, 8, 9 ]] ), 2);
        assert.strictEqual(getLengthOfMissingArray([ [ null ], [ null, null, null ] ] ), 2);
        assert.strictEqual(getLengthOfMissingArray([ [ 'a', 'a', 'a' ], [ 'a', 'a' ], [ 'a', 'a', 'a', 'a' ], [ 'a' ], [ 'a', 'a', 'a', 'a', 'a', 'a' ]] ), 5);

        assert.strictEqual(getLengthOfMissingArray([ ]), 0);
    });
});