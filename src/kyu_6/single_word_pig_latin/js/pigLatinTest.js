const chai = require("chai");
const pigLatin = require("./pigLatin");
const assert = chai.assert;
chai.config.truncateThreshold = 0;

describe("Sample Tests", () => {
    it("Test", () => {
        assert.strictEqual(pigLatin("map"), "apmay");
        assert.strictEqual(pigLatin("egg"), "eggway");
        assert.strictEqual(pigLatin("tes3t5"), null);
    });
});
