const chai = require("chai");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Tests", () => {
    it("test", () => {
        assert.strictEqual(SequenceSum.showSequence(6),"0+1+2+3+4+5+6 = 21")
    });
});
