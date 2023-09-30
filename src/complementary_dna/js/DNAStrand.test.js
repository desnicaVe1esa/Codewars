const chai = require("chai");
const DNAStrand = require("./DNAStrand");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Basic tests", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(DNAStrand("AAAA"),"TTTT","String AAAA is")
        assert.strictEqual(DNAStrand("ATTGC"),"TAACG","String ATTGC is")
        assert.strictEqual(DNAStrand("GTAT"),"CATA","String GTAT is")
    })
})