const chai = require("chai");
const countBy = require("./countBy");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic Tests",function(){
    it("Testing for fixed tests", () => {
        assert.deepEqual(countBy(1,10), [1,2,3,4,5,6,7,8,9,10], "Array does not match")
        assert.deepEqual(countBy(2,5), [2,4,6,8,10], "Array does not match")
    });
});
