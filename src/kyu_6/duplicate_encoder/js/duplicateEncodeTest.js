const chai = require("chai");
const duplicateEncode = require("./duplicateEncode");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Duplicate Encoder", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(duplicateEncode("din"),"(((");
        assert.strictEqual(duplicateEncode("recede"),"()()()");
        assert.strictEqual(duplicateEncode("Success"),")())())","should ignore case");
        assert.strictEqual(duplicateEncode("(( @"),"))((");
    });
});