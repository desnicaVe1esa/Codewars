const chai = require("chai");
const twiceAsOld = require("./twiceAsOld");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Sample tests", function(){
    it("Testing for dad's age: 36 and son's age: 7", function(){
        assert.strictEqual(twiceAsOld(36,7) , 22);
    });
    it("Testing for dad's age: 55 and son's age: 30", function(){
        assert.strictEqual(twiceAsOld(55,30) , 5);
    });
    it("Testing for dad's age: 42 and son's age: 21", function(){
        assert.strictEqual(twiceAsOld(42,21) , 0);
    });
    it("Testing for dad's age: 22 and son's age: 1", function(){
        assert.strictEqual(twiceAsOld(22,1) , 20);
    });
    it("Testing for dad's age: 29 and son's age: 0", function(){
        assert.strictEqual(twiceAsOld(29,0) , 29);
    });
});