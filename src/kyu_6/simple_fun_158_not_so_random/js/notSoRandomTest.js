const {assert} = require("chai");
const notSoRandom = require("./notSoRandom");

describe("Basic Tests", function(){
    it("It should works for basic tests.", function(){
        assert.strictEqual(notSoRandom(1,1),"Black",`notSoRandom(1,1)`);
        assert.strictEqual(notSoRandom(2,1),"White",`notSoRandom(2,1)`);
        assert.strictEqual(notSoRandom(1,2),"Black",`notSoRandom(1,2)`);
        assert.strictEqual(notSoRandom(2,2),"White",`notSoRandom(2,2)`);
        assert.strictEqual(notSoRandom(6,9),"White",`notSoRandom(6,9)`);
        assert.strictEqual(notSoRandom(10000,10000),"White",`notSoRandom(11111,22222)`);
        assert.strictEqual(notSoRandom(11111,22222),"Black",`notSoRandom(11111,22222)`);
    });
});