const chai = require("chai");
const mouthSize = require("./mouthSize");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("The Wide-Mouthed frog! ", () => {
    it("Testing for fixed tests", () => {
        assert.strictEqual(mouthSize("toucan"),"wide")
        assert.strictEqual(mouthSize("ant bear"),"wide")
        assert.strictEqual(mouthSize("alligator"),"small")
    })
})