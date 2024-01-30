const chai=require('chai')
const sqInRect = require("./sqInRect");
const assert=chai.assert
chai.config.truncateThreshold = 0;

describe("Basic tests",function(){
    it("Basic tests",function(){
        assert.deepEqual(sqInRect(5, 5), null)
        assert.deepEqual(sqInRect(5, 3), [3, 2, 1, 1])
        assert.deepEqual(sqInRect(3, 5), [3, 2, 1, 1])
        assert.deepEqual(sqInRect(20, 14), [14, 6, 6, 2, 2, 2])
    })
});