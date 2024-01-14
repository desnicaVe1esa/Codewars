const chai = require("chai");
const reverseSeq = require("./reverseSeq");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("reverseSeq", function() {
    it("Sample Test", function() {
        assert.deepEqual(reverseSeq(5), [5, 4, 3, 2, 1]);
    });
});