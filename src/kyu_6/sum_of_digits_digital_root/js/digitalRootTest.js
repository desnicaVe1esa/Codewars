const chai = require("chai");
const digitalRoot = require("./digitalRoot");
const assert = chai.assert;
chai.config.truncateThreshold=0;

describe("Tests", () => {
    it("test", () => {
        assert.strictEqual( digitalRoot(16), 7 )
        assert.strictEqual( digitalRoot(456), 6 )
    });
});